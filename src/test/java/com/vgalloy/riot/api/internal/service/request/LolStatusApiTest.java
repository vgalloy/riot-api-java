package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 24/05/16.
 *
 * @author Vincent Galloy
 */
public final class LolStatusApiTest extends AbstractTest {

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
