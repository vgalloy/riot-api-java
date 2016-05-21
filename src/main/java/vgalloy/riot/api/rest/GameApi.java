package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.RecentGamesDto;

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
     * @param summonerId the summoner id
     * @param key        the api key
     * @return the recent games
     */
    @GET
    @Path("https://euw.api.pvp.net/api/lol/euw/v1.3/game/by-summoner/{summonerId}/recent")
    RecentGamesDto getRecentGame(@PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}