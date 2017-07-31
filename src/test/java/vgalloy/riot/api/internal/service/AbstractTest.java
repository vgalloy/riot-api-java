package vgalloy.riot.api.internal.service;

import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.api.api.factory.RiotApiFactory;
import vgalloy.riot.api.api.model.RateLimit;
import vgalloy.riot.api.api.model.RiotApi;
import vgalloy.riot.api.api.model.RiotApiKey;
import vgalloy.riot.api.api.query.AbstractCallbackQuery;
import vgalloy.riot.api.api.query.Query;
import vgalloy.riot.api.internal.service.request.ChampionApiTest;

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
                .addGlobalRateLimit(new RateLimit(4, 10_000), new RateLimit(400, 10 * 60 * 1_000))
                .defaultRiotApiKey(new RiotApiKey(properties));
    }
}