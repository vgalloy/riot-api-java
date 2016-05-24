package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GameApiTest extends AbstractTest {

    @Test
    public void testGetRecentGame() {
        new QueryTester("RecentGame")
                .test(riotApi.getRecentGame(24550736).region(Region.EUW))
                .test(riotApi.getRecentGame(67911140).region(Region.NA))
                .test(riotApi.getRecentGame(17671075).region(Region.KR))
                .end();
    }
}