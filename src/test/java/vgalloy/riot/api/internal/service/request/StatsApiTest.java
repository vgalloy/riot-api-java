package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class StatsApiTest extends AbstractTest {

    @Test
    public void testGetPlayerStatsSummary() {
        QueryTester.of(this.getClass().getSimpleName() + "::PlayerStatsSummary")
            .test(RIOT_API.getPlayerStatsSummary(24550736).region(Region.EUW))
            .test(RIOT_API.getPlayerStatsSummary(67911140).region(Region.NA))
            .test(RIOT_API.getPlayerStatsSummary(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetRankedStats() {
        QueryTester.of(this.getClass().getSimpleName() + "::RankedStats")
            .test(RIOT_API.getRankedStats(24550736).region(Region.EUW))
            .test(RIOT_API.getRankedStats(67911140).region(Region.NA))
            .end();
    }
}
