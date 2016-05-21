package vgalloy.riot.service;

import org.junit.Before;
import org.junit.Test;
import vgalloy.riot.api.dto.constant.Region;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ChampionApiTest {

    private RiotApi riotApi = new RiotApi();

    // TODO afin d'éviter les problème de limite exceded il va falloir faire les test avec l'executor.

    @Before
    public void init() throws IOException {
        InputStream inputStream = ChampionApiTest.class.getClassLoader().getResourceAsStream("riot.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        riotApi.setDefaultRiotApiKey(new RiotApiKey(properties));
    }

    @Test
    public void testChampionList() {
        riotApi.getChampionList().setRegion(Region.EUW).execute();
        riotApi.getChampionList().setRegion(Region.NA).execute();
    }

    @Test
    public void testChampionById() {
        riotApi.getChampionById(1).setRegion(Region.EUW).execute();
        riotApi.getChampionById(1).setRegion(Region.NA).execute();
    }
}