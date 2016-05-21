package vgalloy.riot.api.dto;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public class MetaDataDto {

    private boolean isRune;
    private String tier;
    private String type;

    public boolean isRune() {
        return isRune;
    }

    public void setRune(boolean rune) {
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
    public String toString() {
        return "MetaDataDto{" +
                "isRune=" + isRune +
                ", tier='" + tier + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
