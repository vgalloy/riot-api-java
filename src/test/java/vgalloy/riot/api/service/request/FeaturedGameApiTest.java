package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class FeaturedGameApiTest extends AbstractTest {

    @Test
    public void testGetFeaturedGame() {
        new QueryTester("FeaturedGame")
                .test(riotApi.getFeatureGame().region(Region.euw))
                .test(riotApi.getFeatureGame().region(Region.na))
                .test(riotApi.getFeatureGame().region(Region.kr))
                .end();
    }
}