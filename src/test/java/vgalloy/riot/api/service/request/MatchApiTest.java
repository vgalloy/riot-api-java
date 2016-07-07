package vgalloy.riot.api.service.request;

import org.junit.Test;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class MatchApiTest extends AbstractTest {

    @Test
    public void testGetMatchDetailById() {
        new QueryTester("MatchDetailById")
                .test(riotApi.getMatchDetailById(2676786126L).region(Region.euw))
                .test(riotApi.getMatchDetailById(2198433583L).region(Region.na))
                .test(riotApi.getMatchDetailById(2426412348L).region(Region.kr))
                .end();
    }

    @Test
    public void testGetMatchIdByTournamentCodeList() {
        new QueryTester("MatchIdByTournamentCodeList")
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.euw))
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.na))
                .test(riotApi.getMatchIdByTournamentCodeList("5000").region(Region.kr))
                .end();
    }

    @Test
    public void testGetTournamentMatchDetailById() {
        new QueryTester("TournamentMatchDetailById")
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.euw))
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.na))
                .test(riotApi.getTournamentMatchDetailById(5000).region(Region.kr))
                .end();
    }
}
