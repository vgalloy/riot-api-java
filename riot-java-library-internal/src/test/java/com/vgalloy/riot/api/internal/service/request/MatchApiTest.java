package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.api.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
public final class MatchApiTest extends AbstractTest {

    @Test
    public void testGetMatchDetailById() {
        new QueryTester("MatchDetailById")
            .test(RIOT_API.getMatchDetailById(2676786126L).region(Region.EUW))
            .test(RIOT_API.getMatchDetailById(2198433583L).region(Region.NA))
            .test(RIOT_API.getMatchDetailById(2426412348L).region(Region.KR))
            .end();
    }

    @Test
    public void testGetMatchIdByTournamentCodeList() {
        new QueryTester("MatchIdByTournamentCodeList")
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.EUW))
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.NA))
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.KR))
            .end();
    }

    @Test
    public void testGetTournamentMatchDetailById() {
        new QueryTester("TournamentMatchDetailById")
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.EUW))
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.NA))
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.KR))
            .end();
    }
}
