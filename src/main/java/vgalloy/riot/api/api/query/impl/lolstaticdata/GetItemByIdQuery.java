package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.ItemDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
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
        return riotWebApi.getItemById(SmallCaseRegion.of(getRegion()), itemId, getRiotApiKeyValue());
    }
}
