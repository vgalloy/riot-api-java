package vgalloy.riot.api.service.query.impl.match;

import vgalloy.riot.api.rest.request.mach.dto.MatchDetail;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchDetailByIdQuery extends AbstractQuery<MatchDetail> {

    private final long matchId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param matchId          the match id
     */
    public GetMatchDetailByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long matchId) {
        super(riotWebApi, defaultParameter);
        this.matchId = matchId;
    }

    @Override
    public MatchDetail executeWithError() {
        return riotWebApi.getMatchDetailById(getRegion(), matchId, getRiotApiKeyValue());
    }
}
