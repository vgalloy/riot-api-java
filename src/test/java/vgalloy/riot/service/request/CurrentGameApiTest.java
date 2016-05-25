package vgalloy.riot.service.request;

import org.junit.Test;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class CurrentGameApiTest extends AbstractTest {

    // TODO Ca pète une 404 le joueur n'est pas dans une partie. Il faudrait gérer ça proprement ...
    @Test
    public void testGetCurrentGameInfo() {
        new QueryTester("CurrentGameInfo")
                .test(riotApi.getCurrentGameInfo(24550736).region(Region.EUW))
                .test(riotApi.getCurrentGameInfo(24550736).region(Region.NA))
                .test(riotApi.getCurrentGameInfo(24550736).region(Region.KR))
                .end();
    }
}