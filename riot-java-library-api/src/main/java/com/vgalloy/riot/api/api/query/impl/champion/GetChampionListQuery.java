package com.vgalloy.riot.api.api.query.impl.champion;

import com.vgalloy.riot.api.api.dto.champion.ChampionListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetChampionListQuery extends AbstractQuery<GetChampionListQuery, ChampionListDto> {

    /**
     * Only display free to play champions.
     *
     * @param freeToPlay free to play
     * @return this
     */
    GetChampionListQuery freeToPlay(boolean freeToPlay);
}
