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
        System.out.println(riotApi.getFeatureGame().region(Region.EUW).execute());
        System.out.println(riotApi.getFeatureGame().region(Region.NA).execute());
        System.out.println(riotApi.getFeatureGame().region(Region.KR).execute());
    }
}