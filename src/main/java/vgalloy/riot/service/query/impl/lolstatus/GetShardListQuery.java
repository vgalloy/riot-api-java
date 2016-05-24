package vgalloy.riot.service.query.impl.lolstatus;

import vgalloy.riot.api.request.lolstatus.dto.Shard;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetShardListQuery extends AbstractQuery<List<Shard>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetShardListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public List<Shard> execute() {
        return riotWebApi.getShardList(getRegion(), getRiotApiKeyValue());
    }
}
