package com.vgalloy.riot.api.internal.dto.champion;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public class ChampionListDto implements Serializable {

    private static final long serialVersionUID = 3513390141373753331L;

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
        if (!(o instanceof ChampionListDto)) {
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
