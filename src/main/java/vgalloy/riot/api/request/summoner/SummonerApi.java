package vgalloy.riot.api.request.summoner;

import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.summoner.dto.MasteryPagesDto;
import vgalloy.riot.api.request.summoner.dto.RunePagesDto;
import vgalloy.riot.api.request.summoner.dto.SummonerDto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface SummonerApi {

    /**
     * Get summoner objects mapped by standardized summoner name for a given list of summoner names.
     *
     * @param region        the summoners region
     * @param summonerNames the summoners name
     * @param apiKey        the api key
     * @return a map with the name of the summoners and the information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/by-name/{summonerNames}")
    Map<String, SummonerDto> getSummonersByNames(@PathParam("region") Region region, @PathParam("summonerNames") String summonerNames, @QueryParam("api_key") String apiKey);

    /**
     * Get summoner objects mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners id
     * @param apiKey      the api key
     * @return a map with the name of the summoners and the information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}")
    Map<String, SummonerDto> getSummonersByIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get mastery pages mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the api key
     * @return a map with the ids of the summoners and the masteries
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/masteries")
    Map<String, MasteryPagesDto> getSummonersMasteriesByIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get summoner names mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the api key
     * @return a map with the ids of the summoners and the names
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/name")
    Map<String, String> getSummonersNameByIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get rune pages mapped by summoner ID for a given list of summoner IDs.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the api key
     * @return a map with the ids of the summoners and the runes
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/runes")
    Map<String, RunePagesDto> getSummonersRunesByIds(@PathParam("region") Region region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);
}
