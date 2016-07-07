package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GameApiTest extends AbstractTest {

    @Test
    public void testGetRecentGame() {
        new QueryTester("RecentGame")
                .test(riotApi.getRecentGame(24550736).region(Region.euw))
                .test(riotApi.getRecentGame(67911140).region(Region.na))
                .test(riotApi.getRecentGame(17671075).region(Region.kr))
                .end();
    }
}