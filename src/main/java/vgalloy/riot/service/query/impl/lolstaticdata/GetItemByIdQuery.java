package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.request.lolstaticdata.dto.ItemDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetItemByIdQuery extends AbstractQuery<ItemDto> {

    private final long itemId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param itemId           the item Id
     */
    public GetItemByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long itemId) {
        super(riotWebApi, defaultParameter);
        this.itemId = itemId;
    }

    @Override
    public ItemDto executeWithError() {
        return riotWebApi.getItemById(getRegion(), itemId, getRiotApiKeyValue());
    }
}
