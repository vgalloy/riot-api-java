package vgalloy.riot.api.api.query.impl.matchlist;

import vgalloy.riot.api.api.dto.matchlist.MatchList;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.api.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchListBySummonerIdQuery extends AbstractQuery<GetMatchListBySummonerIdQuery, MatchList> {

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
