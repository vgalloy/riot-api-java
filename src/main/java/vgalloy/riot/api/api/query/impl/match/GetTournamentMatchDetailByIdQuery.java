package vgalloy.riot.api.api.query.impl.match;

import vgalloy.riot.api.api.dto.mach.MatchDetail;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
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
