package vgalloy.riot.service;

import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.service.request.ChampionApiTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public abstract class AbstractTest {

    protected RiotApi riotApi = new RiotApi(new RateLimit(9, 10_000), new RateLimit(500, 10 * 60 * 1_000));

    public AbstractTest() {
        InputStream inputStream = ChampionApiTest.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Can not load properties");
        }
        riotApi.setDefaultRiotApiKey(new RiotApiKey(properties));
    }
}
