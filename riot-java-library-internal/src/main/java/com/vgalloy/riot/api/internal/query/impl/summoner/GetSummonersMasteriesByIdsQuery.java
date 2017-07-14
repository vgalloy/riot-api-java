package com.vgalloy.riot.api.internal.query.impl.summoner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.vgalloy.riot.library.api.dto.summoner.MasteryPagesDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetSummonersMasteriesByIdsQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersMasteriesByIdsQuery, Map<String, MasteryPagesDto>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner ids
     */
    public GetSummonersMasteriesByIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersMasteriesByIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, MasteryPagesDto> execute() {
        return riotWebApi.getSummonersMasteriesByIds(SmallCaseRegion.of(getRegion()), convert(summonerIds), getRiotApiKeyValue());
    }
}
