package vgalloy.riot.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class MatchApiTest extends AbstractTest {

    @Test
    public void testGetMatchDetailById() {
        new QueryTester("MatchDetailById")
                .test(riotApi.getMatchDetailById(2676786126L).region(Region.EUW))
                .test(riotApi.getMatchDetailById(2198433583L).region(Region.NA))
                .test(riotApi.getMatchDetailById(2426412348L).region(Region.KR))
                .end();
    }

    @Test
    @Ignore
    public void testGetMatchIdByTournamentCodeList() {
        new QueryTester("MatchIdByTournamentCodeList")
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.EUW))
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.NA))
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.KR))
                .end();
    }

    @Test
    public void testGetTournamentMatchDetailById() {
        new QueryTester("TournamentMatchDetailById")
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.EUW))
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.NA))
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.KR))
                .end();
    }
}
