package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class SummonerApiTest extends AbstractTest {

    @Test
    public void testGetSummonersByIds() {
        new QueryTester("SummonersByIds")
                .test(riotApi.getSummonersByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getSummonersByIds(67911140).region(Region.NA))
                .test(riotApi.getSummonersByIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonersByNames() {
        new QueryTester("SummonersByNames")
                .test(riotApi.getSummonerByNames("Ivaranne").addSummonerNames("Miir").region(Region.EUW))
                .test(riotApi.getSummonerByNames("Azerty").region(Region.NA))
                .test(riotApi.getSummonerByNames("Azerty").region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonersMasteriesByIds() {
        new QueryTester("SummonersMasteriesByIds")
                .test(riotApi.getSummonersMasteriesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getSummonersMasteriesByIds(67911140).region(Region.NA))
                .test(riotApi.getSummonersMasteriesByIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonersNameByIds() {
        new QueryTester("SummonersNameByIds")
                .test(riotApi.getSummonersNameByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getSummonersNameByIds(67911140).region(Region.NA))
                .test(riotApi.getSummonersNameByIds(17671075).region(Region.KR))
                .end();
    }

    @Test
    public void testGetSummonersRunesByIds() {
        new QueryTester("SummonersRunesByIds")
                .test(riotApi.getSummonersRunesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
                .test(riotApi.getSummonersRunesByIds(67911140).region(Region.NA))
                .test(riotApi.getSummonersRunesByIds(17671075).region(Region.KR))
                .end();
    }
}
