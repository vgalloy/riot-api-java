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
public final class MatchApiTest extends AbstractTest {

    @Test
    public void testGetMatchDetailById() {
        QueryTester.of(this.getClass().getSimpleName() + "::MatchDetailById")
            .test(RIOT_API.getMatchDetailById(2676786126L).region(Region.EUW))
            .test(RIOT_API.getMatchDetailById(2198433583L).region(Region.NA))
            .test(RIOT_API.getMatchDetailById(2426412348L).region(Region.KR))
            .end();
    }

    @Test
    public void testGetMatchIdByTournamentCodeList() {
        QueryTester.of(this.getClass().getSimpleName() + "::MatchIdByTournamentCodeList")
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.EUW))
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.NA))
            .test(RIOT_API.getMatchIdByTournamentCodeList("5000").region(Region.KR))
            .end();
    }

    @Test
    public void testGetTournamentMatchDetailById() {
        QueryTester.of(this.getClass().getSimpleName() + "::TournamentMatchDetailById")
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.EUW))
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.NA))
            .test(RIOT_API.getTournamentMatchDetailById(5000).region(Region.KR))
            .end();
    }
}
