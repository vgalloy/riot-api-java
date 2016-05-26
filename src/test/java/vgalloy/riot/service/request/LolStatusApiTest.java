package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
 */
public class LolStatusApiTest extends AbstractTest {

    @Test
    public void testGetShardList() {
        new QueryTester("ShardList")
                .test(riotApi.getShardList())
                .test(riotApi.getShardList())
                .test(riotApi.getShardList())
                .end();
    }

    @Test
    public void testGetShardStatus() {
        new QueryTester("ShardStatus")
                .test(riotApi.getShardStatus().region(Region.EUW))
                .test(riotApi.getShardStatus().region(Region.NA))
                .test(riotApi.getShardStatus().region(Region.KR))
                .end();
    }
}
