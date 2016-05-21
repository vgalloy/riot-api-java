package vgalloy.riot.api.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class PlayerStatsSummaryListDto {

    private List<PlayerStatsSummaryDto> playerStatSummaries;
    private long summonerId;

    public List<PlayerStatsSummaryDto> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public void setPlayerStatSummaries(List<PlayerStatsSummaryDto> playerStatSummaries) {
        this.playerStatSummaries = playerStatSummaries;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerStatsSummaryListDto that = (PlayerStatsSummaryListDto) o;
        return summonerId == that.summonerId &&
                Objects.equals(playerStatSummaries, that.playerStatSummaries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerStatSummaries, summonerId);
    }

    @Override
    public String toString() {
        return "PlayerStatsSummaryListDto{" +
                "playerStatSummaries=" + playerStatSummaries +
                ", summonerId=" + summonerId +
                '}';
    }
}
