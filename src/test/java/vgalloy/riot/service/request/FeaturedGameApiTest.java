package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class FeaturedGameApiTest extends AbstractTest {

    @Test
    public void testGetFeaturedGame() {
        new QueryTester("FeaturedGame")
                .test(riotApi.getFeatureGame().region(Region.EUW))
                .test(riotApi.getFeatureGame().region(Region.NA))
                .test(riotApi.getFeatureGame().region(Region.KR))
                .end();
    }
}