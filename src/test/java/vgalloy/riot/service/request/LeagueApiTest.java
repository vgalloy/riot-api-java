package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.QueueType;
import vgalloy.riot.api.constant.Region;
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
                .test(riotApi.getLeaguesBySummonerIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetLeaguesEntryBySummonerIds() {
        new QueryTester("LeaguesEntryBySummonerIds")
                .test(riotApi.getLeaguesEntryBySummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getLeaguesEntryBySummonerIds(67911140).region(Region.NA))
                .test(riotApi.getLeaguesEntryBySummonerIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetLeaguesByTeamIds() {
        new QueryTester("LeaguesByTeamIds")
                .test(riotApi.getLeaguesByTeamIds(24550736).region(Region.EUW))
                .test(riotApi.getLeaguesByTeamIds(67911140).region(Region.NA))
                .test(riotApi.getLeaguesByTeamIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetLeaguesEntryByTeamIds() {
        new QueryTester("LeaguesEntryByTeamIds")
                .test(riotApi.getLeaguesEntryByTeamIds(24550736).region(Region.EUW))
                .test(riotApi.getLeaguesEntryByTeamIds(67911140).region(Region.NA))
                .test(riotApi.getLeaguesEntryByTeamIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetChallenger() {
        new QueryTester("Challenger")
                .test(riotApi.getChallenger(QueueType.RANKED_SOLO_5x5).region(Region.EUW))
                .test(riotApi.getChallenger(QueueType.RANKED_TEAM_3x3).region(Region.NA))
                .test(riotApi.getChallenger(QueueType.RANKED_TEAM_5x5).region(Region.KR))
                .end();
    }

    @Test
    public void testGetMaster() {
        new QueryTester("Master")
                .test(riotApi.getMaster(QueueType.RANKED_SOLO_5x5).region(Region.EUW))
                .test(riotApi.getMaster(QueueType.RANKED_TEAM_3x3).region(Region.NA))
                .test(riotApi.getMaster(QueueType.RANKED_TEAM_5x5).region(Region.KR))
                .end();
    }
}