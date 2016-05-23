package vgalloy.riot.api.constant;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public enum Region {
    BR, EUNE, EUW, JP, KR, LAN, LAS, NA, OCE, RU, TR;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

