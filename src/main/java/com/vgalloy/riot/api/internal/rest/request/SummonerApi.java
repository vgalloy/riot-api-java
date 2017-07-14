package com.vgalloy.riot.api.internal.rest.request;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.library.api.dto.summoner.MasteryPagesDto;
import com.vgalloy.riot.library.api.dto.summoner.RunePagesDto;
import com.vgalloy.riot.library.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public interface SummonerApi {

    /**
     * Get summoner objects mapped by standardized summoner name for a given list of summoner names.
     *
     * @param region        the summoners region
     * @param summonerNames the summoners name
     * @param apiKey        the rest key
     * @return a map with the name of the summoners and the information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/by-name/{summonerNames}")
    Map<String, SummonerDto> getSummonersByNames(@PathParam("region") SmallCaseRegion region, @PathParam("summonerNames") String summonerNames, @QueryParam("api_key") String apiKey);

    /**
     * Get summoner objects mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners id
     * @param apiKey      the rest key
     * @return a map with the name of the summoners and the information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}")
    Map<String, SummonerDto> getSummonersByIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get mastery pages mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the rest key
     * @return a map with the ids of the summoners and the masteries
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/masteries")
    Map<String, MasteryPagesDto> getSummonersMasteriesByIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get summoner names mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the rest key
     * @return a map with the ids of the summoners and the names
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/name")
    Map<String, String> getSummonersNameByIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);

    /**
     * Get rune pages mapped by summoner id for a given list of summoner ids.
     *
     * @param region      the summoners region
     * @param summonerIds the summoners ids
     * @param apiKey      the rest key
     * @return a map with the ids of the summoners and the runes
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.4/summoner/{summonerIds}/runes")
    Map<String, RunePagesDto> getSummonersRunesByIds(@PathParam("region") SmallCaseRegion region, @PathParam("summonerIds") String summonerIds, @QueryParam("api_key") String apiKey);
}
