package vgalloy.riot.api.request.champion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.champion.dto.ChampionDto;
import vgalloy.riot.api.request.champion.dto.ChampionListDto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface ChampionApi {

    /**
     * Retrieve all champions.
     *
     * @param region the region
     * @param apiKey the api key
     * @return the champions information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion")
    ChampionListDto getChampionList(@PathParam("region") Region region, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve champion by ID.
     *
     * @param region the region
     * @param id     the champion id
     * @param apiKey the api key
     * @return the champion information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion/{id}")
    ChampionDto getChampionById(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String apiKey);
}
