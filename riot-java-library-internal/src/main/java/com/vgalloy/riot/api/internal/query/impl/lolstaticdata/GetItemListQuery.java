package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.api.api.dto.lolstaticdata.ItemListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetItemListQuery extends AbstractQuery<com.vgalloy.riot.api.api.query.impl.lolstaticdata.GetItemListQuery, ItemListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetItemListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected ItemListDto executeWithError() {
        return riotWebApi.getItemList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
