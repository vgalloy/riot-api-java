package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class MatchListApiTest extends AbstractTest {

    @Test
    public void testGetMatchListBySummonerId() {
        new QueryTester("MatchListBySummonerId")
                .test(riotApi.getMatchListBySummonerId(24550736).region(Region.EUW))
                .test(riotApi.getMatchListBySummonerId(67911140).region(Region.NA))
                .test(riotApi.getMatchListBySummonerId(17671075).region(Region.KR))
                .end();
    }
}
