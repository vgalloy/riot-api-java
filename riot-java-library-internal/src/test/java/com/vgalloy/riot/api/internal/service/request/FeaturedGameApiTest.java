package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class FeaturedGameApiTest extends AbstractTest {

    @Test
    public void testGetFeaturedGame() {
        new QueryTester("FeaturedGame")
            .test(RIOT_API.getFeaturedGame().region(Region.EUW))
            .test(RIOT_API.getFeaturedGame().region(Region.NA))
            .test(RIOT_API.getFeaturedGame().region(Region.KR))
            .end();
    }
}