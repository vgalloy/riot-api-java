package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.SummonerSpellDto;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.api.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellByIdQuery extends AbstractQuery<GetSummonerSpellByIdQuery, SummonerSpellDto> {

    private final long summonerSpellId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerSpellId  the summoner spell id
     */
    public GetSummonerSpellByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerSpellId) {
        super(riotWebApi, defaultParameter);
        this.summonerSpellId = summonerSpellId;
    }

    @Override
    protected SummonerSpellDto executeWithError() {
        return riotWebApi.getSummonerSpellById(SmallCaseRegion.of(getRegion()), summonerSpellId, getRiotApiKeyValue());
    }
}
