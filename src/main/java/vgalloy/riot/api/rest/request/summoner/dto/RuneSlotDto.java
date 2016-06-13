package vgalloy.riot.api.rest.request.summoner.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuneSlotDto {

    private int runeId;
    private int runeSlotId;

    public int getRuneId() {
        return runeId;
    }

    public void setRuneId(int runeId) {
        this.runeId = runeId;
    }

    public int getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(int runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuneSlotDto that = (RuneSlotDto) o;
        return runeId == that.runeId &&
                runeSlotId == that.runeSlotId;
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
