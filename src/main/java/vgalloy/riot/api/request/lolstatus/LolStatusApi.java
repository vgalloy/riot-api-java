package vgalloy.riot.api.request.lolstatus;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import vgalloy.riot.api.constant.Region;
import vgalloy.riot.api.request.lolstatus.dto.Shard;
import vgalloy.riot.api.request.lolstatus.dto.ShardStatus;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public interface LolStatusApi {

    /**
     * Get shard list.
     *
     * @return the shard list
     */
    @GET
    @Path("http://status.leagueoflegends.com/shards")
    List<Shard> getShardList();

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     *
     * @param shardRegion the shard region
     * @return the shard
     */
    @GET
    @Path("http://status.leagueoflegends.com/shards/{shardRegion}")
    ShardStatus getShardStatus(@PathParam("shardRegion") Region shardRegion);
}
