package com.vgalloy.riot.api.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import com.vgalloy.riot.api.api.spi.RiotApiBuilder;

/**
 * Created by Vincent Galloy on 14/07/17.
 *
 * @author Vincent Galloy
 */
enum RiotApiBuilderLoader {
    INSTANCE;

    /**
     * Load the {@link RiotApiBuilder}.
     *
     * @return the builder
     */
    RiotApiBuilder load() {
        ServiceLoader<RiotApiBuilder> serviceLoader = ServiceLoader.load(RiotApiBuilder.class);
        serviceLoader.reload();
        List<RiotApiBuilder> riotApiBuilderList = new ArrayList<>();
        serviceLoader.iterator().forEachRemaining(riotApiBuilderList::add);

        if (riotApiBuilderList.isEmpty()) {
            throw new IllegalStateException("No implementation found for " + RiotApiBuilder.class.getName());
        } else if (1 < riotApiBuilderList.size()) {
            throw new IllegalStateException("More than one implementation found for " + RiotApiBuilder.class.getName());
        }

        return riotApiBuilderList.get(0);
    }
}
