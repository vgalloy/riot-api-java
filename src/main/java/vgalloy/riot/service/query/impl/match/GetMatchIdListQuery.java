package vgalloy.riot.service.query.impl.match;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMatchIdListQuery extends AbstractQuery<List<Long>> {

    private final long tournamentCode;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param tournamentCode   the tournament code
     */
    public GetMatchIdListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long tournamentCode) {
        super(riotWebApi, defaultParameter);
        this.tournamentCode = tournamentCode;
    }

    @Override
    public List<Long> execute() {
        return riotWebApi.getMatchIdList(getRegion(), String.valueOf(tournamentCode), getRiotApiKeyValue()); // TODO String.valueOf ... un long dans l'interface c'est pas mal aussi
    }
}
