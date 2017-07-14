package com.vgalloy.riot.api.internal.dto.game;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public class RecentGamesDto implements Serializable {

    private static final long serialVersionUID = -5758492301146884093L;

    private Long summonerId;
    private Set<GameDto> games = new HashSet<>();

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }

    public Set<GameDto> getGames() {
        return games;
    }

    public void setGames(Set<GameDto> games) {
        this.games = games;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentGamesDto)) {
            return false;
        }
        RecentGamesDto that = (RecentGamesDto) o;
        return Objects.equals(summonerId, that.summonerId) &&
            Objects.equals(games, that.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summonerId, games);
    }

    @Override
    public String toString() {
        return "RecentGamesDto{" +
            "summonerId=" + summonerId +
            ", games=" + games +
            '}';
    }
}
