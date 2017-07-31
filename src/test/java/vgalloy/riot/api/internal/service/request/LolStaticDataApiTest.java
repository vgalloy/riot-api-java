package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 24/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class LolStaticDataApiTest extends AbstractTest {

    @Test
    public void testGetChampionDataList() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionDataList")
            .test(RIOT_API.getChampionDataList().region(Region.EUW))
            .test(RIOT_API.getChampionDataList().region(Region.NA))
            .test(RIOT_API.getChampionDataList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetChampionDataById() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionDataById")
            .test(RIOT_API.getChampionDataById(266).region(Region.EUW))
            .test(RIOT_API.getChampionDataById(266).region(Region.NA))
            .test(RIOT_API.getChampionDataById(266).region(Region.KR))
            .end();
    }

    @Test
    public void testGetItemList() {
        QueryTester.of(this.getClass().getSimpleName() + "::ItemList")
            .test(RIOT_API.getItemList().region(Region.EUW))
            .test(RIOT_API.getItemList().region(Region.NA))
            .test(RIOT_API.getItemList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetItemById() {
        QueryTester.of(this.getClass().getSimpleName() + "::ItemById")
            .test(RIOT_API.getItemById(3153).region(Region.EUW))
            .test(RIOT_API.getItemById(3153).region(Region.NA))
            .test(RIOT_API.getItemById(3153).region(Region.KR))
            .end();
    }

    @Test
    public void testGetLanguageString() {
        QueryTester.of(this.getClass().getSimpleName() + "::LanguageString")
            .test(RIOT_API.getLanguageString().region(Region.EUW))
            .test(RIOT_API.getLanguageString().region(Region.NA))
            .test(RIOT_API.getLanguageString().region(Region.KR))
            .end();
    }

    @Test
    public void testGetLanguage() {
        QueryTester.of(this.getClass().getSimpleName() + "::Language")
            .test(RIOT_API.getLanguage().region(Region.EUW))
            .test(RIOT_API.getLanguage().region(Region.NA))
            .test(RIOT_API.getLanguage().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMap() {
        QueryTester.of(this.getClass().getSimpleName() + "::Map")
            .test(RIOT_API.getMap().region(Region.EUW))
            .test(RIOT_API.getMap().region(Region.NA))
            .test(RIOT_API.getMap().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMasteryList() {
        QueryTester.of(this.getClass().getSimpleName() + "::MasteryList")
            .test(RIOT_API.getMasteryList().region(Region.EUW))
            .test(RIOT_API.getMasteryList().region(Region.NA))
            .test(RIOT_API.getMasteryList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetMasteryById() {
        QueryTester.of(this.getClass().getSimpleName() + "::MasteryById")
            .test(RIOT_API.getMasteryById(6121).region(Region.EUW))
            .test(RIOT_API.getMasteryById(6121).region(Region.NA))
            .test(RIOT_API.getMasteryById(6121).region(Region.KR))
            .end();
    }

    @Test
    public void testGetRealm() {
        QueryTester.of(this.getClass().getSimpleName() + "::Realm")
            .test(RIOT_API.getRealm().region(Region.EUW))
            .test(RIOT_API.getRealm().region(Region.NA))
            .test(RIOT_API.getRealm().region(Region.KR))
            .end();
    }

    @Test
    public void testGetRuneList() {
        QueryTester.of(this.getClass().getSimpleName() + "::RuneList")
            .test(RIOT_API.getRuneList().region(Region.EUW))
            .test(RIOT_API.getRuneList().region(Region.NA))
            .test(RIOT_API.getRuneList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetRuneById() {
        QueryTester.of(this.getClass().getSimpleName() + "::RuneById")
            .test(RIOT_API.getRuneById(5235).region(Region.EUW))
            .test(RIOT_API.getRuneById(5235).region(Region.NA))
            .test(RIOT_API.getRuneById(5235).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonerSpellList() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonerSpellList")
            .test(RIOT_API.getSummonerSpellList().region(Region.EUW))
            .test(RIOT_API.getSummonerSpellList().region(Region.NA))
            .test(RIOT_API.getSummonerSpellList().region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonerSpellById() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonerSpellById")
            .test(RIOT_API.getSummonerSpellById(1).region(Region.EUW))
            .test(RIOT_API.getSummonerSpellById(1).region(Region.NA))
            .test(RIOT_API.getSummonerSpellById(1).region(Region.KR))
            .end();
    }

    @Test
    public void testGetVersionList() {
        QueryTester.of(this.getClass().getSimpleName() + "::VersionList")
            .test(RIOT_API.getVersionList().region(Region.EUW))
            .test(RIOT_API.getVersionList().region(Region.NA))
            .test(RIOT_API.getVersionList().region(Region.KR))
            .end();
    }
}
