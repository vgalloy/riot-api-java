package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.MatchDetail;
import vgalloy.riot.api.dto.constant.Region;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public interface MatchApi {

    /**
     * Retrieve match IDs by tournament code.
     *
     * @param region         the summoners region
     * @param tournamentCode the tournament code
     * @param key            the api key
     * @return the match id list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/by-tournament/{tournamentCode}/ids")
    List<Long> getMatchIdList(@PathParam("region") Region region, @PathParam("tournamentCode") String tournamentCode, @QueryParam("api_key") String key);

    /**
     * Retrieve match by match ID and tournament code.
     *
     * @param region  the summoners region
     * @param matchId the match id
     * @param key     the api key
     * @return the tournament match detail
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/for-tournament/{matchId}")
    MatchDetail getTournamentMatchDetail(@PathParam("region") Region region, @PathParam("matchId") String matchId, @QueryParam("api_key") String key);

    /**
     * Retrieve match by match ID.
     *
     * @param region  the summoners region
     * @param matchId the match id
     * @param key     the api key
     * @return the match detail
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/match/{matchId}")
    MatchDetail getMatchDetail(@PathParam("region") Region region, @PathParam("matchId") String matchId, @QueryParam("api_key") String key);
}
