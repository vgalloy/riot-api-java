package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class ChampionMasteryApiTest extends AbstractTest {

    @Test
    public void testChampionMasteries() {
        new QueryTester("ChampionMasteries")
                .test(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.EUW))
                .test(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.NA))
                .test(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.KR))
                .end();
    }

    @Test
    public void testChampionMasteriesList() {
        new QueryTester("ChampionMasteriesList")
                .test(riotApi.getChampionMastery(24550736).region(Region.EUW))
                .test(riotApi.getChampionMastery(24550736).region(Region.NA))
                .test(riotApi.getChampionMastery(24550736).region(Region.KR))
                .end();
    }

    @Test
    public void testGetChampionScore() {
        new QueryTester("ChampionScore")
                .test(riotApi.getPlayerScore(24550736).region(Region.EUW))
                .test(riotApi.getPlayerScore(24550736).region(Region.NA))
                .test(riotApi.getPlayerScore(24550736).region(Region.KR))
                .end();
    }

    @Test
    public void testGetTopChampion() {
        new QueryTester("TopChampion")
                .test(riotApi.getTopChampion(24550736).region(Region.EUW))
                .test(riotApi.getTopChampion(24550736).region(Region.NA))
                .test(riotApi.getTopChampion(24550736).region(Region.KR))
                .end();
    }
}
