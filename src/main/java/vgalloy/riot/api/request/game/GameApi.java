package vgalloy.riot.api.request.game;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.game.dto.RecentGamesDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface GameApi {

    /**
     * Get recent games by summoner ID.
     *
     * @param region     the region
     * @param summonerId the summoner id
     * @param key        the api key
     * @return the recent games
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.3/game/by-summoner/{summonerId}/recent")
    RecentGamesDto getRecentGame(@PathParam("region") Region region, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}