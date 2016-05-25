package vgalloy.riot.api.request.stats;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.stats.dto.PlayerStatsSummaryListDto;
import vgalloy.riot.api.request.stats.dto.RankedStatsDto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public interface StatsApi {

    /**
     * Get ranked stats by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the api key
     * @return the summoner ranked statistic
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/ranked")
    RankedStatsDto getSummonerRankedStats(@PathParam("region") Region region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);

    /**
     * Get player stats summaries by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the api key
     * @return the summoner summary statistic
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/summary")
    PlayerStatsSummaryListDto getPlayerStatsSummary(@PathParam("region") Region region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
