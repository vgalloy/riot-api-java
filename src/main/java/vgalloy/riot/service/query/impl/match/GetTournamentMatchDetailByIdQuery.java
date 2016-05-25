package vgalloy.riot.service.query.impl.match;

import vgalloy.riot.api.request.mach.dto.MatchDetail;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetTournamentMatchDetailByIdQuery extends AbstractQuery<MatchDetail> {

    private final long tournamentMatchId;

    /**
     * Constructor.
     *
     * @param riotWebApi        the riot web api for execute query
     * @param defaultParameter  the default query parameter
     * @param tournamentMatchId the tournament code
     */
    public GetTournamentMatchDetailByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long tournamentMatchId) {
        super(riotWebApi, defaultParameter);
        this.tournamentMatchId = tournamentMatchId;
    }

    @Override
    public MatchDetail executeWithError() {
        return riotWebApi.getMatchDetailById(getRegion(), tournamentMatchId, getRiotApiKeyValue());
    }
}
