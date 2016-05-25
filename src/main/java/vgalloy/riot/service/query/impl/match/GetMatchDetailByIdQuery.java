package vgalloy.riot.service.query.impl.match;

import vgalloy.riot.api.request.mach.dto.MatchDetail;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchDetailByIdQuery extends AbstractQuery<MatchDetail> {

    private final long matchId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param matchId          the match id
     */
    public GetMatchDetailByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long matchId) {
        super(riotWebApi, defaultParameter);
        this.matchId = matchId;
    }

    @Override
    public MatchDetail execute() {
        return riotWebApi.getMatchDetailById(getRegion(), matchId, getRiotApiKeyValue());
    }
}
