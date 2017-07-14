package com.vgalloy.riot.api.internal.service.request;

import org.junit.Test;

import com.vgalloy.riot.api.api.constant.Region;
import com.vgalloy.riot.api.internal.service.AbstractTest;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public final class ChampionApiTest extends AbstractTest {

    @Test
    public void testChampionList() {
        new QueryTester("ChampionList")
            .test(RIOT_API.getChampionList().region(Region.EUW))
            .test(RIOT_API.getChampionList().region(Region.NA))
            .test(RIOT_API.getChampionList().region(Region.KR))
            .test(RIOT_API.getChampionList().region(Region.EUNE))
            .end();
    }

    @Test
    public void testChampionById() {
        new QueryTester("ChampionById")
            .test(RIOT_API.getChampionById(1).region(Region.EUW))
            .test(RIOT_API.getChampionById(1).region(Region.NA))
            .test(RIOT_API.getChampionById(1).region(Region.KR))
            .test(RIOT_API.getChampionById(1).region(Region.EUNE))
            .end();
    }
}