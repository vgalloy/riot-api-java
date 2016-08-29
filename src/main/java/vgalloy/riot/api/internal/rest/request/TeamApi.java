package vgalloy.riot.api.internal.rest.request;

import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.dto.team.TeamDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface TeamApi {

    /**
     * Get teams mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the region
     * @param summonerIds the summoner ids
     * @param apiKey      the rest key
     * @return the teams
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.4/team/by-summoner/{summonerIds}")
    Map<String, List<TeamDto>> getTeamsBySummonerIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get teams mapped by team ID for a given list of team IDs.
     *
     * @param region  the region
     * @param teamIds the team ids
     * @param apiKey  the rest key
     * @return the summoner
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.4/team/{teamIds}")
    Map<String, TeamDto> getTeamsByTeamIds(@PathParam("region") SmallCaseRegion region, @PathParam("teamIds") String teamIds, @QueryParam("api_key") String apiKey);
}
