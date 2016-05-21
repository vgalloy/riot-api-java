package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.MatchList;
import vgalloy.riot.api.dto.constant.Region;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public interface MatchListApi {

    /**
     * Retrieve match list by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param key        the api key
     * @return the match list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/api/lol/{region}/v2.2/matchlist/by-summoner/{summonerId}")
    MatchList getMatchList(@PathParam("region") Region region, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}
