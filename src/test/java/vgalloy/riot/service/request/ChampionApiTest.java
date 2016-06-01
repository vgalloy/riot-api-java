package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ChampionApiTest extends AbstractTest {

    @Test
    public void testChampionList() {
        new QueryTester("ChampionList")
                .test(riotApi.getChampionList().region(Region.EUW))
                .test(riotApi.getChampionList().region(Region.NA))
                .test(riotApi.getChampionList().region(Region.KR))
                .test(riotApi.getChampionList().region(Region.EUNE))
                .end();
    }

    @Test
    public void testChampionById() {
        new QueryTester("ChampionById")
                .test(riotApi.getChampionById(1).region(Region.EUW))
                .test(riotApi.getChampionById(1).region(Region.NA))
                .test(riotApi.getChampionById(1).region(Region.KR))
                .test(riotApi.getChampionById(1).region(Region.EUNE))
                .end();
    }

    @Test
    public void test() {
        riotApi.getChampionById(1).region(Region.EUW).execute();
    }
}