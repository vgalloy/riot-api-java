package com.vgalloy.riot.library.api.query.impl.match;

import com.vgalloy.riot.library.api.dto.mach.MatchDetail;
import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetTournamentMatchDetailByIdQuery extends AbstractQuery<GetMatchDetailByIdQuery, MatchDetail> {

    private final long tournamentMatchId;

    /**
     * Constructor.
     *
     * @param riotWebApi        the riot web rest for execute query
     * @param defaultParameter  the default query parameter
     * @param tournamentMatchId the tournament match id
     */
    public GetTournamentMatchDetailByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long tournamentMatchId) {
        super(riotWebApi, defaultParameter);
        this.tournamentMatchId = tournamentMatchId;
    }

    @Override
    protected MatchDetail executeWithError() {
        return riotWebApi.getTournamentMatchDetailById(SmallCaseRegion.of(getRegion()), tournamentMatchId, getRiotApiKeyValue());
    }
}
