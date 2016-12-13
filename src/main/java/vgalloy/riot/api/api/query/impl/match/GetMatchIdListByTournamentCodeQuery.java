package vgalloy.riot.api.api.query.impl.match;

import java.util.List;

import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

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
        return riotWebApi.getMatchIdList(SmallCaseRegion.of(getRegion()), tournamentCode, getRiotApiKeyValue());
    }
}
