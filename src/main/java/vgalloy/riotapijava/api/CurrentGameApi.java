package vgalloy.riotapijava.api;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import vgalloy.riotapijava.dto.CurrentGameInfo;
import vgalloy.riotapijava.dto.constant.PlatformId;
/**
 * Created by Vincent Galloy on 19/05/16.
 */
public interface CurrentGameApi {

    @GET
    @Path("https://euw.api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summonerId}")
    CurrentGameInfo getCurrentGame(@PathParam("platformId") PlatformId platformId, @PathParam("summonerId") String summonerId, @QueryParam("api_key") String key);
}
