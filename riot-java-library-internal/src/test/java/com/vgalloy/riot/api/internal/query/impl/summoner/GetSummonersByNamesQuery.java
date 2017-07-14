package com.vgalloy.riot.api.internal.query.impl.summoner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.vgalloy.riot.library.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetSummonersByNamesQuery extends AbstractQuery<GetSummonersByNamesQuery, Map<String, SummonerDto>> {

    private final List<String> summonerNames = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerNames    the summoner names
     */
    public GetSummonersByNamesQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... summonerNames) {
        super(riotWebApi, defaultParameter);
        addSummonerNames(summonerNames);
    }

    /**
     * Add summoner names.
     *
     * @param summonerNames the summoner names
     * @return this
     */
    public GetSummonersByNamesQuery addSummonerNames(String... summonerNames) {
        Collections.addAll(this.summonerNames, summonerNames);
        return this;
    }

    @Override
    protected Map<String, SummonerDto> executeWithError() {
        return riotWebApi.getSummonersByNames(SmallCaseRegion.of(getRegion()), convert(summonerNames), getRiotApiKeyValue());
    }
}
