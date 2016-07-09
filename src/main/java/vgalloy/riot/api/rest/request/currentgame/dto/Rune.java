package vgalloy.riot.api.rest.request.currentgame.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rune implements Serializable {

    private static final long serialVersionUID = 5117948495212294137L;

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
