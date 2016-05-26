package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
 */
public class LolStaticDataApiTest extends AbstractTest {

    @Test
    public void testGetChampionDataList() {
        new QueryTester("ChampionDataList")
                .test(riotApi.getChampionDataList().region(Region.EUW))
                .test(riotApi.getChampionDataList().region(Region.NA))
                .test(riotApi.getChampionDataList().region(Region.KR))
                .end();
    }

    @Test
    public void testGetChampionDataById() {
        new QueryTester("ChampionDataById")
                .test(riotApi.getChampionDataById(266).region(Region.EUW))
                .test(riotApi.getChampionDataById(266).region(Region.NA))
                .test(riotApi.getChampionDataById(266).region(Region.KR))
                .end();
    }

    @Test
    public void testGetItemList() {
        new QueryTester("ItemList")
                .test(riotApi.getItemList().region(Region.EUW))
                .test(riotApi.getItemList().region(Region.NA))
                .test(riotApi.getItemList().region(Region.KR))
                .end();
    }

    @Test
    public void testGetItemById() {
        new QueryTester("ItemById")
                .test(riotApi.getItemById(3153).region(Region.EUW))
                .test(riotApi.getItemById(3153).region(Region.NA))
                .test(riotApi.getItemById(3153).region(Region.KR))
                .end();
    }

    @Test
    public void testGetLanguageString() {
        new QueryTester("LanguageString")
                .test(riotApi.getLanguageString().region(Region.EUW))
                .test(riotApi.getLanguageString().region(Region.NA))
                .test(riotApi.getLanguageString().region(Region.KR))
                .end();
    }

    @Test
    public void testGetLanguage() {
        new QueryTester("Language")
                .test(riotApi.getLanguage().region(Region.EUW))
                .test(riotApi.getLanguage().region(Region.NA))
                .test(riotApi.getLanguage().region(Region.KR))
                .end();
    }

    @Test
    public void testGetMap() {
        new QueryTester("Map")
                .test(riotApi.getMap().region(Region.EUW))
                .test(riotApi.getMap().region(Region.NA))
                .test(riotApi.getMap().region(Region.KR))
                .end();
    }

    @Test
    public void testGetMasteryList() {
        new QueryTester("MasteryList")
                .test(riotApi.getMasteryList().region(Region.EUW))
                .test(riotApi.getMasteryList().region(Region.NA))
                .test(riotApi.getMasteryList().region(Region.KR))
                .end();
    }

    @Test
    public void testGetMasteryById() {
        new QueryTester("MasteryById")
                .test(riotApi.getMasteryById(6121).region(Region.EUW))
                .test(riotApi.getMasteryById(6121).region(Region.NA))
                .test(riotApi.getMasteryById(6121).region(Region.KR))
                .end();
    }

    @Test
    public void testGetRealm() {
        new QueryTester("Realm")
                .test(riotApi.getRealm().region(Region.EUW))
                .test(riotApi.getRealm().region(Region.NA))
                .test(riotApi.getRealm().region(Region.KR))
                .end();
    }

    @Test
    public void testGetRuneList() {
        new QueryTester("RuneList")
                .test(riotApi.getRuneList().region(Region.EUW))
                .test(riotApi.getRuneList().region(Region.NA))
                .test(riotApi.getRuneList().region(Region.KR))
                .end();
    }

    @Test
    public void testGetRuneById() {
        new QueryTester("RuneById")
                .test(riotApi.getRuneById(5235).region(Region.EUW))
                .test(riotApi.getRuneById(5235).region(Region.NA))
                .test(riotApi.getRuneById(5235).region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonerSpellList() {
        new QueryTester("SummonerSpellList")
                .test(riotApi.getSummonerSpellList().region(Region.EUW))
                .test(riotApi.getSummonerSpellList().region(Region.NA))
                .test(riotApi.getSummonerSpellList().region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonerSpellById() {
        new QueryTester("SummonerSpellById")
                .test(riotApi.getSummonerSpellById(1).region(Region.EUW))
                .test(riotApi.getSummonerSpellById(1).region(Region.NA))
                .test(riotApi.getSummonerSpellById(1).region(Region.KR))
                .end();
    }

    @Test
    public void testGetVersionList() {
        new QueryTester("VersionList")
                .test(riotApi.getVersionList().region(Region.EUW))
                .test(riotApi.getVersionList().region(Region.NA))
                .test(riotApi.getVersionList().region(Region.KR))
                .end();
    }
}
