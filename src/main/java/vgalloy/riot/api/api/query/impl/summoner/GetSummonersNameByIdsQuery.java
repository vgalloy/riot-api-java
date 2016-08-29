package vgalloy.riot.api.api.query.impl.summoner;

import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetSummonersNameByIdsQuery extends AbstractQuery<GetSummonersNameByIdsQuery, Map<String, String>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner ids
     */
    public GetSummonersNameByIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public GetSummonersNameByIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    protected Map<String, String> executeWithError() {
        return riotWebApi.getSummonersNameByIds(SmallCaseRegion.of(getRegion()), convert(summonerIds), getRiotApiKeyValue());
    }
}
