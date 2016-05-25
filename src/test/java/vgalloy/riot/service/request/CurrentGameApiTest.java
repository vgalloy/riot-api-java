package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.featuredgame.dto.FeaturedGameInfo;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class CurrentGameApiTest extends AbstractTest {

    @Test
    public void testGetCurrentGameInfo() {
        FeaturedGameInfo featuredGameInfo = riotApi.getFeatureGame()
                .region(Region.EUW)
                .execute()
                .getGameList()
                .get(0);
        String summonerName = featuredGameInfo.getParticipants().get(0).getSummonerName();
        long summonerId = riotApi.getSummonerByNames(summonerName.toLowerCase())
                .region(Region.EUW)
                .execute()
                .get(summonerName.toLowerCase()).getId();

        new QueryTester("CurrentGameInfo")
                .test(riotApi.getCurrentGameInfo(summonerId).region(Region.EUW))
                .end();
    }
}