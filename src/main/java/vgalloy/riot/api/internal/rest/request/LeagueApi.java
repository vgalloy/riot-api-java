package vgalloy.riot.api.internal.rest.request;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.dto.league.LeagueListDto;
import vgalloy.riot.api.api.dto.league.LeaguePositionDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 20/05/16.
 *
 * @author Vincent Galloy
 */
public interface LeagueApi {

    /**
     * @param region     the region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/league/v3/positions/by-summoner/{summonerId}")
    Set<LeaguePositionDto> getLeaguesPositionBySummonerId(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);

    /**
     * Get leagues in all queues for a given summoner id.
     *
     * @param region     the region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/league/v3/leagues/by-summoner/{summonerId}")
    Set<LeagueListDto> getLeaguesBySummonerId(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);

    /**
     * Get the challenger league for a given queue.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the rest key
     * @return the challenger league
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/league/v3/challengerleagues/by-queue/{type}")
    LeagueListDto getChallenger(@PathParam("region") SmallCaseRegion region, @PathParam("type") LeagueQueueType type, @QueryParam("api_key") String apiKey);

    /**
     * Get the master league for a given queue.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the rest key
     * @return the master league
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/league/v3/masterleagues/by-queue/{type}")
    LeagueListDto getMaster(@PathParam("region") SmallCaseRegion region, @PathParam("type") LeagueQueueType type, @QueryParam("api_key") String apiKey);
}
