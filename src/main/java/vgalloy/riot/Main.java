package vgalloy.riot;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.service.RiotApi;
import vgalloy.riot.service.RiotApiKey;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class Main {

    /**
     * Main method. Just here for example.
     *
     * @param args command line arguments
     * @throws Exception exception
     */
    public static void main(String... args) throws Exception {

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        RiotApiKey riotApiKey = new RiotApiKey(properties);

        RiotApi riotApi = new RiotApi(new RateLimit(10, 10_000), new RateLimit(500, 10 * 60 * 1000));
        riotApi.defaultRiotApiKey(riotApiKey)
                .defaultRegion(Region.EUW);

        riotApi.getChampionList();

    }
}
