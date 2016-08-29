package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.ItemListDto;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.api.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetItemListQuery extends AbstractQuery<GetItemListQuery, ItemListDto> {

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
