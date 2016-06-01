package vgalloy.riot.api.rest.constant;

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

    /**
     * Build a Region from a string. Region.valueOf() is not compatible with toString.
     *
     * @param name the name
     * @return the region
     */
    public static Region fromString(String name) {
        for (Region region : values()) {
            if (region.toString().toUpperCase().equals(name.toUpperCase())) {
                return region;
            }
        }
        throw new IllegalArgumentException("No enum constant " + Region.class.getCanonicalName() + "." + name);
    }
}

