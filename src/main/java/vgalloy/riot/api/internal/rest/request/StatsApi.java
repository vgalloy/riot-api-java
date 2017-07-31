package vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.dto.stats.PlayerStatsSummaryListDto;
import vgalloy.riot.api.api.dto.stats.RankedStatsDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public interface StatsApi {

    /**
     * Get ranked stats by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the summoner ranked statistic
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/{region}/v1.3/stats/by-summoner/{summonerId}/ranked")
    RankedStatsDto getRankedStats(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);

    /**
     * Get player stats summaries by summoner ID.
     *
     * @param region     the summoners region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the summoner summary statistic
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/{region}/v1.3/stats/by-summoner/{summonerId}/summary")
    PlayerStatsSummaryListDto getPlayerStatsSummary(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
