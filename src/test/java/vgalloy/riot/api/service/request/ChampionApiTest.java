package vgalloy.riot.api.service.request;

import org.junit.Test;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ChampionApiTest extends AbstractTest {

    @Test
    public void testChampionList() {
        new QueryTester("ChampionList")
                .test(riotApi.getChampionList().region(Region.euw))
                .test(riotApi.getChampionList().region(Region.na))
                .test(riotApi.getChampionList().region(Region.kr))
                .test(riotApi.getChampionList().region(Region.eune))
                .end();
    }

    @Test
    public void testChampionById() {
        new QueryTester("ChampionById")
                .test(riotApi.getChampionById(1).region(Region.euw))
                .test(riotApi.getChampionById(1).region(Region.na))
                .test(riotApi.getChampionById(1).region(Region.kr))
                .test(riotApi.getChampionById(1).region(Region.eune))
                .end();
    }
}