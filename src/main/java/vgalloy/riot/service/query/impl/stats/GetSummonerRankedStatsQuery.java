package vgalloy.riot.service.query.impl.stats;

import vgalloy.riot.api.stats.dto.RankedStatsDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerRankedStatsQuery extends AbstractQuery<RankedStatsDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetSummonerRankedStatsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    public RankedStatsDto execute() {
        return riotWebApi.getSummonerRankedStats(getRegion(), String.valueOf(summonerId), getRiotApiKeyValue()); // TODO String.valueOf ... un long dans l'interface c'est pas mal aussi
    }
}
