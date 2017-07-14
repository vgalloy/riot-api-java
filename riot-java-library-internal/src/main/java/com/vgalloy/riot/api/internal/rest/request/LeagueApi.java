package com.vgalloy.riot.api.internal.rest.request;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.api.api.constant.LeagueQueueType;
import com.vgalloy.riot.api.api.dto.league.LeagueDto;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public interface LeagueApi {

    /**
     * Get leagues mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the region
     * @param summonerIds the summoners id
     * @param apiKey      the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}")
    Map<String, List<LeagueDto>> getLeaguesBySummonerIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get league entries mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the region
     * @param summonerIds the summoners id
     * @param apiKey      the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}/entry")
    Map<String, List<LeagueDto>> getLeaguesEntryBySummonerIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get leagues mapped by team id for a given list of team ids.
     *
     * @param region  the region
     * @param teamIds the team id
     * @param apiKey  the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-team/{teamIds}")
    Map<String, List<LeagueDto>> getLeaguesByTeamIds(@PathParam("region") SmallCaseRegion region, @PathParam("teamIds") String teamIds, @QueryParam("api_key") String apiKey);

    /**
     * Get league entries mapped by team id for a given list of team ids.
     *
     * @param region  the region
     * @param teamIds the team id
     * @param apiKey  the rest key
     * @return the leagues
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/by-team/{teamIds}/entry")
    Map<String, List<LeagueDto>> getLeaguesEntryByTeamIds(@PathParam("region") SmallCaseRegion region, @PathParam("teamIds") String teamIds, @QueryParam("api_key") String apiKey);

    /**
     * Get challenger tier leagues.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the rest key
     * @return the challenger league
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/challenger")
    LeagueDto getChallenger(@PathParam("region") SmallCaseRegion region, @QueryParam("type") LeagueQueueType type, @QueryParam("api_key") String apiKey);

    /**
     * Get master tier leagues.
     *
     * @param region the region
     * @param type   queue type
     * @param apiKey the rest key
     * @return the master league
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.5/league/master")
    LeagueDto getMaster(@PathParam("region") SmallCaseRegion region, @QueryParam("type") LeagueQueueType type, @QueryParam("api_key") String apiKey);
}
