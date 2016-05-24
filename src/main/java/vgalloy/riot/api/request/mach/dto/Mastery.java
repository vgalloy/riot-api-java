package vgalloy.riot.api.request.mach.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class Mastery {

    private int masteryId;
    private int rank;

    public int getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(int masteryId) {
        this.masteryId = masteryId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mastery mastery = (Mastery) o;
        return masteryId == mastery.masteryId &&
                rank == mastery.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(masteryId, rank);
    }

    @Override
    public String toString() {
        return "Mastery{" +
                "masteryId=" + masteryId +
                ", rank=" + rank +
                '}';
    }
}
