package com.vgalloy.riot.library.api.constant;

/**
 * Created by Vincent Galloy on 24/05/16.
 *
 * @author Vincent Galloy
 */
public enum MasteryTree {
    CUNNING,
    FEROCITY,
    RESOLVE;

    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
