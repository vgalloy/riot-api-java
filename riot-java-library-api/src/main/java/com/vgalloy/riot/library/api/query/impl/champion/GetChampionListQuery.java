package com.vgalloy.riot.library.api.query.impl.champion;

import com.vgalloy.riot.library.api.dto.champion.ChampionListDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetChampionListQuery extends Query<ChampionListDto> {

    /**
     * Only display free to play champions.
     *
     * @param freeToPlay free to play
     * @return this
     */
    GetChampionListQuery freeToPlay(boolean freeToPlay);
}
