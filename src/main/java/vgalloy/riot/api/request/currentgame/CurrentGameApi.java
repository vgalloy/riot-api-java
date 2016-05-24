package vgalloy.riot.api.request.currentgame;

import vgalloy.riot.api.constant.PlatformId;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.currentgame.dto.CurrentGameInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface CurrentGameApi {

    /**
     * Get current game information for the given summoner ID.
     *
     * @param region     the region
     * @param platformId the platform id
     * @param summonerId the summoner
     * @param key        the api key
     * @return the current game information
     */
    @GET
    @Path("https://{region}.api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summonerId}")
    CurrentGameInfo getCurrentGameInfo(@PathParam("region") Region region, @PathParam("platformId") PlatformId platformId, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String apiKey);
}
