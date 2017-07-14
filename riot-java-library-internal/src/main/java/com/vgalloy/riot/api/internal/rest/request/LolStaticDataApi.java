package com.vgalloy.riot.api.internal.rest.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.vgalloy.riot.library.api.dto.lolstaticdata.ChampionDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ChampionListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ItemDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ItemListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.LanguageStringsDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MapDataDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MasteryDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MasteryListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RealmDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RuneDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RuneListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.SummonerSpellDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.SummonerSpellListDto;
import com.vgalloy.riot.api.internal.rest.annotation.RiotNoLimitRate;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public interface LolStaticDataApi {

    /**
     * Retrieves champion list.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the champions information
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/champion")
    @RiotNoLimitRate
    ChampionListDto getChampionDataList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves a champion by its id.
     *
     * @param region the summoners region
     * @param id     the champion id
     * @param apiKey the rest key
     * @return the champion information
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/champion/{id}")
    @RiotNoLimitRate
    ChampionDto getChampionDataById(@PathParam("region") SmallCaseRegion region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves item list.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the items
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/item")
    @RiotNoLimitRate
    ItemListDto getItemList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves item by its unique id.
     *
     * @param region the summoners region
     * @param id     the item id
     * @param apiKey the rest key
     * @return the item
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/item/{id}")
    @RiotNoLimitRate
    ItemDto getItemById(@PathParam("region") SmallCaseRegion region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve language strings data.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the language strings data
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/language-strings")
    @RiotNoLimitRate
    LanguageStringsDto getLanguageString(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve supported languages data.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the language data
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/languages")
    @RiotNoLimitRate
    List<String> getLanguage(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve map data.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the map data
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/map")
    @RiotNoLimitRate
    MapDataDto getMap(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves mastery list.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the masteries
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/mastery")
    @RiotNoLimitRate
    MasteryListDto getMasteryList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves mastery item by its unique id.
     *
     * @param region the summoners region
     * @param id     the mastery id
     * @param apiKey the rest key
     * @return the mastery
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/mastery/{id}")
    @RiotNoLimitRate
    MasteryDto getMasteryById(@PathParam("region") SmallCaseRegion region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve realm data.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the mastery
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/realm")
    @RiotNoLimitRate
    RealmDto getRealm(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves rune list.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the rune list
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/rune")
    @RiotNoLimitRate
    RuneListDto getRuneList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves rune by its unique id.
     *
     * @param region the summoners region
     * @param id     the rune id
     * @param apiKey the rest key
     * @return the rune
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/rune/{id}")
    @RiotNoLimitRate
    RuneDto getRuneById(@PathParam("region") SmallCaseRegion region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves summoner spell list.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the summoner spell list
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/summoner-spell")
    @RiotNoLimitRate
    SummonerSpellListDto getSummonerSpellList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves summoner spell by its unique id.
     *
     * @param region the summoners region
     * @param id     the summoner spell id
     * @param apiKey the rest key
     * @return the summoner spell
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/summoner-spell/{id}")
    @RiotNoLimitRate
    SummonerSpellDto getSummonerSpellById(@PathParam("region") SmallCaseRegion region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);

    /**
     * Retrieves version data.
     *
     * @param region the summoners region
     * @param apiKey the rest key
     * @return the version data
     */
    @GET
    @Path("https://global.api.pvp.net/api/lol/static-data/{region}/v1.2/versions")
    @RiotNoLimitRate
    List<String> getVersionList(@PathParam("region") SmallCaseRegion region, @QueryParam("api_key") String apiKey);
}
