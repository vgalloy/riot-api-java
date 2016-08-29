package vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.constant.PlatformId;
import vgalloy.riot.api.api.dto.currentgame.CurrentGameInfo;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

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
     * @param apiKey     the rest key
     * @return the current game information
     */
    @GET
    @Path("https://{region}.api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summonerId}")
    CurrentGameInfo getCurrentGameInfo(@PathParam("region") SmallCaseRegion region, @PathParam("platformId") PlatformId platformId, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
