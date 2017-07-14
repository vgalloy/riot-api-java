package com.vgalloy.riot.api.internal.dto.stats;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class PlayerStatsSummaryListDto implements Serializable {

    private static final long serialVersionUID = 5256410875181703878L;

    private List<PlayerStatsSummaryDto> playerStatSummaries;
    private Long summonerId;

    public List<PlayerStatsSummaryDto> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public void setPlayerStatSummaries(List<PlayerStatsSummaryDto> playerStatSummaries) {
        this.playerStatSummaries = playerStatSummaries;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlayerStatsSummaryListDto)) {
            return false;
        }
        PlayerStatsSummaryListDto that = (PlayerStatsSummaryListDto) o;
        return Objects.equals(playerStatSummaries, that.playerStatSummaries) &&
            Objects.equals(summonerId, that.summonerId);
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
