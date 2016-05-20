package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.FeaturedGames;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface FeatureGameApi {

    /**
     * Get list of featured games.
     *
     * @param key the api key
     * @return the featured game
     */
    @GET
    @Path("https://euw.api.pvp.net/observer-mode/rest/featured")
    FeaturedGames getFeaturedGame(@QueryParam("api_key") String key);
}
