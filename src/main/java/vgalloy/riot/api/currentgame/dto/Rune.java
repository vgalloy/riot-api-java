package vgalloy.riot.api.currentgame.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class Rune {

    private int count;
    private long runeId;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
        return count == rune.count &&
                runeId == rune.runeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, runeId);
    }

    @Override
    public String toString() {
        return "Rune{" +
                "count=" + count +
                ", runeId=" + runeId +
                '}';
    }
}
