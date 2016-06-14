package vgalloy.riot.api.service.query.impl.summoner;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.summoner.dto.SummonerDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
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
        return riotWebApi.getSummonersByNames(getRegion(), convert(summonerNames), getRiotApiKeyValue());
    }
}
