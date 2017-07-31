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
public final class TeamApiTest extends AbstractTest {

    @Test
    public void testGetTeamsBySummonerIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::TeamsBySummonerIds")
            .test(RIOT_API.getTeamsBySummonerIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getTeamsBySummonerIds(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetTeamsByTeamIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::TeamsByTeamIds")
            .test(RIOT_API.getTeamsByTeamIds("TEAM-81bd709f-9ff6-4df9-b332-bd7e48003b6d").region(Region.EUW))
            .end();
    }
}
