package vgalloy.riot.api.rest.request.summoner.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryDto {

    private int id;
    private int rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        MasteryDto that = (MasteryDto) o;
        return id == that.id &&
                rank == that.rank;
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
