package vgalloy.riot.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import javax.ws.rs.InternalServerErrorException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.service.callback.Callback;
import vgalloy.riot.service.query.AbstractCallbackQuery;
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

        public QueryTester(String queryName) {
            this.queryName = Objects.requireNonNull(queryName, "queryName can not be null");
        }

        /**
         * assert the query is correct.
         *
         * @return this
         */
        public QueryTester test(AbstractCallbackQuery query) {
            if (query.onInternalServerErrorException(new Callback<InternalServerErrorException>() {
                @Override
                public void process(InternalServerErrorException e) {
                    throw e;
                }
            }).execute() == null) {
                isSuccess = false;
            }
            return this;
        }

        /**
         * End the assertion.
         */
        public void end() {
            if (isSuccess) {
                logger.info("[ OK ] ................... {}.", queryName);
            } else {
                logger.warn("[ KO ] ................... {}.", queryName);
            }
        }
    }
}
