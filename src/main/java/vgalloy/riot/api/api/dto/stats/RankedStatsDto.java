package vgalloy.riot.api.api.dto.stats;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RankedStatsDto implements Serializable {

    private static final long serialVersionUID = 4974185442595469870L;

    private List<ChampionStatsDto> champions;
    private Long modifyDate;
    private Long summonerId;

    public List<ChampionStatsDto> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionStatsDto> champions) {
        this.champions = champions;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
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
        if (!(o instanceof RankedStatsDto)) {
            return false;
        }
        RankedStatsDto that = (RankedStatsDto) o;
        return Objects.equals(champions, that.champions) &&
                Objects.equals(modifyDate, that.modifyDate) &&
                Objects.equals(summonerId, that.summonerId);
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
