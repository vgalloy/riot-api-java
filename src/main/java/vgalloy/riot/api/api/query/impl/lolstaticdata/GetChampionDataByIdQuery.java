package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.ChampionDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionDataByIdQuery extends AbstractQuery<GetChampionDataByIdQuery, ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion Id
     */
    public GetChampionDataByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        super(riotWebApi, defaultParameter);
        this.championId = championId;
    }

    @Override
    protected ChampionDto executeWithError() {
        return riotWebApi.getChampionDataById(SmallCaseRegion.of(getRegion()), championId, getRiotApiKeyValue());
    }
}
