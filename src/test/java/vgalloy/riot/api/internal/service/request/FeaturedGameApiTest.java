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
public final class FeaturedGameApiTest extends AbstractTest {

    @Test
    public void testGetFeaturedGame() {
        QueryTester.of(this.getClass().getSimpleName() + "::FeaturedGame")
            .test(RIOT_API.getFeatureGame().region(Region.EUW))
            .test(RIOT_API.getFeatureGame().region(Region.NA))
            .test(RIOT_API.getFeatureGame().region(Region.KR))
            .end();
    }
}