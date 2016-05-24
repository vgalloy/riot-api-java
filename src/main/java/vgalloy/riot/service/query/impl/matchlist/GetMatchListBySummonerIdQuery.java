package vgalloy.riot.service.query.impl.matchlist;

import vgalloy.riot.api.matchlist.dto.MatchList;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchListBySummonerIdQuery extends AbstractQuery<MatchList> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetMatchListBySummonerIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    public MatchList execute() {
        return riotWebApi.getMatchListBySummonerId(getRegion(), String.valueOf(summonerId), getRiotApiKeyValue()); // TODO String.valueOf ... un long dans l'interface c'est pas mal aussi
    }
}