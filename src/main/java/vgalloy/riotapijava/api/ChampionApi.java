package vgalloy.riotapijava.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import vgalloy.riotapijava.dto.ChampionDto;
import vgalloy.riotapijava.dto.ChampionListDto;
import vgalloy.riotapijava.dto.constant.Region;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public interface ChampionApi {

    /**
     * Gets the list of champion.
     *
     * @return the champions
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion")
    ChampionListDto getChampionList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Gets the champion information.
     *
     * @param id the champion id
     * @return the champion information
     */
    @GET
    @Path("https://{region}.api.pvp.net/api/lol/{region}/v1.2/champion/{id}")
    ChampionDto getChampionById(@PathParam("region") Region region, @PathParam("id") Long id, @QueryParam("api_key") String key);
}
