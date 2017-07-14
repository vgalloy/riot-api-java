package com.vgalloy.riot.api.internal.service.mapper;

import java.util.Arrays;
import java.util.Collection;
import java.util.StringJoiner;

import com.vgalloy.riot.library.api.constant.PlatformId;
import com.vgalloy.riot.library.api.constant.Region;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class HelperMapper {

    /**
     * Constructor.
     * To prevent instantiation
     */
    private HelperMapper() {
        throw new AssertionError();
    }

    /**
     * Converter.
     *
     * @param region the region
     * @return the platform id
     */
    public static PlatformId toPlatformId(Region region) {
        switch (region) {
            case BR:
                return PlatformId.BR1;
            case EUNE:
                return PlatformId.EUN1;
            case EUW:
                return PlatformId.EUW1;
            case JP:
                return PlatformId.JP1;
            case KR:
                return PlatformId.KR;
            case LAN:
                return PlatformId.LA1;
            case LAS:
                return PlatformId.LA2;
            case NA:
                return PlatformId.NA1;
            case OCE:
                return PlatformId.OC1;
            case RU:
                return PlatformId.RU;
            case TR:
                return PlatformId.TR1;
            default:
                throw new IllegalStateException("region can not be converted");
        }
    }

    /**
     * Convert an array of item into a String separated by comma.
     *
     * @param objects the array of item
     * @return a String
     */
    public static <T> String convert(T... objects) {
        return convert(Arrays.asList(objects));
    }

    /**
     * Convert a list of item into a String separated by comma.
     *
     * @param list the list of item
     * @return a String
     */
    public static String convert(Collection<?> list) {
        StringJoiner stringJoiner = new StringJoiner(",");
        list.stream()
            .map(Object::toString)
            .forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
