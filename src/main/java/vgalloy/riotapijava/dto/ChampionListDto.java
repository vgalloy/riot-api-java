package vgalloy.riotapijava.dto;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class ChampionListDto {

    private List<ChampionDto> champions;

    public List<ChampionDto> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionDto> champions) {
        this.champions = champions;
    }

    @Override
    public String toString() {
        return "ChampionListDto{" +
                "champions=" + champions +
                '}';
    }
}
