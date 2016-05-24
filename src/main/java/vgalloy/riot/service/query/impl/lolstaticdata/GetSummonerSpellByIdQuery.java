package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.lolstaticdata.dto.SummonerSpellDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellByIdQuery extends AbstractQuery<SummonerSpellDto> {

    private final long summonerSpellId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerSpellId  the summoner spell id
     */
    public GetSummonerSpellByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerSpellId) {
        super(riotWebApi, defaultParameter);
        this.summonerSpellId = summonerSpellId;
    }

    @Override
    public SummonerSpellDto execute() {
        return riotWebApi.getSummonerSpellById(getRegion(), summonerSpellId, getRiotApiKeyValue());
    }
}
