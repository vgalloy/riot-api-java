package vgalloy.riot.api.dto;

import java.util.List;

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
    public String toString() {
        return "RankedStatsDto{" +
                "champions=" + champions +
                ", modifyDate=" + modifyDate +
                ", summonerId=" + summonerId +
                '}';
    }
}
