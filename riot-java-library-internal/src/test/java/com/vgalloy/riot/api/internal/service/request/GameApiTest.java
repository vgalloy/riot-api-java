package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.api.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class GameApiTest extends AbstractTest {

    @Test
    public void testGetRecentGame() {
        new QueryTester("RecentGame")
            .test(RIOT_API.getRecentGame(24550736).region(Region.EUW))
            .test(RIOT_API.getRecentGame(67911140).region(Region.NA))
            .test(RIOT_API.getRecentGame(17671075).region(Region.KR))
            .end();
    }
}