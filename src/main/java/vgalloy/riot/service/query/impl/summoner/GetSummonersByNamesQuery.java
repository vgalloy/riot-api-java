package vgalloy.riot.service.query.impl.summoner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.request.summoner.dto.SummonerDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonersByNamesQuery extends AbstractQuery<Map<String, SummonerDto>> {

    private final List<String> summonerNames = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerNames    the summoner names
     */
    public GetSummonersByNamesQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... summonerNames) {
        super(riotWebApi, defaultParameter);
        Collections.addAll(this.summonerNames, summonerNames); //TODO Refacto
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
    public Map<String, SummonerDto> execute() {
        return riotWebApi.getSummonersByNames(getRegion(), convert(summonerNames), getRiotApiKeyValue());
    }

    // TODO Ajouter un add summoner
}
