package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
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
