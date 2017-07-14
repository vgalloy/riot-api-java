package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
public final class MatchListApiTest extends AbstractTest {

    @Test
    public void testGetMatchListBySummonerId() {
        new QueryTester("MatchListBySummonerId")
            .test(RIOT_API.getMatchListBySummonerId(24550736).region(Region.EUW))
            .test(RIOT_API.getMatchListBySummonerId(67911140).region(Region.NA))
            .test(RIOT_API.getMatchListBySummonerId(17671075).region(Region.KR))
            .end();
    }
}
