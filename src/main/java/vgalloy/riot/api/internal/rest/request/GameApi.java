package vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.dto.game.RecentGamesDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public interface GameApi {

    /**
     * Get recent games by summoner id.
     *
     * @param region     the region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the recent games
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.3/game/by-summoner/{summonerId}/recent")
    RecentGamesDto getRecentGame(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
