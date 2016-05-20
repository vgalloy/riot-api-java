package vgalloy.riotapijava;

import vgalloy.riotapijava.dto.constant.Region;
import vgalloy.riotapijava.service.RiotApiFactory;
import vgalloy.riotapijava.service.RiotApiKey;
import vgalloy.riotapijava.service.RiotWebApi;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class Main {

    /**
     * Main method. Just here for test.
     *
     * @param args command line arguments
     * @throws Exception exception
     */
    public static void main(String... args) throws Exception {

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        RiotApiKey riotApiKey = new RiotApiKey(properties);

        RiotWebApi riotWebApi = RiotApiFactory.getRiotWebApi();

        System.out.println(riotWebApi.getSummonerName(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getRecentGame("24541689", riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getChampionById(Region.EUW, 111L, riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getChampionList(Region.EUW, riotApiKey.getApiKey()).getChampions().get(111));
        System.out.println(riotWebApi.getFeaturedGame(riotApiKey.getApiKey()));
        // FIXME: 19/05/16
//        System.out.println(riotWebApi.getCurrentGame(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));
    }
}
