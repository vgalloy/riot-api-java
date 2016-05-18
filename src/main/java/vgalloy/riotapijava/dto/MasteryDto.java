package vgalloy.riotapijava.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
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
    public String toString() {
        return "MasteryDto{" +
                "id=" + id +
                ", rank=" + rank +
                '}';
    }
}
