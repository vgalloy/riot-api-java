package vgalloy.riot.api.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class RankedStatsDto {

    private List<ChampionStatsDto> champions;
    private long modifyDate;
    private long summonerId;

    public List<ChampionStatsDto> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionStatsDto> champions) {
        this.champions = champions;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
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
        RankedStatsDto that = (RankedStatsDto) o;
        return modifyDate == that.modifyDate &&
                summonerId == that.summonerId &&
                Objects.equals(champions, that.champions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(champions, modifyDate, summonerId);
    }

    @Override
    public String toString() {
        return "RankedStatsDto{" +
                "champions=" + champions +
                ", modifyDate=" + modifyDate +
                ", summonerId=" + summonerId +
                '}';
    }
}
