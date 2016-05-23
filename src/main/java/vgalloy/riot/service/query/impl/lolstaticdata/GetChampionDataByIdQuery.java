package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.lolstaticdata.dto.ChampionDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetChampionDataByIdQuery extends AbstractQuery<ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion Id
     */
    public GetChampionDataByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        super(riotWebApi, defaultParameter);
        this.championId = championId;
    }

    @Override
    public ChampionDto execute() {
        return riotWebApi.getChampionDataById(getRegion(), championId, getRiotApiKeyValue());
    }
}
