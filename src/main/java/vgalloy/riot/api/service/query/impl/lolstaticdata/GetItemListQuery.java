package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.lolstaticdata.dto.ItemListDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

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
        return riotWebApi.getItemList(getRegion(), getRiotApiKeyValue());
    }
}
