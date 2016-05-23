package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ChampionApiTest extends AbstractTest {

    @Test
    public void testChampionList() {
        riotApi.getChampionList().region(Region.EUW).execute();
        riotApi.getChampionList().region(Region.NA).execute();
        riotApi.getChampionList().region(Region.KR).execute();
        riotApi.getChampionList().region(Region.EUNE).execute();
    }

    @Test
    public void testChampionById() {
        riotApi.getChampionById(1).region(Region.EUW).execute();
        riotApi.getChampionById(1).region(Region.NA).execute();
        riotApi.getChampionById(1).region(Region.KR).execute();
        riotApi.getChampionById(1).region(Region.EUNE).execute();
    }
}