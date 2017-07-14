package com.vgalloy.riot.library.api.query.impl.championmastery;

import java.util.List;

import com.vgalloy.riot.library.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetTopChampion extends Query<List<ChampionMasteryDto>> {

    /**
     * Set the number of entries to retrieve, defaults to 3.
     *
     * @param count count
     * @return this
     */
    GetTopChampion count(int count);
}
