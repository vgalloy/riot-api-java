package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public final class ChampionApiTest extends AbstractTest {

    @Test
    public void testChampionList() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionList")
            .test(RIOT_API.getChampionList().region(Region.EUW))
            .test(RIOT_API.getChampionList().region(Region.NA))
            .test(RIOT_API.getChampionList().region(Region.KR))
            .test(RIOT_API.getChampionList().region(Region.EUNE))
            .end();
    }

    @Test
    public void testChampionById() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionById")
            .test(RIOT_API.getChampionById(1).region(Region.EUW))
            .test(RIOT_API.getChampionById(1).region(Region.NA))
            .test(RIOT_API.getChampionById(1).region(Region.KR))
            .test(RIOT_API.getChampionById(1).region(Region.EUNE))
            .end();
    }
}