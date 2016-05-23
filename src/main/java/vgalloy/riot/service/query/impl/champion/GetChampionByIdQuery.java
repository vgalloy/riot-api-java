package vgalloy.riot.service.query.impl.champion;

import vgalloy.riot.api.champion.dto.ChampionDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class GetChampionByIdQuery extends AbstractQuery<ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion Id
     */
    public GetChampionByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        super(riotWebApi, defaultParameter);
        this.championId = championId;
    }

    @Override
    public ChampionDto execute() {
        return riotWebApi.getChampionById(getRegion(), championId, getRiotApiKeyValue());
    }
}
