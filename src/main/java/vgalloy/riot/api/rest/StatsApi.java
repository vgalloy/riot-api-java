package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.PlayerStatsSummaryListDto;
import vgalloy.riot.api.dto.RankedStatsDto;
import vgalloy.riot.api.dto.constant.Region;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public interface StatsApi {

    /**
     * Get ranked stats by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param key        the api key
     * @return the summoner ranked statistic
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/ranked")
    RankedStatsDto getSummonerRankedStats(@PathParam("region") Region region, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);

    /**
     * Get player stats summaries by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param key        the api key
     * @return the summoner summary statistic
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/summary")
    PlayerStatsSummaryListDto getSummonerSummaryStats(@PathParam("region") Region region, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}
