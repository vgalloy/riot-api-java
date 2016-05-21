package vgalloy.riot.api.dto;

import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
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
    public String toString() {
        return "PlayerStatsSummaryListDto{" +
                "playerStatSummaries=" + playerStatSummaries +
                ", summonerId=" + summonerId +
                '}';
    }
}
