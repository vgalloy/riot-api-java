package vgalloy.riotapijava.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riotapijava.dto.CurrentGameInfo;
import vgalloy.riotapijava.dto.constant.PlatformId;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface CurrentGameApi {

    /**
     * Gets the information for the current summoner game.
     *
     * @param platformId the platform id
     * @param summonerId the summoner
     * @param key        the api key
     * @return the current game information
     */
    @GET
    @Path("https://euw.api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summonerId}")
    CurrentGameInfo getCurrentGame(@PathParam("platformId") PlatformId platformId, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}
