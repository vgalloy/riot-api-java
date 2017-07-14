package com.vgalloy.riot.library.api.query.impl.featuredgame;

import com.vgalloy.riot.library.api.dto.featuredgame.FeaturedGames;
import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetFeaturedGameQuery extends AbstractQuery<GetFeaturedGameQuery, FeaturedGames> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetFeaturedGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected FeaturedGames executeWithError() {
        return riotWebApi.getFeaturedGame(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
