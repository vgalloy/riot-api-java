package vgalloy.riot.api.internal.service.request;

import org.junit.Ignore;
import org.junit.Test;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.internal.service.AbstractTest;
import vgalloy.riot.api.internal.service.QueryTester;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
@Ignore
public final class SummonerApiTest extends AbstractTest {

    @Test
    public void testGetSummonersByIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonersByIds")
            .test(RIOT_API.getSummonersByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersByNames() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonersByNames")
            .test(RIOT_API.getSummonerByNames("Ivaranne").addSummonerNames("Miir").region(Region.EUW))
            .test(RIOT_API.getSummonerByNames("Miir").region(Region.NA))
            .test(RIOT_API.getSummonerByNames("Faker").region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersMasteriesByIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonersMasteriesByIds")
            .test(RIOT_API.getSummonersMasteriesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersMasteriesByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersMasteriesByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersNameByIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonersNameByIds")
            .test(RIOT_API.getSummonersNameByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersNameByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersNameByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersRunesByIds() {
        QueryTester.of(this.getClass().getSimpleName() + "::SummonersRunesByIds")
            .test(RIOT_API.getSummonersRunesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersRunesByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersRunesByIds(17671075).region(Region.KR))
            .end();
    }
}
