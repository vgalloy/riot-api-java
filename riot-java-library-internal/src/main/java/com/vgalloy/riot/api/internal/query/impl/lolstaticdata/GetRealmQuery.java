package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.RealmDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetRealmQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetRealmQuery, RealmDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetRealmQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
    }

    @Override
    public RealmDto execute() {
        return riotWebApi.getRealm(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
