package com.vgalloy.riot.library.api.query.impl.match;

import java.util.List;

import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
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
