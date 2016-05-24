package vgalloy.riot.api.request.league.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public class MiniSeriesDto {

    private int losses;
    private String progress;
    private int target;
    private int wins;

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MiniSeriesDto that = (MiniSeriesDto) o;
        return losses == that.losses &&
                target == that.target &&
                wins == that.wins &&
                Objects.equals(progress, that.progress);
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
