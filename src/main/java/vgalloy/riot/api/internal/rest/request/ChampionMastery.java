package vgalloy.riot.api.internal.rest.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.dto.championmastery.ChampionMasteryDto;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 20/05/16.
 *
 * @author Vincent Galloy
 */
public interface ChampionMastery {

    /**
     * Get a champion mastery by player id and champion id.
     *
     * @param region     the region
     * @param summonerId the summoner id
     * @param championId the champion id
     * @param apiKey     the rest key
     * @return the champion mastery
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}/by-champion/{championId}")
    ChampionMasteryDto getChampionMasteryByChampion(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @PathParam("championId") long championId, @QueryParam("api_key") String apiKey);

    /**
     * Get all champion mastery entries sorted by number of champion points descending.
     *
     * @param region     the region
     * @param summonerId summoner id
     * @param apiKey     the rest key
     * @return the list with all champion mastery
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}")
    List<ChampionMasteryDto> getChampionMastery(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);

    /**
     * Get a player's total champion mastery score, which is sum of individual champion mastery levels.
     *
     * @param region     the region
     * @param summonerId the summoner id
     * @param apiKey     the rest key
     * @return the player score
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/champion-mastery/v3/scores/by-summoner/{summonerId}")
    int getPlayerScore(@PathParam("region") SmallCaseRegion region, @PathParam("summonerId") long summonerId, @QueryParam("api_key") String apiKey);
}
