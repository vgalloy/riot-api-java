package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 24/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class LolStatusApiTest extends AbstractTest {

    @Test
    public void testGetShardList() {
        QueryTester.of(this.getClass().getSimpleName() + "::ShardList")
            .test(RIOT_API.getShardList())
            .test(RIOT_API.getShardList())
            .test(RIOT_API.getShardList())
            .end();
    }

    @Test
    public void testGetShardStatus() {
        QueryTester.of(this.getClass().getSimpleName() + "::ShardStatus")
            .test(RIOT_API.getShardStatus().region(Region.EUW))
            .test(RIOT_API.getShardStatus().region(Region.NA))
            .test(RIOT_API.getShardStatus().region(Region.KR))
            .end();
    }
}
