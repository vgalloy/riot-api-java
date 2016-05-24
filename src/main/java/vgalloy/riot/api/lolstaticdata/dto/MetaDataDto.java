package vgalloy.riot.api.lolstaticdata.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MetaDataDto {

    private boolean isRune;
    private String tier;
    private String type;

    public boolean isIsRune() {
        return isRune;
    }

    public void setIsRune(boolean rune) {
        isRune = rune;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaDataDto that = (MetaDataDto) o;
        return isRune == that.isRune &&
                Objects.equals(tier, that.tier) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRune, tier, type);
    }

    @Override
    public String toString() {
        return "MetaDataDto{" +
                "isRune=" + isRune +
                ", tier='" + tier + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
