package vgalloy.riotapijava.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class RecentGamesDto {

    private long summonerId;
    private Set<GameDto> games = new HashSet<>();

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public Set<GameDto> getGames() {
        return games;
    }

    public void setGames(Set<GameDto> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "RecentGamesDto{" +
                "summonerId=" + summonerId +
                ", games=" + games +
                '}';
    }
}
