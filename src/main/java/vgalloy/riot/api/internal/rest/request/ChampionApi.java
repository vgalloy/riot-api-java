package vgalloy.riot.api.internal.rest.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import vgalloy.riot.api.api.dto.champion.ChampionDto;
import vgalloy.riot.api.api.dto.champion.ChampionListDto;
import vgalloy.riot.api.internal.rest.annotation.RiotNoLimitRate;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public interface ChampionApi {

    /**
     * Retrieve all champions.
     *
     * @param region     the region
     * @param freeToPlay the optional filter param to retrieve only free to play champions
     * @param apiKey     the rest key
     * @return the champions information
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/platform/v3/champions")
    ChampionListDto getChampionList(@PathParam("region") SmallCaseRegion region, @QueryParam("freeToPlay") boolean freeToPlay, @QueryParam("api_key") String apiKey);

    /**
     * Retrieve champion by id.
     *
     * @param region the region
     * @param id     the champion id
     * @param apiKey the rest key
     * @return the champion information
     */
    @GET
    @Path("https://{region}.api.riotgames.com/lol/platform/v3/champions/{id}")
    @RiotNoLimitRate
    ChampionDto getChampionById(@PathParam("region") SmallCaseRegion region, @PathParam("id") long id, @QueryParam("api_key") String apiKey);
}
