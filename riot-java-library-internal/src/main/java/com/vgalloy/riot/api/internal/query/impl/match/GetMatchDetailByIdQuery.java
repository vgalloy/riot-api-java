package com.vgalloy.riot.api.internal.query.impl.match;

import com.vgalloy.riot.library.api.dto.mach.MatchDetail;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetMatchDetailByIdQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.match.GetMatchDetailByIdQuery, MatchDetail> {

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
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.matchId = matchId;
    }

    @Override
    public MatchDetail execute() {
        return riotWebApi.getMatchDetailById(SmallCaseRegion.of(getRegion()), matchId, includeTimeline, getRiotApiKeyValue());
    }

    /**
     * Set the flag indicating whether or not to include match timeline data.
     *
     * @param includeTimeline include Timeline
     * @return this
     */
    public com.vgalloy.riot.library.api.query.impl.match.GetMatchDetailByIdQuery includeTimeline(boolean includeTimeline) {
        this.includeTimeline = includeTimeline;
        return this;
    }
}
