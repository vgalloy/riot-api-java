package vgalloy.riot.api.request.featuredgame;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.featuredgame.dto.FeaturedGames;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface FeaturedGameApi {

    /**
     * Get list of featured games.
     *
     * @param region the region
     * @param key    the api key
     * @return the featured game
     */
    @GET
    @Path("https://{region}.api.pvp.net/observer-mode/rest/featured")
    FeaturedGames getFeaturedGame(@PathParam("region") Region region, @QueryParam("api_key") String key);
}
