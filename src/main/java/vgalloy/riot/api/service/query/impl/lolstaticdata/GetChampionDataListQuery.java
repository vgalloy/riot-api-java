package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.lolstaticdata.dto.ChampionListDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetChampionDataListQuery extends AbstractQuery<GetChampionDataListQuery, ChampionListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetChampionDataListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected ChampionListDto executeWithError() {
        return riotWebApi.getChampionDataList(getRegion(), getRiotApiKeyValue());
    }
}
