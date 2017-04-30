package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 24/05/16.
 *
 * @author Vincent Galloy
 */
public final class LolStaticDataApiTest extends AbstractTest {

    @Test
    public void testGetChampionDataList() {
        new QueryTester("ChampionDataList")
            .test(RIOT_API.getChampionDataList().region(Region.EUW))
            .test(RIOT_API.getChampionDataList().region(Region.NA))
            .test(RIOT_API.getChampionDataList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetChampionDataById() {
        new QueryTester("ChampionDataById")
            .test(RIOT_API.getChampionDataById(266).region(Region.EUW))
            .test(RIOT_API.getChampionDataById(266).region(Region.NA))
            .test(RIOT_API.getChampionDataById(266).region(Region.KR))
            .end();
    }

    @Test
    public void testGetItemList() {
        new QueryTester("ItemList")
            .test(RIOT_API.getItemList().region(Region.EUW))
            .test(RIOT_API.getItemList().region(Region.NA))
            .test(RIOT_API.getItemList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetItemById() {
        new QueryTester("ItemById")
            .test(RIOT_API.getItemById(3153).region(Region.EUW))
            .test(RIOT_API.getItemById(3153).region(Region.NA))
            .test(RIOT_API.getItemById(3153).region(Region.KR))
            .end();
    }

    @Test
    public void testGetLanguageString() {
        new QueryTester("LanguageString")
            .test(RIOT_API.getLanguageString().region(Region.EUW))
            .test(RIOT_API.getLanguageString().region(Region.NA))
            .test(RIOT_API.getLanguageString().region(Region.KR))
            .end();
    }

    @Test
    public void testGetLanguage() {
        new QueryTester("Language")
            .test(RIOT_API.getLanguage().region(Region.EUW))
            .test(RIOT_API.getLanguage().region(Region.NA))
            .test(RIOT_API.getLanguage().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMap() {
        new QueryTester("Map")
            .test(RIOT_API.getMap().region(Region.EUW))
            .test(RIOT_API.getMap().region(Region.NA))
            .test(RIOT_API.getMap().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMasteryList() {
        new QueryTester("MasteryList")
            .test(RIOT_API.getMasteryList().region(Region.EUW))
            .test(RIOT_API.getMasteryList().region(Region.NA))
            .test(RIOT_API.getMasteryList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMasteryById() {
        new QueryTester("MasteryById")
            .test(RIOT_API.getMasteryById(6121).region(Region.EUW))
            .test(RIOT_API.getMasteryById(6121).region(Region.NA))
            .test(RIOT_API.getMasteryById(6121).region(Region.KR))
            .end();
    }

    @Test
    public void testGetRealm() {
        new QueryTester("Realm")
            .test(RIOT_API.getRealm().region(Region.EUW))
            .test(RIOT_API.getRealm().region(Region.NA))
            .test(RIOT_API.getRealm().region(Region.KR))
            .end();
    }

    @Test
    public void testGetRuneList() {
        new QueryTester("RuneList")
            .test(RIOT_API.getRuneList().region(Region.EUW))
            .test(RIOT_API.getRuneList().region(Region.NA))
            .test(RIOT_API.getRuneList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetRuneById() {
        new QueryTester("RuneById")
            .test(RIOT_API.getRuneById(5235).region(Region.EUW))
            .test(RIOT_API.getRuneById(5235).region(Region.NA))
            .test(RIOT_API.getRuneById(5235).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonerSpellList() {
        new QueryTester("SummonerSpellList")
            .test(RIOT_API.getSummonerSpellList().region(Region.EUW))
            .test(RIOT_API.getSummonerSpellList().region(Region.NA))
            .test(RIOT_API.getSummonerSpellList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonerSpellById() {
        new QueryTester("SummonerSpellById")
            .test(RIOT_API.getSummonerSpellById(1).region(Region.EUW))
            .test(RIOT_API.getSummonerSpellById(1).region(Region.NA))
            .test(RIOT_API.getSummonerSpellById(1).region(Region.KR))
            .end();
    }

    @Test
    public void testGetVersionList() {
        new QueryTester("VersionList")
            .test(RIOT_API.getVersionList().region(Region.EUW))
            .test(RIOT_API.getVersionList().region(Region.NA))
            .test(RIOT_API.getVersionList().region(Region.KR))
            .end();
    }
}
