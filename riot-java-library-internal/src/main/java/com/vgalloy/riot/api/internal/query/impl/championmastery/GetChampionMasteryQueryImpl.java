package com.vgalloy.riot.api.internal.query.impl.championmastery;

import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetChampionMasteryQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetChampionMasteryQueryImpl implements GetChampionMasteryQuery {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetChampionMasteryQueryImpl(RiotWebApi riotWebApi, RiotApiKey riotApiKey, Region region, long playerId) {
            this.riotWebApi = Objects.requireNonNull(riotWebApi);
            this.riotApiKey = Objects.requireNonNull(riotApiKey);
            this.region = Objects.requireNonNull(region);
            this.playerId =l playerId;
        }

        @Override
        public List<ChampionMasteryDto> execute () {
            return riotWebApi.getChampionMastery(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, getRiotApiKeyValue());
        }
    }
