package vgalloy.riotapijava.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import vgalloy.riotapijava.dto.FeaturedGames;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface FeatureGameApi {

    /**
     * Gets featured game.
     *
     * @param key the api key
     * @return the featured game
     */
    @GET
    @Path("https://euw.api.pvp.net/observer-mode/rest/featured")
    FeaturedGames getFeaturedGame(@QueryParam("api_key") String key);
}
