package vgalloy.riot.api.api.dto.summoner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuneSlotDto implements Serializable {

    private static final long serialVersionUID = -1044294048574538243L;

    private Integer runeId;
    private Integer runeSlotId;

    public Integer getRuneId() {
        return runeId;
    }

    public void setRuneId(Integer runeId) {
        this.runeId = runeId;
    }

    public Integer getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(Integer runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuneSlotDto)) {
            return false;
        }
        RuneSlotDto that = (RuneSlotDto) o;
        return Objects.equals(runeId, that.runeId) &&
                Objects.equals(runeSlotId, that.runeSlotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runeId, runeSlotId);
    }

    @Override
    public String toString() {
        return "RuneSlotDto{" +
                "runeId=" + runeId +
                ", runeSlotId=" + runeSlotId +
                '}';
    }
}
