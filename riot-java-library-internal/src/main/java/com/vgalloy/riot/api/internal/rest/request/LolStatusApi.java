package com.vgalloy.riot.api.internal.rest.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.vgalloy.riot.library.api.dto.lolstatus.Shard;
import com.vgalloy.riot.library.api.dto.lolstatus.ShardStatus;
import com.vgalloy.riot.api.internal.rest.annotation.RiotNoLimitRate;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public interface LolStatusApi {

    /**
     * Get shard list.
     *
     * @return the shard list
     */
    @GET
    @Path("http://status.leagueoflegends.com/shards")
    @RiotNoLimitRate
    List<Shard> getShardList();

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     *
     * @param shardRegion the shard region
     * @return the shard
     */
    @GET
    @Path("http://status.leagueoflegends.com/shards/{shardRegion}")
    @RiotNoLimitRate
    ShardStatus getShardStatus(@PathParam("shardRegion") SmallCaseRegion shardRegion);
}
