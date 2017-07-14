package com.vgalloy.riot.api.internal.dto.stats;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class PlayerStatsSummaryDto implements Serializable {

    private static final long serialVersionUID = 7189157654789836157L;

    private AggregatedStatsDto aggregatedStats;
    private Integer losses;
    private Long modifyDate;
    private String playerStatSummaryType;
    private Integer wins;

    public AggregatedStatsDto getAggregatedStats() {
        return aggregatedStats;
    }

    public void setAggregatedStats(AggregatedStatsDto aggregatedStats) {
        this.aggregatedStats = aggregatedStats;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public void setPlayerStatSummaryType(String playerStatSummaryType) {
        this.playerStatSummaryType = playerStatSummaryType;
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
        if (!(o instanceof PlayerStatsSummaryDto)) {
            return false;
        }
        PlayerStatsSummaryDto that = (PlayerStatsSummaryDto) o;
        return Objects.equals(aggregatedStats, that.aggregatedStats) &&
            Objects.equals(losses, that.losses) &&
            Objects.equals(modifyDate, that.modifyDate) &&
            Objects.equals(playerStatSummaryType, that.playerStatSummaryType) &&
            Objects.equals(wins, that.wins);
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
