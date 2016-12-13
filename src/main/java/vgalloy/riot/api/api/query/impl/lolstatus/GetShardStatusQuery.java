package vgalloy.riot.api.api.query.impl.lolstatus;

import vgalloy.riot.api.api.dto.lolstatus.ShardStatus;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardStatusQuery extends AbstractQuery<GetShardStatusQuery, ShardStatus> {

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
        return riotWebApi.getShardStatus(SmallCaseRegion.of(getRegion()));
    }
}
