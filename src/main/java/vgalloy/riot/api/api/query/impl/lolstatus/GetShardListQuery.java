package vgalloy.riot.api.api.query.impl.lolstatus;

import vgalloy.riot.api.api.dto.lolstatus.Shard;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardListQuery extends AbstractQuery<GetShardListQuery, List<Shard>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetShardListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected List<Shard> executeWithError() {
        return riotWebApi.getShardList();
    }
}