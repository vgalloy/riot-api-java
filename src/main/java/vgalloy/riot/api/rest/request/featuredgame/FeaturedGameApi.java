package vgalloy.riot.api.rest.request.featuredgame;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.rest.request.featuredgame.dto.FeaturedGames;
import vgalloy.riot.api.rest.constant.Region;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
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
    FeaturedGames getFeaturedGame(@PathParam("region") Region region, @QueryParam("api_key") String apiKey);
}
