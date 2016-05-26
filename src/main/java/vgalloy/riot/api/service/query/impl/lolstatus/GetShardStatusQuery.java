package vgalloy.riot.api.service.query.impl.lolstatus;

import vgalloy.riot.api.rest.request.lolstatus.dto.ShardStatus;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardStatusQuery extends AbstractQuery<ShardStatus> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetShardStatusQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected ShardStatus executeWithError() {
        return riotWebApi.getShardStatus(getRegion());
    }
}
