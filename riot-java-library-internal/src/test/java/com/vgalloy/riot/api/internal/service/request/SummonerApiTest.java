package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 25/05/16.
 *
 * @author Vincent Galloy
 */
public final class SummonerApiTest extends AbstractTest {

    @Test
    public void testGetSummonersByIds() {
        new QueryTester("SummonersByIds")
            .test(RIOT_API.getSummonersByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersByNames() {
        new QueryTester("SummonersByNames")
            .test(RIOT_API.getSummonerByNames("Ivaranne").addSummonerNames("Miir").region(Region.EUW))
            .test(RIOT_API.getSummonerByNames("Miir").region(Region.NA))
            .test(RIOT_API.getSummonerByNames("Faker").region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersMasteriesByIds() {
        new QueryTester("SummonersMasteriesByIds")
            .test(RIOT_API.getSummonersMasteriesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersMasteriesByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersMasteriesByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersNameByIds() {
        new QueryTester("SummonersNameByIds")
            .test(RIOT_API.getSummonersNameByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersNameByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersNameByIds(17671075).region(Region.KR))
            .end();
    }

    @Test
    public void testGetSummonersRunesByIds() {
        new QueryTester("SummonersRunesByIds")
            .test(RIOT_API.getSummonersRunesByIds(24550736).addSummonerIds(24541689).region(Region.EUW))
            .test(RIOT_API.getSummonersRunesByIds(67911140).region(Region.NA))
            .test(RIOT_API.getSummonersRunesByIds(17671075).region(Region.KR))
            .end();
    }
}
