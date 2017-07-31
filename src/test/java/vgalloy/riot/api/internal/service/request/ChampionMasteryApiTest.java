package vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class ChampionMasteryApiTest extends AbstractTest {

    @Test
    public void testChampionMasteries() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionMasteries")
            .test(RIOT_API.getChampionMasteryByChampion(24550736, 7).region(Region.EUW))
            .test(RIOT_API.getChampionMasteryByChampion(67911140, 103).region(Region.NA))
            .test(RIOT_API.getChampionMasteryByChampion(17671075, 99).region(Region.KR))
            .end();
    }

    @Test
    public void testChampionMasteriesList() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionMasteriesList")
            .test(RIOT_API.getChampionMastery(24550736).region(Region.EUW))
            .test(RIOT_API.getChampionMastery(67911140).region(Region.NA))
            .test(RIOT_API.getChampionMastery(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetChampionScore() {
        QueryTester.of(this.getClass().getSimpleName() + "::ChampionScore")
            .test(RIOT_API.getPlayerScore(24550736).region(Region.EUW))
            .test(RIOT_API.getPlayerScore(24550736).region(Region.NA))
            .test(RIOT_API.getPlayerScore(24550736).region(Region.KR))
            .end();
    }
}
