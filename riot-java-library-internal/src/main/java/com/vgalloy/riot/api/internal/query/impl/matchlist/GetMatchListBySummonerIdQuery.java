package com.vgalloy.riot.api.internal.query.impl.matchlist;

import com.vgalloy.riot.library.api.dto.matchlist.MatchList;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetMatchListBySummonerIdQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.matchlist.GetMatchListBySummonerIdQuery, MatchList> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetMatchListBySummonerIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected MatchList executeWithError() {
        return riotWebApi.getMatchListBySummonerId(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
