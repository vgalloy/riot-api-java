package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.api.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
public final class TeamApiTest extends AbstractTest {

    @Test
    public void testGetTeamsBySummonerIds() {
        new QueryTester("TeamsBySummonerIds")
            .test(RIOT_API.getTeamsBySummonerIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getTeamsBySummonerIds(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetTeamsByTeamIds() {
        new QueryTester("TeamsByTeamIds")
            .test(RIOT_API.getTeamsByTeamIds("TEAM-81bd709f-9ff6-4df9-b332-bd7e48003b6d").region(Region.EUW))
            .end();
    }
}
