package vgalloy.riot.api.api.dto.summoner;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class MasteryDto implements Serializable {

    private static final long serialVersionUID = -165546307563290660L;

    private Integer id;
    private Integer rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MasteryDto)) {
            return false;
        }
        MasteryDto that = (MasteryDto) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rank);
    }

    @Override
    public String toString() {
        return "MasteryDto{" +
            "id=" + id +
            ", rank=" + rank +
            '}';
    }
}
