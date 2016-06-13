package vgalloy.riot.api.rest.request.stats.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStatsSummaryDto {

    private AggregatedStatsDto aggregatedStats;
    private int losses;
    private long modifyDate;
    private String playerStatSummaryType;
    private int wins;

    public AggregatedStatsDto getAggregatedStats() {
        return aggregatedStats;
    }

    public void setAggregatedStats(AggregatedStatsDto aggregatedStats) {
        this.aggregatedStats = aggregatedStats;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public void setPlayerStatSummaryType(String playerStatSummaryType) {
        this.playerStatSummaryType = playerStatSummaryType;
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
        PlayerStatsSummaryDto that = (PlayerStatsSummaryDto) o;
        return losses == that.losses &&
                modifyDate == that.modifyDate &&
                wins == that.wins &&
                Objects.equals(aggregatedStats, that.aggregatedStats) &&
                Objects.equals(playerStatSummaryType, that.playerStatSummaryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatedStats, losses, modifyDate, playerStatSummaryType, wins);
    }

    @Override
    public String toString() {
        return "PlayerStatsSummaryDto{" +
                "aggregatedStats=" + aggregatedStats +
                ", losses=" + losses +
                ", modifyDate=" + modifyDate +
                ", playerStatSummaryType='" + playerStatSummaryType + '\'' +
                ", wins=" + wins +
                '}';
    }
}
