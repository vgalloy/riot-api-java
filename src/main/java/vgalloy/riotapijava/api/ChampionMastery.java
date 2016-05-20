package vgalloy.riotapijava.api;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import vgalloy.riotapijava.dto.ChampionMasteryDto;
import vgalloy.riotapijava.dto.constant.PlatformId;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public interface ChampionMastery {

    /**
     * Gets the champion mastery.
     *
     * @param platformId platform id
     * @param playerId   the player id
     * @param championId the champion id
     * @param key        the api key
     * @return the champion mastery
     */
    @GET
    @Path("https://euw.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champion/{championId}")
    ChampionMasteryDto getChampionMasteryByChampion(@PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @PathParam("championId") String championId, @QueryParam("api_key") String key);

    /**
     * Gets all the champion mastery for a player.
     *
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the list with all champion mastery
     */
    @GET
    @Path("https://euw.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/champions")
    List<ChampionMasteryDto> getChampionMastery(@PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String key);

    /**
     * Gets the score of the player.
     *
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the player score
     */
    @GET
    @Path("https://euw.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/score")
    int getPlayerScore(@PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String key);

    /**
     * Gets the top champion mastery.
     *
     * @param platformId platform id
     * @param playerId   the player id
     * @param key        the api key
     * @return the player score
     */
    @GET
    @Path("https://euw.api.pvp.net/championmastery/location/{platformId}/player/{playerId}/topchampions")
    List<ChampionMasteryDto> getTopChampion(@PathParam("platformId") PlatformId platformId, @PathParam("playerId") String playerId, @QueryParam("api_key") String key);
}
