package vgalloy.riot.api.internal.rest.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.constant.PlatformId;
import vgalloy.riot.api.api.dto.championmastery.ChampionMasteryDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public interface ChampionMastery {

    /**
     * Get a champion mastery by player id and champion id.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param championId the champion id
     * @param apiKey     the rest key
     * @return the champion mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champion/{championId}")
    ChampionMasteryDto getChampionMasteryByChampion(@PathParam("region") SmallCaseRegion region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") long playerId, @PathParam("championId") long championId, @QueryParam("api_key") String apiKey);

    /**
     * Get all champion mastery entries sorted by number of champion points descending.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param apiKey     the rest key
     * @return the list with all champion mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champions")
    List<ChampionMasteryDto> getChampionMastery(@PathParam("region") SmallCaseRegion region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") long playerId, @QueryParam("api_key") String apiKey);

    /**
     * Get a player's total champion mastery score, which is sum of individual champion mastery levels.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param apiKey     the rest key
     * @return the player score
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/score")
    int getPlayerScore(@PathParam("region") SmallCaseRegion region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") long playerId, @QueryParam("api_key") String apiKey);

    /**
     * Get specified number of top champion mastery entries sorted by number of champion points descending.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param count      the number of entries to retrieve, defaults to 3
     * @param apiKey     the rest key
     * @return the player score
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/topchampions")
    List<ChampionMasteryDto> getTopChampion(@PathParam("region") SmallCaseRegion region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") long playerId, @QueryParam("count") int count, @QueryParam("api_key") String apiKey);
}
