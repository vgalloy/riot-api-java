package vgalloy.riot.api.service.query.impl.champion;

import vgalloy.riot.api.rest.request.champion.dto.ChampionDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class GetChampionByIdQuery extends AbstractQuery<ChampionDto> {

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
        return riotWebApi.getChampionById(getRegion(), championId, getRiotApiKeyValue());
    }
}
