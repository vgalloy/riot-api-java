package vgalloy.riot.api.api.query.impl.match;

import vgalloy.riot.api.api.dto.mach.MatchDetail;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchDetailByIdQuery extends AbstractQuery<GetMatchDetailByIdQuery, MatchDetail> {

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
        return riotWebApi.getMatchDetailById(SmallCaseRegion.of(getRegion()), matchId, includeTimeline, getRiotApiKeyValue());
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
