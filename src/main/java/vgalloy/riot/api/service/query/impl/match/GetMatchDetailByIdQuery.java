package vgalloy.riot.api.service.query.impl.match;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.mach.dto.MatchDetail;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchDetailByIdQuery extends AbstractQuery<MatchDetail> {

    private final long matchId;
    private boolean includeTimeline;

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
    protected MatchDetail executeWithError() {
        return riotWebApi.getMatchDetailById(getRegion(), matchId, includeTimeline, getRiotApiKeyValue());
    }

    /**
     * Set the flag indicating whether or not to include match timeline data.
     *
     * @param includeTimeline include Timeline
     * @return this
     */
    public GetMatchDetailByIdQuery includeTimeline(boolean includeTimeline) {
        this.includeTimeline = includeTimeline;
        return this;
    }
}
