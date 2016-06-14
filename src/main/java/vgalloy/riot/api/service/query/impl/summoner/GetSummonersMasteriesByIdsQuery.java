package vgalloy.riot.api.service.query.impl.summoner;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.summoner.dto.MasteryPagesDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetSummonersMasteriesByIdsQuery extends AbstractQuery<GetSummonersMasteriesByIdsQuery, Map<String, MasteryPagesDto>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner ids
     */
    public GetSummonersMasteriesByIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public GetSummonersMasteriesByIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    protected Map<String, MasteryPagesDto> executeWithError() {
        return riotWebApi.getSummonersMasteriesByIds(getRegion(), convert(summonerIds), getRiotApiKeyValue());
    }
}
