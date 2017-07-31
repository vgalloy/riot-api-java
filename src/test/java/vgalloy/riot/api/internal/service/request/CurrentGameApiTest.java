package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.api.dto.featuredgame.FeaturedGameInfo;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class CurrentGameApiTest extends AbstractTest {

    @Test
    public void testGetCurrentGameInfo() {
        try {
            FeaturedGameInfo featuredGameInfo = RIOT_API.getFeatureGame()
                .region(Region.EUW)
                .execute()
                .getGameList()
                .get(0);
            String summonerName = featuredGameInfo.getParticipants().get(0).getSummonerName();
            long summonerId = RIOT_API.getSummonerByNames(summonerName.toLowerCase())
                .region(Region.EUW)
                .execute()
                .get(summonerName.toLowerCase().replaceAll("\\s+", "")).getId();
            QueryTester.of(this.getClass().getSimpleName() + "::CurrentGameInfo")
                .test(RIOT_API.getCurrentGameInfo(summonerId).region(Region.EUW))
                .end();
        } catch (Exception ignored) {
            QueryTester.of(this.getClass().getSimpleName() + "::CurrentGameInfo").end(400);
        }
    }
}