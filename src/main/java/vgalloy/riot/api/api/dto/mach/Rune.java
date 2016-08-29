package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rune implements Serializable {

    private static final long serialVersionUID = 8497636402696590331L;

    private int rank;
    private long runeId;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public long getRuneId() {
        return runeId;
    }

    public void setRuneId(long runeId) {
        this.runeId = runeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rune rune = (Rune) o;
        return rank == rune.rank &&
                runeId == rune.runeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, runeId);
    }

    @Override
    public String toString() {
        return "Rune{" +
                "rank=" + rank +
                ", runeId=" + runeId +
                '}';
    }
}
