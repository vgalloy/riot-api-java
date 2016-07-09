package vgalloy.riot.api.rest.request.mach;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.rest.request.mach.dto.MatchDetail;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public interface MatchApi {

    /**
     * Retrieve match IDs by tournament code.
     *
     * @param region         the summoners region
     * @param tournamentCode the tournament code
     * @param apiKey         the rest key
     * @return the match id list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/by-tournament/{tournamentCode}/ids")
    List<Long> getMatchIdList(@PathParam("region") Region region, @PathParam("tournamentCode") String tournamentCode, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve match by match ID and tournament code.
     *
     * @param region  the summoners region
     * @param matchId the match id
     * @param apiKey  the rest key
     * @return the tournament match detail
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/for-tournament/{matchId}")
    MatchDetail getTournamentMatchDetailById(@PathParam("region") Region region, @PathParam("matchId") long matchId, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve match by match ID.
     *
     * @param region          the summoners region
     * @param matchId         the match id
     * @param includeTimeline the flag indicating whether or not to include match timeline data
     * @param apiKey          the rest key
     * @return the match detail
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/{matchId}")
    MatchDetail getMatchDetailById(@PathParam("region") Region region, @PathParam("matchId") long matchId, @QueryParam("includeTimeline") boolean includeTimeline, @QueryParam("api_key") String apiKey);
}
