package vgalloy.riot.service.request;

import org.junit.Ignore;
import org.junit.Test;
import vgalloy.riot.api.dto.constant.QueueType;
import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class LeagueApiTest extends AbstractTest {

    @Test
    public void testGetLeaguesBySummonerIds() {
        System.out.println(riotApi.getLeaguesBySummonerIds(24541689).region(Region.EUW).execute());
        System.out.println(riotApi.getLeaguesBySummonerIds(67911140).region(Region.NA).execute());
        System.out.println(riotApi.getLeaguesBySummonerIds(17671075).region(Region.KR).execute());
    }

    @Test
    public void testGetLeaguesEntryBySummonerIds() {
        System.out.println(riotApi.getLeaguesEntryBySummonerIds(24541689).region(Region.EUW).execute());
        System.out.println(riotApi.getLeaguesEntryBySummonerIds(67911140).region(Region.NA).execute());
        System.out.println(riotApi.getLeaguesEntryBySummonerIds(17671075).region(Region.KR).execute());
    }

    @Test
    @Ignore
    public void testGetLeaguesByTeamIds() {
        System.out.println(riotApi.getLeaguesByTeamIds(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getLeaguesByTeamIds(67911140).region(Region.NA).execute());
        System.out.println(riotApi.getLeaguesByTeamIds(17671075).region(Region.KR).execute());
    }

    @Test
    @Ignore
    public void testGetLeaguesEntryByTeamIds() {
        System.out.println(riotApi.getLeaguesEntryByTeamIds(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getLeaguesEntryByTeamIds(67911140).region(Region.NA).execute());
        System.out.println(riotApi.getLeaguesEntryByTeamIds(17671075).region(Region.KR).execute());
    }

    @Test
    public void testGetChallenger() {
        System.out.println(riotApi.getChallenger(QueueType.RANKED_SOLO_5x5).region(Region.EUW).execute());
        System.out.println(riotApi.getChallenger(QueueType.RANKED_TEAM_3x3).region(Region.NA).execute());
        System.out.println(riotApi.getChallenger(QueueType.RANKED_TEAM_5x5).region(Region.KR).execute());
    }

    @Test
    public void testGetMaster() {
        System.out.println(riotApi.getMaster(QueueType.RANKED_SOLO_5x5).region(Region.EUW).execute());
        System.out.println(riotApi.getMaster(QueueType.RANKED_TEAM_3x3).region(Region.NA).execute());
        System.out.println(riotApi.getMaster(QueueType.RANKED_TEAM_5x5).region(Region.KR).execute());
    }
}