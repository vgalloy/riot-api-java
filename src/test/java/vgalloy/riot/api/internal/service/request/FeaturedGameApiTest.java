package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class FeaturedGameApiTest extends AbstractTest {

    @Test
    public void testGetFeaturedGame() {
        new QueryTester("FeaturedGame")
            .test(RIOT_API.getFeatureGame().region(Region.EUW))
            .test(RIOT_API.getFeatureGame().region(Region.NA))
            .test(RIOT_API.getFeatureGame().region(Region.KR))
            .end();
    }
}