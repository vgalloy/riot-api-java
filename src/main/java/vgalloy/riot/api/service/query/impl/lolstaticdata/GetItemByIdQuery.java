package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.lolstaticdata.dto.ItemDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetItemByIdQuery extends AbstractQuery<GetItemByIdQuery, ItemDto> {

    private final long itemId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param itemId           the item Id
     */
    public GetItemByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long itemId) {
        super(riotWebApi, defaultParameter);
        this.itemId = itemId;
    }

    @Override
    protected ItemDto executeWithError() {
        return riotWebApi.getItemById(getRegion(), itemId, getRiotApiKeyValue());
    }
}
