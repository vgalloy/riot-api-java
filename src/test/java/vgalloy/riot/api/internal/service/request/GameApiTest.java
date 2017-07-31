package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class GameApiTest extends AbstractTest {

    @Test
    public void testGetRecentGame() {
        QueryTester.of(this.getClass().getSimpleName() + "::RecentGame")
            .test(RIOT_API.getRecentGame(24550736).region(Region.EUW))
            .test(RIOT_API.getRecentGame(67911140).region(Region.NA))
            .test(RIOT_API.getRecentGame(17671075).region(Region.KR))
            .end();
    }
}