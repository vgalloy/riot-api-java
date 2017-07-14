package com.vgalloy.riot.api.internal.rest.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.library.api.dto.mach.MatchDetail;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
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
    List<Long> getMatchIdList(@PathParam("region") SmallCaseRegion region, @PathParam("tournamentCode") String tournamentCode, @QueryParam("api_key") String apiKey);

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
    MatchDetail getTournamentMatchDetailById(@PathParam("region") SmallCaseRegion region, @PathParam("matchId") long matchId, @QueryParam("api_key") String apiKey);

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
    MatchDetail getMatchDetailById(@PathParam("region") SmallCaseRegion region, @PathParam("matchId") long matchId, @QueryParam("includeTimeline") boolean includeTimeline, @QueryParam("api_key") String apiKey);
}
