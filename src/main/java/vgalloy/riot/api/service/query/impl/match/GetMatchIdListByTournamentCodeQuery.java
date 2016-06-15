package vgalloy.riot.api.service.query.impl.match;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchIdListByTournamentCodeQuery extends AbstractQuery<GetMatchIdListByTournamentCodeQuery, List<Long>> {

    private final String tournamentCode;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param tournamentCode   the tournament code
     */
    public GetMatchIdListByTournamentCodeQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String tournamentCode) {
        super(riotWebApi, defaultParameter);
        this.tournamentCode = tournamentCode;
    }

    @Override
    protected List<Long> executeWithError() {
        return riotWebApi.getMatchIdList(getRegion(), tournamentCode, getRiotApiKeyValue());
    }
}
