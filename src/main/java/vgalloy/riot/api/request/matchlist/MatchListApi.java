package vgalloy.riot.api.request.matchlist;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.matchlist.dto.MatchList;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public interface MatchListApi {

    /**
     * Retrieve match list by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the api key
     * @return the match list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/api/lol/{region}/v2.2/matchlist/by-summoner/{summonerId}")
    MatchList getMatchListBySummonerId(@PathParam("region") Region region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
