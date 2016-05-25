package vgalloy.riot.service.request;

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
                .test(riotApi.getMatchDetailById(25252525).region(Region.EUW))
                .test(riotApi.getMatchDetailById(25252525).region(Region.NA))
                .test(riotApi.getMatchDetailById(25252525).region(Region.KR))
                .end();
    }

    @Test
    public void testGetMatchIdList() {
        new QueryTester("MatchIdList")
                .test(riotApi.getMatchIdList(5000).region(Region.EUW))
                .test(riotApi.getMatchIdList(5000).region(Region.NA))
                .test(riotApi.getMatchIdList(5000).region(Region.KR))
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
