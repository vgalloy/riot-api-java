package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataDto implements Serializable {

    private static final long serialVersionUID = 829114388248476761L;

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
