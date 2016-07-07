package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class StatsApiTest extends AbstractTest {

    @Test
    public void testGetPlayerStatsSummary() {
        new QueryTester("PlayerStatsSummary")
                .test(riotApi.getPlayerStatsSummary(24550736).region(Region.euw))
                .test(riotApi.getPlayerStatsSummary(67911140).region(Region.na))
                .test(riotApi.getPlayerStatsSummary(17671075).region(Region.kr))
                .end();
    }

    @Test
    public void testGetRankedStats() {
        new QueryTester("RankedStats")
                .test(riotApi.getRankedStats(24550736).region(Region.euw))
                .test(riotApi.getRankedStats(67911140).region(Region.na))
                .test(riotApi.getRankedStats(17671075).region(Region.kr))
                .end();
    }
}
