package com.vgalloy.riot.api.internal.query;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.model.RiotApiKey;

/**
 * Created by Vincent on 21/05/2016.
 *
 * @author Vincent Galloy
 */
public final class DefaultParameter {

    private RiotApiKey riotApiKey;
    private Region region;

    public RiotApiKey getRiotApiKey() {
        return riotApiKey;
    }

    public void setRiotApiKey(RiotApiKey riotApiKey) {
        this.riotApiKey = riotApiKey;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
