package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class MatchListApiTest extends AbstractTest {

    @Test
    public void testGetMatchListBySummonerId() {
        new QueryTester("MatchListBySummonerId")
                .test(RIOT_API.getMatchListBySummonerId(24550736).region(Region.EUW))
                .test(RIOT_API.getMatchListBySummonerId(67911140).region(Region.NA))
                .test(RIOT_API.getMatchListBySummonerId(17671075).region(Region.KR))
                .end();
    }
}
