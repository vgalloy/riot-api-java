package vgalloy.riotapijava;

import java.io.InputStream;
import java.util.Properties;
import vgalloy.riotapijava.service.RiotApiFactory;
import vgalloy.riotapijava.service.RiotApiKey;
import vgalloy.riotapijava.service.RiotWebApi;

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

        /** CHAMPION API **/
        //        System.out.println(riotWebApi.getChampionList(Region.EUW, riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getChampionById(Region.EUW, 11L, riotApiKey.getApiKey()));

        /** CHAMPION MASTERY **/
        //        System.out.println(riotWebApi.getChampionMasteryByChampion(PlatformId.EUW1, "24541689", "111", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getChampionMastery(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getPlayerScore(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getTopChampion(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));

        /** FEATURE GAME API **/
        //        System.out.println(riotWebApi.getFeaturedGame(riotApiKey.getApiKey()));

        /** GAME API **/
        //        System.out.println(riotWebApi.getRecentGame("24541689", riotApiKey.getApiKey()));

        /** SUMMONER API **/
        //        System.out.println(riotWebApi.getSummonerByNames(Region.EUW, "Ivaranne", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getSummonerByIds(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getSummonerMasteries(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getSummonerName(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getSummonerRunes(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));

        /** TEST or doesn't work **/
        // FIXME: 19/05/16
        //        System.out.println(riotWebApi.getCurrentGame(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));

    }
}
