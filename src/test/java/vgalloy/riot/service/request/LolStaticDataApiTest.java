package vgalloy.riot.service.request;

import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
 */
public class LolStaticDataApiTest extends AbstractTest {

    @Test
    public void testGetChampionDataList() {
        System.out.println(riotApi.getChampionDataList().region(Region.EUW).execute());
        System.out.println(riotApi.getChampionDataList().region(Region.NA).execute());
        System.out.println(riotApi.getChampionDataList().region(Region.KR).execute());
    }

    @Test
    public void testGetChampionDataById() {
        System.out.println(riotApi.getChampionDataById(266).region(Region.EUW).execute());
        System.out.println(riotApi.getChampionDataById(266).region(Region.NA).execute());
        System.out.println(riotApi.getChampionDataById(266).region(Region.KR).execute());
    }

    @Test
    public void testGetItemList() {
        System.out.println(riotApi.getItemList().region(Region.EUW).execute());
        System.out.println(riotApi.getItemList().region(Region.NA).execute());
        System.out.println(riotApi.getItemList().region(Region.KR).execute());
    }

    @Test
    public void testGetItemById() {
        System.out.println(riotApi.getItemById(3153).region(Region.EUW).execute());
        System.out.println(riotApi.getItemById(3153).region(Region.NA).execute());
        System.out.println(riotApi.getItemById(3153).region(Region.KR).execute());
    }

    @Test
    public void testGetLanguageString() {
        System.out.println(riotApi.getLanguageString().region(Region.EUW).execute());
        System.out.println(riotApi.getLanguageString().region(Region.NA).execute());
        System.out.println(riotApi.getLanguageString().region(Region.KR).execute());
    }

    @Test
    public void testGetLanguage() {
        System.out.println(riotApi.getLanguage().region(Region.EUW).execute());
        System.out.println(riotApi.getLanguage().region(Region.NA).execute());
        System.out.println(riotApi.getLanguage().region(Region.KR).execute());
    }

    @Test
    public void testGetMap() {
        System.out.println(riotApi.getMap().region(Region.EUW).execute());
        System.out.println(riotApi.getMap().region(Region.NA).execute());
        System.out.println(riotApi.getMap().region(Region.KR).execute());
    }

    @Test
    public void testGetMasteryList() {
        System.out.println(riotApi.getMasteryList().region(Region.EUW).execute());
        System.out.println(riotApi.getMasteryList().region(Region.NA).execute());
        System.out.println(riotApi.getMasteryList().region(Region.KR).execute());
    }

    @Test
    public void testGetMasteryById() {
        System.out.println(riotApi.getMasteryById(6121).region(Region.EUW).execute());
        System.out.println(riotApi.getMasteryById(6121).region(Region.NA).execute());
        System.out.println(riotApi.getMasteryById(6121).region(Region.KR).execute());
    }

    @Test
    public void testGetRealm() {
        System.out.println(riotApi.getRealm().region(Region.EUW).execute());
        System.out.println(riotApi.getRealm().region(Region.NA).execute());
        System.out.println(riotApi.getRealm().region(Region.KR).execute());
    }

    @Test
    public void testGetRuneList() {
        System.out.println(riotApi.getRuneList().region(Region.EUW).execute());
        System.out.println(riotApi.getRuneList().region(Region.NA).execute());
        System.out.println(riotApi.getRuneList().region(Region.KR).execute());
    }

    @Test
    public void testGetRuneById() {
        System.out.println(riotApi.getRuneById(5235).region(Region.EUW).execute());
        System.out.println(riotApi.getRuneById(5235).region(Region.NA).execute());
        System.out.println(riotApi.getRuneById(5235).region(Region.KR).execute());
    }

    @Test
    public void testGetSummonerSpellList() {
        System.out.println(riotApi.getSummonerSpellList().region(Region.EUW).execute());
        System.out.println(riotApi.getSummonerSpellList().region(Region.NA).execute());
        System.out.println(riotApi.getSummonerSpellList().region(Region.KR).execute());
    }

    @Test
    public void testGetSummonerSpellById() {
        System.out.println(riotApi.getSummonerSpellById(1).region(Region.EUW).execute());
        System.out.println(riotApi.getSummonerSpellById(1).region(Region.NA).execute());
        System.out.println(riotApi.getSummonerSpellById(1).region(Region.KR).execute());
    }

    @Test
    public void testGetVersionList() {
        System.out.println(riotApi.getVersionList().region(Region.EUW).execute());
        System.out.println(riotApi.getVersionList().region(Region.NA).execute());
        System.out.println(riotApi.getVersionList().region(Region.KR).execute());
    }
}
