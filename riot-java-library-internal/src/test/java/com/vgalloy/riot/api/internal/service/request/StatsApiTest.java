package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
public final class StatsApiTest extends AbstractTest {

    @Test
    public void testGetPlayerStatsSummary() {
        new QueryTester("PlayerStatsSummary")
            .test(RIOT_API.getPlayerStatsSummary(24550736).region(Region.EUW))
            .test(RIOT_API.getPlayerStatsSummary(67911140).region(Region.NA))
            .test(RIOT_API.getPlayerStatsSummary(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetRankedStats() {
        new QueryTester("RankedStats")
            .test(RIOT_API.getRankedStats(24550736).region(Region.EUW))
            .test(RIOT_API.getRankedStats(67911140).region(Region.NA))
            .end();
    }
}
