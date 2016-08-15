package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.rest.request.currentgame.dto.CurrentGameInfo;
import vgalloy.riot.api.rest.request.featuredgame.dto.FeaturedGameInfo;
import vgalloy.riot.api.service.AbstractTest;
import vgalloy.riot.api.service.query.AbstractCallbackQuery;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.impl.currentgame.GetCurrentGameInfoQuery;

import javax.ws.rs.BadRequestException;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class CurrentGameApiTest extends AbstractTest {

    @Test
    public void testGetCurrentGameInfo() {
        try {
            FeaturedGameInfo featuredGameInfo = riotApi.getFeatureGame()
                    .region(Region.euw)
                    .execute()
                    .getGameList()
                    .get(0);
            String summonerName = featuredGameInfo.getParticipants().get(0).getSummonerName();
            long summonerId = riotApi.getSummonerByNames(summonerName.toLowerCase())
                    .region(Region.euw)
                    .execute()
                    .get(summonerName.toLowerCase().replaceAll("\\s+", "")).getId();
            new QueryTester("CurrentGameInfo")
                    .test(riotApi.getCurrentGameInfo(summonerId).region(Region.euw))
                    .end();
        } catch (Exception ignored) {
            new QueryTester("CurrentGameInfo").end(400);
        }
    }
}