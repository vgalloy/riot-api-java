package vgalloy.riot.api.request.championmastery;

import vgalloy.riot.api.constant.PlatformId;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.championmastery.dto.ChampionMasteryDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;

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
     * @param key        the api key
     * @return the champion mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champion/{championId}")
    ChampionMasteryDto getChampionMasteryByChampion(@PathParam("region") Region region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @PathParam("championId") String championId, @QueryParam("api_key") String apiKey);

    /**
     * Get all champion mastery entries sorted by number of champion points descending.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the list with all champion mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champions")
    List<ChampionMasteryDto> getChampionMastery(@PathParam("region") Region region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String apiKey);

    /**
     * Get a player's total champion mastery score, which is sum of individual champion mastery levels.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the player score
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/score")
    int getPlayerScore(@PathParam("region") Region region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String apiKey);

    /**
     * Get specified number of top champion mastery entries sorted by number of champion points descending.
     *
     * @param region     the region
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the player score
     */
    @GET
    @Path("https://{region}.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/topchampions")
    List<ChampionMasteryDto> getTopChampion(@PathParam("region") Region region, @PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String apiKey);
}
