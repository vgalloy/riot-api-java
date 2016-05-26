package vgalloy.riot.service.query.impl.summoner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.request.summoner.dto.MasteryPagesDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetSummonersMasteriesByIdsQuery extends AbstractQuery<Map<String, MasteryPagesDto>> {

    private final List<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
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
    public Map<String, MasteryPagesDto> executeWithError() {
        return riotWebApi.getSummonersMasteriesByIds(getRegion(), convert(summonerIds), getRiotApiKeyValue());
    }
}
