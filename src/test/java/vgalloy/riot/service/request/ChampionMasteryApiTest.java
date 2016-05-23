package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class ChampionMasteryApiTest extends AbstractTest {

    @Test
    public void testChampionMasteries() {
        System.out.println(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.EUW).execute());
        System.out.println(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.NA).execute());
        System.out.println(riotApi.getChampionMasteryByChampion(24550736, 100).region(Region.KR).execute());
    }

    @Test
    public void testChampionMasteriesList() {
        System.out.println(riotApi.getChampionMastery(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getChampionMastery(24550736).region(Region.NA).execute());
        System.out.println(riotApi.getChampionMastery(24550736).region(Region.KR).execute());
    }

    @Test
    public void testChampionScore() {
        System.out.println(riotApi.getPlayerScore(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getPlayerScore(24550736).region(Region.NA).execute());
        System.out.println(riotApi.getPlayerScore(24550736).region(Region.KR).execute());
    }

    @Test
    public void testGetTopChampion() {
        System.out.println(riotApi.getTopChampion(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getTopChampion(24550736).region(Region.NA).execute());
        System.out.println(riotApi.getTopChampion(24550736).region(Region.KR).execute());
    }
}
