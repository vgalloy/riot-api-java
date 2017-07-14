package com.vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.library.api.constant.PlatformId;
import com.vgalloy.riot.library.api.dto.currentgame.CurrentGameInfo;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public interface CurrentGameApi {

    /**
     * Get current game information for the given summoner id.
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
