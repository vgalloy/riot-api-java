package vgalloy.riot.api.rest.request.champion.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDto {

    private List<ChampionDto> champions;

    public List<ChampionDto> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionDto> champions) {
        this.champions = champions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChampionListDto that = (ChampionListDto) o;
        return Objects.equals(champions, that.champions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(champions);
    }

    @Override
    public String toString() {
        return "ChampionListDto{" +
                "champions=" + champions +
                '}';
    }
}
