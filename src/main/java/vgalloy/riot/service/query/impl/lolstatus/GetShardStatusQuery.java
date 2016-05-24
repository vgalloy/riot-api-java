package vgalloy.riot.service.query.impl.lolstatus;

import vgalloy.riot.api.request.lolstatus.dto.ShardStatus;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardStatusQuery extends AbstractQuery<ShardStatus> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetShardStatusQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public ShardStatus execute() {
        return riotWebApi.getShardStatus(getRegion(), getRegion(), getRiotApiKeyValue()); // TODO simplification ?
    }
}
