package vgalloy.riot.service.request;

import org.junit.Ignore;
import org.junit.Test;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.service.AbstractTest;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class CurrentGameApiTest extends AbstractTest {

    @Test
    @Ignore
    public void testCurrentGameInfo() {
        // TODO Ca pète une 404 le joueur n'est pas dans une partie. Il faudrait gérer ça proprement ...
        System.out.println(riotApi.getCurrentGameInfo(24550736).region(Region.EUW).execute());
        System.out.println(riotApi.getCurrentGameInfo(24550736).region(Region.NA).execute());
        System.out.println(riotApi.getCurrentGameInfo(24550736).region(Region.KR).execute());
    }
}