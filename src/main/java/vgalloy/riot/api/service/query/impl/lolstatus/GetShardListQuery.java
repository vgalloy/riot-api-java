package vgalloy.riot.api.service.query.impl.lolstatus;

import java.util.List;

import vgalloy.riot.api.rest.request.lolstatus.dto.Shard;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardListQuery extends AbstractQuery<List<Shard>> {

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
