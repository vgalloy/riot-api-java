package vgalloy.riot.api.api.query.impl.champion;

import vgalloy.riot.api.api.dto.champion.ChampionDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class GetChampionByIdQuery extends AbstractQuery<GetChampionByIdQuery, ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion id
     */
    public GetChampionByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        super(riotWebApi, defaultParameter);
        this.championId = championId;
    }

    @Override
    protected ChampionDto executeWithError() {
        return riotWebApi.getChampionById(SmallCaseRegion.of(getRegion()), championId, getRiotApiKeyValue());
    }
}
