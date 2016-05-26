package vgalloy.riot.api.service.query.impl.match;

import vgalloy.riot.api.rest.request.mach.dto.MatchDetail;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetTournamentMatchDetailByIdQuery extends AbstractQuery<MatchDetail> {

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
        return riotWebApi.getMatchDetailById(getRegion(), tournamentMatchId, getRiotApiKeyValue());
    }
}
