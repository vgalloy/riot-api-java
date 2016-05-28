package vgalloy.riot.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.api.client.ratelimite.RateLimit;
import vgalloy.riot.api.service.RiotApi;
import vgalloy.riot.api.service.RiotApiKey;
import vgalloy.riot.api.service.query.AbstractCallbackQuery;
import vgalloy.riot.service.request.ChampionApiTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public abstract class AbstractTest {

    protected final RiotApi riotApi = new RiotApi(new RateLimit(9, 10_000), new RateLimit(400, 10 * 60 * 1_000));

    public AbstractTest() {
        InputStream inputStream = ChampionApiTest.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Can not load properties");
        }
        riotApi.defaultRiotApiKey(new RiotApiKey(properties));
    }

    protected class QueryTester {

        private final Logger logger = LoggerFactory.getLogger(QueryTester.class);
        private final String queryName;
        private boolean isSuccess = true;
        private String code = "200";

        public QueryTester(String queryName) {
            this.queryName = Objects.requireNonNull(queryName, "queryName can not be null");
        }

        /*
         * assert the query is correct.
         *
         * @return this
         */
        public QueryTester test(AbstractCallbackQuery query) {
            if (query.onInternalServerErrorException(e -> code = "500")
                    .onServiceUnavailableException(e -> code = "503")
                    .execute() == null) {
                isSuccess = false;
                code = "404";
            }
            return this;
        }

        /**
         * End the assertion.
         */
        public void end() {
            StringBuilder stringBuilder = new StringBuilder(queryName + " ");
            IntStream.range(queryName.length(), 30).asLongStream().forEach(e -> stringBuilder.append("."));
            String message = stringBuilder.append(" [ " + code + " ]").toString();
            if (isSuccess) {
                logger.info("{}", message);
            } else {
                logger.warn("{}", message);
            }
        }
    }
}
