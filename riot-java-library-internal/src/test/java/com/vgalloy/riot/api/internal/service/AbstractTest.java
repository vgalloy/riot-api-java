package com.vgalloy.riot.api.internal.service;

import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vgalloy.riot.api.api.factory.RiotApiFactory;
import com.vgalloy.riot.library.api.model.RiotRateLimit;
import com.vgalloy.riot.library.api.model.RiotApi;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.api.api.query.AbstractCallbackQuery;
import com.vgalloy.riot.library.api.query.Query;
import com.vgalloy.riot.api.internal.service.request.ChampionApiTest;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public abstract class AbstractTest {

    protected static final RiotApi RIOT_API;
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTest.class);

    static {
        InputStream inputStream = ChampionApiTest.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (Exception e) {
            LOGGER.error("Can not load properties");
        }
        RIOT_API = RiotApiFactory.newRiotApi()
            .addGlobalRateLimit(new RiotRateLimit(4, 10_000), new RiotRateLimit(400, 10 * 60 * 1_000))
            .defaultRiotApiKey(new RiotApiKey(properties));
    }

    protected class QueryTester {

        private final String queryName;
        private String code = "200";

        /**
         * Constructor.
         *
         * @param queryName the query name
         */
        public QueryTester(String queryName) {
            this.queryName = Objects.requireNonNull(queryName, "queryName can not be null");
        }

        /**
         * Assert the query is correct.
         *
         * @return this
         */
        public QueryTester test(AbstractCallbackQuery<? extends Query<?>, ?> query) {
            query.onBadRequestExceptionCallback(e -> code = "400")
                .onNotAuthorizedException(e -> code = "401")
                .onForbiddenException(e -> code = "403")
                .onNotFoundException(e -> code = "404")
                .onInternalServerErrorException(e -> code = "500")
                .onServiceUnavailableException(e -> code = "503")
                .execute();
            return this;
        }

        /**
         * End the assertion.
         */
        public void end() {
            print(code);
        }

        public void end(int code) {
            print(String.valueOf(code));
        }

        /**
         * Print the result as a formatted String.
         *
         * @param code the code
         */
        private void print(String code) {
            StringBuilder stringBuilder = new StringBuilder(queryName + " ");
            IntStream.range(queryName.length(), 30).asLongStream().forEach(e -> stringBuilder.append("."));
            String message = stringBuilder.append(" [ ").append(code).append(" ]").toString();
            if ("200".equals(code)) {
                LOGGER.info("{}", message);
            } else if ("403".equals(code)) {
                LOGGER.error("{}", message);
            } else {
                LOGGER.warn("{}", message);
            }
        }
    }
}
