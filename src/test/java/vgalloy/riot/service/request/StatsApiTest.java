package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class StatsApiTest extends AbstractTest {

    @Test
    public void testGetPlayerStatsSummary() {
        new QueryTester("PlayerStatsSummary")
                .test(riotApi.getPlayerStatsSummary(24550736).region(Region.EUW))
                .test(riotApi.getPlayerStatsSummary(67911140).region(Region.NA))
                .test(riotApi.getPlayerStatsSummary(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonerRankedStats() {
        new QueryTester("SummonerRankedStats")
                .test(riotApi.getSummonerRankedStats(24550736).region(Region.EUW))
                .test(riotApi.getSummonerRankedStats(67911140).region(Region.NA))
                .test(riotApi.getSummonerRankedStats(17671075).region(Region.KR))
                .end();
    }
}
