package vgalloy.riot.api.lolstatus;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.lolstatus.dto.Shard;
import vgalloy.riot.api.lolstatus.dto.ShardStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public interface LolStatusApi {

    /**
     * Get shard list.
     *
     * @param region the summoners region
     * @param key    the api key
     * @return the shard list
     */
    @GET
    @Path("https://{region}.api.pvp.net/shared")
    List<Shard> getShardList(@PathParam("region") Region region, @QueryParam("api_key") String key);

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     *
     * @param region      the summoners region
     * @param shardRegion the shard region
     * @param key         the api key
     * @return the shard
     */
    @GET
    @Path("https://{region}.api.pvp.net/shared/{shardRegion}")
    ShardStatus getShardList(@PathParam("region") Region region, @PathParam("shardRegion") String shardRegion, @QueryParam("api_key") String key);
}