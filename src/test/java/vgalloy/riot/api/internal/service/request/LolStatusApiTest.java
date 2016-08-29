package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
 */
public class LolStatusApiTest extends AbstractTest {

    @Test
    public void testGetShardList() {
        new QueryTester("ShardList")
                .test(RIOT_API.getShardList())
                .test(RIOT_API.getShardList())
                .test(RIOT_API.getShardList())
                .end();
    }

    @Test
    public void testGetShardStatus() {
        new QueryTester("ShardStatus")
                .test(RIOT_API.getShardStatus().region(Region.EUW))
                .test(RIOT_API.getShardStatus().region(Region.NA))
                .test(RIOT_API.getShardStatus().region(Region.KR))
                .end();
    }
}
