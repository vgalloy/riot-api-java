package vgalloy.riot.api.api.dto.currentgame;

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

    private Integer count;
    private Long runeId;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getRuneId() {
        return runeId;
    }

    public void setRuneId(Long runeId) {
        this.runeId = runeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rune)) {
            return false;
        }
        Rune rune = (Rune) o;
        return Objects.equals(count, rune.count) &&
                Objects.equals(runeId, rune.runeId);
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
