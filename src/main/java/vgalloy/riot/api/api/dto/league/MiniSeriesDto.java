package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiniSeriesDto implements Serializable {

    private static final long serialVersionUID = 2009851907129552556L;

    private Integer losses;
    private String progress;
    private Integer target;
    private Integer wins;

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MiniSeriesDto)) {
            return false;
        }
        MiniSeriesDto that = (MiniSeriesDto) o;
        return Objects.equals(losses, that.losses) &&
                Objects.equals(progress, that.progress) &&
                Objects.equals(target, that.target) &&
                Objects.equals(wins, that.wins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(losses, progress, target, wins);
    }

    @Override
    public String toString() {
        return "MiniSeriesDto{" +
                "losses=" + losses +
                ", progress='" + progress + '\'' +
                ", target=" + target +
                ", wins=" + wins +
                '}';
    }
}
