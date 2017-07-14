package com.vgalloy.riot.api.api.query.impl.championmastery;

import java.util.List;

import com.vgalloy.riot.api.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetTopChampion extends Query<GetTopChampion, List<ChampionMasteryDto>> {

    /**
     * Set the number of entries to retrieve, defaults to 3.
     *
     * @param count count
     * @return this
     */
    GetTopChampion count(int count);
}
