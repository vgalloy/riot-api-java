package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.client.filter.RiotRateLimitExceededException;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class ChampionMasteryApiTest extends AbstractTest {

    @Test
    public void testChampionMasteries() {
        new QueryTester("ChampionMasteries")
                .test(riotApi.getChampionMasteryByChampion(24550736, 7).region(Region.euw))
                .test(riotApi.getChampionMasteryByChampion(67911140, 103).region(Region.na))
                .test(riotApi.getChampionMasteryByChampion(17671075, 99).region(Region.kr))
                .end();
    }

    @Test
    public void testChampionMasteriesList() {
        new QueryTester("ChampionMasteriesList")
                .test(riotApi.getChampionMastery(24550736).region(Region.euw))
                .test(riotApi.getChampionMastery(67911140).region(Region.na))
                .test(riotApi.getChampionMastery(17671075).region(Region.kr))
                .end();
    }

    @Test
    public void testGetChampionScore() {
        new QueryTester("ChampionScore")
                .test(riotApi.getPlayerScore(24550736).region(Region.euw))
                .test(riotApi.getPlayerScore(24550736).region(Region.na))
                .test(riotApi.getPlayerScore(24550736).region(Region.kr))
                .end();
    }

    @Test
    public void testGetTopChampion() {
        new QueryTester("TopChampion")
                .test(riotApi.getTopChampion(24550736).region(Region.euw))
                .test(riotApi.getTopChampion(24550736).region(Region.na))
                .test(riotApi.getTopChampion(24550736).region(Region.kr))
                .end();
    }
}
