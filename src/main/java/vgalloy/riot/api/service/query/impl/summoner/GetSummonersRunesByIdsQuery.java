package vgalloy.riot.api.service.query.impl.summoner;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.summoner.dto.RunePagesDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetSummonersRunesByIdsQuery extends AbstractQuery<GetSummonersRunesByIdsQuery, Map<String, RunePagesDto>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner ids
     */
    public GetSummonersRunesByIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public GetSummonersRunesByIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    protected Map<String, RunePagesDto> executeWithError() {
        return riotWebApi.getSummonersRunesByIds(getRegion(), convert(summonerIds), getRiotApiKeyValue());
    }
}
