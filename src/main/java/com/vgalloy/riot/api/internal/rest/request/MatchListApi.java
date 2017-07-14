package com.vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.api.api.dto.matchlist.MatchList;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public interface MatchListApi {

    /**
     * Retrieve match list by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the match list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v2.2/matchlist/by-summoner/{summonerId}")
    MatchList getMatchListBySummonerId(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
