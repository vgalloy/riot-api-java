package vgalloy.riot.api.rest;

import vgalloy.riot.api.dto.ChampionDto;
import vgalloy.riot.api.dto.ChampionListDto;
import vgalloy.riot.api.dto.ItemDto;
import vgalloy.riot.api.dto.ItemListDto;
import vgalloy.riot.api.dto.LanguageStringsDto;
import vgalloy.riot.api.dto.MapDataDto;
import vgalloy.riot.api.dto.MasteryDto;
import vgalloy.riot.api.dto.MasteryListDto;
import vgalloy.riot.api.dto.RealmDto;
import vgalloy.riot.api.dto.RuneDto;
import vgalloy.riot.api.dto.RuneListDto;
import vgalloy.riot.api.dto.SummonerSpellDto;
import vgalloy.riot.api.dto.SummonerSpellListDto;
import vgalloy.riot.api.dto.constant.Region;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface LolStaticDataApi {

    /**
     * Retrieves champion list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the champions information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/champion")
    ChampionListDto getSummonerByNames(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves a champion by its id.
     *
     * @param region the summoners region
     * @param id     the champion id
     * @param key    the api key
     * @return the champion information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/champion/{id}")
    ChampionDto getSummonerByNames(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);

    /**
     * Retrieves item list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the items
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/item")
    ItemListDto getItemList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves item by its unique id.
     *
     * @param region the summoners region
     * @param id     the item id
     * @param key    the api key
     * @return the item
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/item/{id}")
    ItemDto getItem(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);

    /**
     * Retrieve language strings data.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the language strings data
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/language-strings")
    LanguageStringsDto getLanguageString(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieve supported languages data.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the language data
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/languages")
    List<String> getLanguage(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieve map data.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the map data
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/map")
    MapDataDto getMap(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves mastery list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the masteries
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/mastery")
    MasteryListDto getMasteryList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves mastery item by its unique id.
     *
     * @param region the summoners region
     * @param id     the mastery id
     * @param key    the api key
     * @return the mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/mastery/{id}")
    MasteryDto getMastery(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);

    /**
     * Retrieve realm data.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the mastery
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/realm")
    RealmDto getRealm(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves rune list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the rune list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/rune")
    RuneListDto getRuneList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves rune by its unique id.
     *
     * @param region the summoners region
     * @param id     the rune id
     * @param key    the api key
     * @return the rune
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/rune/{id}")
    RuneDto getRune(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);

    /**
     * Retrieves summoner spell list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the summoner spell list
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/summoner-spell")
    SummonerSpellListDto getSummonerSpellList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Retrieves summoner spell by its unique id.
     *
     * @param region the summoners region
     * @param id     the summoner spell id
     * @param key    the api key
     * @return the summoner spell
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/summoner-spell/{id}")
    SummonerSpellDto getSummonerSpell(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);

    /**
     * Retrieves version data.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the version data
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/static-data/{region}/v1.2/version")
    List<String> getVersionList(@PathParam("region") Region region, @QueryParam("api_key") String key);
}
