package vgalloy.riot.api.request.league;

import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.constant.RankedQueueType;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.league.dto.LeagueDto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public interface LeagueApi {

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the region
     * @param summonerIds the summoners id
     * @param apiKey      the api key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}")
    Map<String, List<LeagueDto>> getLeaguesBySummonerIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get league entries mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the region
     * @param summonerIds the summoners id
     * @param apiKey      the api key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}/entry")
    Map<String, List<LeagueDto>> getLeaguesEntryBySummonerIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     *
     * @param region  the region
     * @param teamIds the team id
     * @param apiKey  the api key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-team/{teamIds}")
    Map<String, List<LeagueDto>> getLeaguesByTeamIds(@PathParam("region") Region region, @PathParam("teamIds") String teamIds, @QueryParam("api_key") String apiKey);

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     *
     * @param region  the region
     * @param teamIds the team id
     * @param apiKey  the api key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-team/{teamIds}/entry")
    Map<String, List<LeagueDto>> getLeaguesEntryByTeamIds(@PathParam("region") Region region, @PathParam("teamIds") String teamIds, @QueryParam("api_key") String apiKey);

    /**
     * Get challenger tier leagues.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the api key
     * @return the challenger league
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/challenger")
    LeagueDto getChallenger(@PathParam("region") Region region, @QueryParam("type") RankedQueueType type, @QueryParam("api_key") String apiKey);

    /**
     * Get master tier leagues.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the api key
     * @return the master league
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/master")
    LeagueDto getMaster(@PathParam("region") Region region, @QueryParam("type") RankedQueueType type, @QueryParam("api_key") String apiKey);
}
