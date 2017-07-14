package com.vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.api.api.dto.featuredgame.FeaturedGames;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public interface FeaturedGameApi {

    /**
     * Get list of featured games.
     *
     * @param region the region
     * @param apiKey the rest key
     * @return the featured game
     */
    @GET
    @Path("https://{region}.api.pvp.net/observer-mode/rest/featured")
    FeaturedGames getFeaturedGame(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);
}
