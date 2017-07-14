package com.vgalloy.riot.api.internal.query.impl.lolstatus;

import com.vgalloy.riot.api.api.dto.lolstatus.ShardStatus;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
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
