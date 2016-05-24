package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.request.lolstaticdata.dto.RealmDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetRealmQuery extends AbstractQuery<RealmDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetRealmQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public RealmDto execute() {
        return riotWebApi.getRealm(getRegion(), getRiotApiKeyValue());
    }
}
