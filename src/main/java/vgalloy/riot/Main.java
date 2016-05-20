package vgalloy.riot;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.RiotWebApiFactory;
import vgalloy.riot.service.RiotApiKey;

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

        RiotWebApi riotWebApi = RiotWebApiFactory.getRiotWebApi();

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

//        System.out.println(riotWebApi.getChallenger(Region.EUW, riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getMaster(Region.EUW, riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getLeaguesEntryBySummonerIds(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getLeaguesBySummonerIds(Region.EUW, "24541689,24550736", riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getLeaguesEntryByTeam(Region.EUW, "45663", riotApiKey.getApiKey()));
//        System.out.println(riotWebApi.getLeaguesByTeam(Region.EUW, "45663", riotApiKey.getApiKey()));
        // FIXME: 19/05/16
//                System.out.println(riotWebApi.getLeaguesBySummonerIds(Region.EUW, "24541689", riotApiKey.getApiKey()));
        //        System.out.println(riotWebApi.getCurrentGame(PlatformId.EUW1, "24541689", riotApiKey.getApiKey()));

//        RiotApi riotApi = new RiotApi();
//        riotApi.setDefaultRiotApiKey(riotApiKey);
//        riotApi.setDefaultRegion(Region.EUW);
//        GetChampionListQuery getChampionListQuery = riotApi.getChampionList();
//        ChampionListDto championDto = getChampionListQuery.execute();
//        System.out.println(championDto);

    }
}
