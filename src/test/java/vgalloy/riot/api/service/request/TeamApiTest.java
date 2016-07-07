package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class TeamApiTest extends AbstractTest {

    @Test
    public void testGetTeamsBySummonerIds() {
        new QueryTester("TeamsBySummonerIds")
                .test(riotApi.getTeamsBySummonerIds(24550736).addSummonerIds(24541689).region(Region.euw))
                .test(riotApi.getTeamsBySummonerIds(67911140).region(Region.na))
                .end();
    }

    @Test
    public void testGetTeamsByTeamIds() {
        new QueryTester("TeamsByTeamIds")
                .test(riotApi.getTeamsByTeamIds("TEAM-81bd709f-9ff6-4df9-b332-bd7e48003b6d").region(Region.euw))
                .end();
    }
}
