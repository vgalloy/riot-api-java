package vgalloy.riot.api.api.query.impl.league;

import java.util.Collections;
import java.util.Objects;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.dto.league.LeagueDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.api.query.impl.league.helper.LeagueEntryDtoComparator;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChallengerQuery extends AbstractQuery<GetChallengerQuery, LeagueDto> {

    private final LeagueQueueType leagueQueueType;
    private boolean sorted;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param leagueQueueType  the queue type
     */
    public GetChallengerQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, LeagueQueueType leagueQueueType) {
        super(riotWebApi, defaultParameter);
        this.leagueQueueType = Objects.requireNonNull(leagueQueueType, "leagueQueueType can not be null");
    }

    /**
     * Have the list to be sorted  ? If yes the last summoner of the list will be the best
     *
     * @param sorted true if the list have to be sorted
     * @return this
     */
    public GetChallengerQuery sorted(boolean sorted) {
        this.sorted = sorted;
        return this;
    }

    @Override
    protected LeagueDto executeWithError() {
        LeagueDto leagueDto = riotWebApi.getChallenger(SmallCaseRegion.of(getRegion()), leagueQueueType, getRiotApiKeyValue());
        if (sorted) {
            Collections.sort(leagueDto.getEntries(), new LeagueEntryDtoComparator());
        }
        return leagueDto;
    }
}
