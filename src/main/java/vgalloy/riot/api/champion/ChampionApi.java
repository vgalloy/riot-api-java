package vgalloy.riot.api.champion;

import vgalloy.riot.api.champion.dto.ChampionDto;
import vgalloy.riot.api.champion.dto.ChampionListDto;
import vgalloy.riot.api.constant.Region;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface ChampionApi {

    /**
     * Retrieve all champions.
     *
     * @param region the region
     * @param key    the api key
     * @return the champions information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion")
    ChampionListDto getChampionList(@PathParam("region") Region region, @QueryParam("api_key") String key); // TODO renomé toute les key en api_key ?

    /**
     * Retrieve champion by ID.
     *
     * @param region the region
     * @param id     the champion id
     * @param key    the api key
     * @return the champion information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion/{id}")
    ChampionDto getChampionById(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);
}
