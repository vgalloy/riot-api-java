package vgalloy.riot.service;

import org.junit.Before;
import org.junit.Test;
import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.executor.Executor;
import vgalloy.riot.service.executor.impl.ExecutorImpl;

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
        long start = System.currentTimeMillis();
        riotApi.getChampionList().setRegion(Region.EUW).execute();
        riotApi.getChampionList().setRegion(Region.NA).execute();
        riotApi.getChampionList().setRegion(Region.KR).execute();
        riotApi.getChampionList().setRegion(Region.EUNE).execute();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void testChampionById() {
        long start = System.currentTimeMillis();
        Executor executor = new ExecutorImpl();
        executor.addTask(() -> {
            riotApi.getChampionById(1).setRegion(Region.EUW).execute();
            System.out.println("Request 1 completed");
        });
        executor.addTask(() -> {
            riotApi.getChampionById(1).setRegion(Region.EUW).execute();
            System.out.println("Request 2 completed");
        });
        executor.addTask(() -> {
            riotApi.getChampionById(1).setRegion(Region.EUW).execute();
            System.out.println("Request 3 completed");
        });
        executor.addTask(() -> {
            riotApi.getChampionById(1).setRegion(Region.EUW).execute();
            System.out.println("Request 4 completed");
        });
        executor.start();
        executor.finish();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}