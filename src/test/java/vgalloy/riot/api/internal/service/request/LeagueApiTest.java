package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class LeagueApiTest extends AbstractTest {

    @Test
    public void testGetLeaguesBySummonerIds() {
        new QueryTester("LeaguesBySummonerIds")
            .test(RIOT_API.getLeaguesBySummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getLeaguesBySummonerIds(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetLeaguesEntryBySummonerIds() {
        new QueryTester("LeaguesEntryBySummonerIds")
            .test(RIOT_API.getLeaguesEntryBySummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getLeaguesEntryBySummonerIds(67911140).region(Region.NA))
            .end();
    }

    @Test
    public void testGetLeaguesByTeamIds() {
        new QueryTester("LeaguesByTeamIds")
            .test(RIOT_API.getLeaguesByTeamIds("TEAM-13645e00-2512-11e2-b630-782bcb4ce61a").region(Region.EUW))
            .end();
    }

    @Test
    public void testGetLeaguesEntryByTeamIds() {
        new QueryTester("LeaguesEntryByTeamIds")
            .test(RIOT_API.getLeaguesEntryByTeamIds("TEAM-13645e00-2512-11e2-b630-782bcb4ce61a").region(Region.EUW))
            .end();
    }

    @Test
    public void testGetChallenger() {
        new QueryTester("Challenger")
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_SOLO_5x5).region(Region.EUW))
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_TEAM_3x3).region(Region.NA))
            .test(RIOT_API.getChallenger(LeagueQueueType.RANKED_TEAM_5x5).region(Region.KR))
            .end();
    }

    @Test
    public void testGetMaster() {
        new QueryTester("Master")
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_SOLO_5x5).region(Region.EUW))
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_SOLO_5x5).region(Region.NA))
            .test(RIOT_API.getMaster(LeagueQueueType.RANKED_FLEX_SR).region(Region.KR))
            .end();
    }
}