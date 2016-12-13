package vgalloy.riot.api.api.constant;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 24/05/16.
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
