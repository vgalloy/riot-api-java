package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
 */
public class LolStaticDataApiTest extends AbstractTest {

    @Test
    public void testGetChampionDataList() {
        new QueryTester("ChampionDataList")
                .test(riotApi.getChampionDataList().region(Region.euw))
                .test(riotApi.getChampionDataList().region(Region.na))
                .test(riotApi.getChampionDataList().region(Region.kr))
                .end();
    }

    @Test
    public void testGetChampionDataById() {
        new QueryTester("ChampionDataById")
                .test(riotApi.getChampionDataById(266).region(Region.euw))
                .test(riotApi.getChampionDataById(266).region(Region.na))
                .test(riotApi.getChampionDataById(266).region(Region.kr))
                .end();
    }

    @Test
    public void testGetItemList() {
        new QueryTester("ItemList")
                .test(riotApi.getItemList().region(Region.euw))
                .test(riotApi.getItemList().region(Region.na))
                .test(riotApi.getItemList().region(Region.kr))
                .end();
    }

    @Test
    public void testGetItemById() {
        new QueryTester("ItemById")
                .test(riotApi.getItemById(3153).region(Region.euw))
                .test(riotApi.getItemById(3153).region(Region.na))
                .test(riotApi.getItemById(3153).region(Region.kr))
                .end();
    }

    @Test
    public void testGetLanguageString() {
        new QueryTester("LanguageString")
                .test(riotApi.getLanguageString().region(Region.euw))
                .test(riotApi.getLanguageString().region(Region.na))
                .test(riotApi.getLanguageString().region(Region.kr))
                .end();
    }

    @Test
    public void testGetLanguage() {
        new QueryTester("Language")
                .test(riotApi.getLanguage().region(Region.euw))
                .test(riotApi.getLanguage().region(Region.na))
                .test(riotApi.getLanguage().region(Region.kr))
                .end();
    }

    @Test
    public void testGetMap() {
        new QueryTester("Map")
                .test(riotApi.getMap().region(Region.euw))
                .test(riotApi.getMap().region(Region.na))
                .test(riotApi.getMap().region(Region.kr))
                .end();
    }

    @Test
    public void testGetMasteryList() {
        new QueryTester("MasteryList")
                .test(riotApi.getMasteryList().region(Region.euw))
                .test(riotApi.getMasteryList().region(Region.na))
                .test(riotApi.getMasteryList().region(Region.kr))
                .end();
    }

    @Test
    public void testGetMasteryById() {
        new QueryTester("MasteryById")
                .test(riotApi.getMasteryById(6121).region(Region.euw))
                .test(riotApi.getMasteryById(6121).region(Region.na))
                .test(riotApi.getMasteryById(6121).region(Region.kr))
                .end();
    }

    @Test
    public void testGetRealm() {
        new QueryTester("Realm")
                .test(riotApi.getRealm().region(Region.euw))
                .test(riotApi.getRealm().region(Region.na))
                .test(riotApi.getRealm().region(Region.kr))
                .end();
    }

    @Test
    public void testGetRuneList() {
        new QueryTester("RuneList")
                .test(riotApi.getRuneList().region(Region.euw))
                .test(riotApi.getRuneList().region(Region.na))
                .test(riotApi.getRuneList().region(Region.kr))
                .end();
    }

    @Test
    public void testGetRuneById() {
        new QueryTester("RuneById")
                .test(riotApi.getRuneById(5235).region(Region.euw))
                .test(riotApi.getRuneById(5235).region(Region.na))
                .test(riotApi.getRuneById(5235).region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonerSpellList() {
        new QueryTester("SummonerSpellList")
                .test(riotApi.getSummonerSpellList().region(Region.euw))
                .test(riotApi.getSummonerSpellList().region(Region.na))
                .test(riotApi.getSummonerSpellList().region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonerSpellById() {
        new QueryTester("SummonerSpellById")
                .test(riotApi.getSummonerSpellById(1).region(Region.euw))
                .test(riotApi.getSummonerSpellById(1).region(Region.na))
                .test(riotApi.getSummonerSpellById(1).region(Region.kr))
                .end();
    }

    @Test
    public void testGetVersionList() {
        new QueryTester("VersionList")
                .test(riotApi.getVersionList().region(Region.euw))
                .test(riotApi.getVersionList().region(Region.na))
                .test(riotApi.getVersionList().region(Region.kr))
                .end();
    }
}
