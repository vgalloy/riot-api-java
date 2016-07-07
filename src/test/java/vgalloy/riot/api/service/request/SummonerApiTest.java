package vgalloy.riot.api.service.request;

import org.junit.Test;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 25/05/16.
 */
public class SummonerApiTest extends AbstractTest {

    @Test
    public void testGetSummonersByIds() {
        new QueryTester("SummonersByIds")
                .test(riotApi.getSummonersByIds(24550736).addSummonerIds(24541689).region(Region.euw))
                .test(riotApi.getSummonersByIds(67911140).region(Region.na))
                .test(riotApi.getSummonersByIds(17671075).region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonersByNames() {
        new QueryTester("SummonersByNames")
                .test(riotApi.getSummonerByNames("Ivaranne").addSummonerNames("Miir").region(Region.euw))
                .test(riotApi.getSummonerByNames("Azerty").region(Region.na))
                .test(riotApi.getSummonerByNames("Azerty").region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonersMasteriesByIds() {
        new QueryTester("SummonersMasteriesByIds")
                .test(riotApi.getSummonersMasteriesByIds(24550736).addSummonerIds(24541689).region(Region.euw))
                .test(riotApi.getSummonersMasteriesByIds(67911140).region(Region.na))
                .test(riotApi.getSummonersMasteriesByIds(17671075).region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonersNameByIds() {
        new QueryTester("SummonersNameByIds")
                .test(riotApi.getSummonersNameByIds(24550736).addSummonerIds(24541689).region(Region.euw))
                .test(riotApi.getSummonersNameByIds(67911140).region(Region.na))
                .test(riotApi.getSummonersNameByIds(17671075).region(Region.kr))
                .end();
    }

    @Test
    public void testGetSummonersRunesByIds() {
        new QueryTester("SummonersRunesByIds")
                .test(riotApi.getSummonersRunesByIds(24550736).addSummonerIds(24541689).region(Region.euw))
                .test(riotApi.getSummonersRunesByIds(67911140).region(Region.na))
                .test(riotApi.getSummonersRunesByIds(17671075).region(Region.kr))
                .end();
    }
}
