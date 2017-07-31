package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class LeagueApiTest extends AbstractTest {

    @Test
    public void testGetLeaguesBySummonerIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::LeaguesBySummonerIds")
            .test(RIOT_API.getLeaguesBySummonerId(24541689).region(Region.EUW))
            .test(RIOT_API.getLeaguesBySummonerId(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetLeaguesEntryBySummonerIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::LeaguesEntryBySummonerIds")
            .test(RIOT_API.getLeaguesPositionBySummonerId(24541689).region(Region.EUW))
            .test(RIOT_API.getLeaguesPositionBySummonerId(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetChallenger() {
        QueryTester.of(this.getClass().getSimpleName() + "::Challenger")
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_SOLO_5x5).region(Region.EUW))
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_FLEX_TT).region(Region.NA))
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_FLEX_SR).region(Region.KR))
            .end();
    }

    @Test
    public void testGetMaster() {
        QueryTester.of(this.getClass().getSimpleName() + "::Master")
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_SOLO_5x5).region(Region.EUW))
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_SOLO_5x5).region(Region.NA))
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_FLEX_SR).region(Region.KR))
            .end();
    }
}