package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.RankedQueueType;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class LeagueApiTest extends AbstractTest {

    @Test
    public void testGetLeaguesBySummonerIds() {
        new QueryTester("LeaguesBySummonerIds")
                .test(riotApi.getLeaguesBySummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getLeaguesBySummonerIds(67911140).region(Region.NA))
                .end();
    }

    @Test
    public void testGetLeaguesEntryBySummonerIds() {
        new QueryTester("LeaguesEntryBySummonerIds")
                .test(riotApi.getLeaguesEntryBySummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getLeaguesEntryBySummonerIds(67911140).region(Region.NA))
                .end();
    }

    @Test
    public void testGetLeaguesByTeamIds() {
        new QueryTester("LeaguesByTeamIds")
                .test(riotApi.getLeaguesByTeamIds("TEAM-13645e00-2512-11e2-b630-782bcb4ce61a").region(Region.EUW))
                .end();
    }

    @Test
    public void testGetLeaguesEntryByTeamIds() {
        new QueryTester("LeaguesEntryByTeamIds")
                .test(riotApi.getLeaguesEntryByTeamIds("TEAM-13645e00-2512-11e2-b630-782bcb4ce61a").region(Region.EUW))
                .end();
    }

    @Test
    public void testGetChallenger() {
        new QueryTester("Challenger")
                .test(riotApi.getChallenger(RankedQueueType.RANKED_SOLO_5x5).region(Region.EUW))
                .test(riotApi.getChallenger(RankedQueueType.RANKED_TEAM_3x3).region(Region.NA))
                .test(riotApi.getChallenger(RankedQueueType.RANKED_TEAM_5x5).region(Region.KR))
                .end();
    }

    @Test
    public void testGetMaster() {
        new QueryTester("Master")
                .test(riotApi.getMaster(RankedQueueType.RANKED_SOLO_5x5).region(Region.EUW))
                .test(riotApi.getMaster(RankedQueueType.RANKED_TEAM_3x3).region(Region.NA))
                .test(riotApi.getMaster(RankedQueueType.RANKED_TEAM_5x5).region(Region.KR))
                .end();
    }
}