package com.vgalloy.riot.api.internal.query.impl.lolstatus;

import java.util.List;

import com.vgalloy.riot.library.api.dto.lolstatus.Shard;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetShardListQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.lolstatus.GetShardListQuery, List<Shard>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetShardListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
    }

    @Override
    public List<Shard> execute() {
        return riotWebApi.getShardList();
    }
}
