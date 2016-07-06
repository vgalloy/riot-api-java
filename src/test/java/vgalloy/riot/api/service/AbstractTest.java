package vgalloy.riot.api.service;

import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.api.client.ratelimite.model.RateLimit;
import vgalloy.riot.api.service.query.AbstractCallbackQuery;
import vgalloy.riot.api.service.request.ChampionApiTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public abstract class AbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTest.class);

    protected static final RiotApi riotApi;

    static {
        InputStream inputStream = ChampionApiTest.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (Exception e) {
            LOGGER.error("Can not load properties");
        }
        riotApi = new RiotApi()
                .addGlobalRateLimit(new RateLimit(9, 10_000), new RateLimit(400, 10 * 60 * 1_000))
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
        public QueryTester test(AbstractCallbackQuery query) {
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
            StringBuilder stringBuilder = new StringBuilder(queryName + " ");
            IntStream.range(queryName.length(), 30).asLongStream().forEach(e -> stringBuilder.append("."));
            String message = stringBuilder.append(" [ ").append(code).append(" ]").toString();
            if ("200".equals(code)) {
                LOGGER.info("{}", message);
            } else if ( "403".equals(code) ) {
                LOGGER.error("{}", message);
            } else {
                LOGGER.warn("{}", message);
            }
        }
    }
}