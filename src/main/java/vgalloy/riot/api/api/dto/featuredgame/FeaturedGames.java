package vgalloy.riot.api.api.dto.featuredgame;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class FeaturedGames implements Serializable {

    private static final long serialVersionUID = 6320892582685715424L;

    private Long clientRefreshInterval;
    private List<FeaturedGameInfo> gameList;

    public Long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public void setClientRefreshInterval(Long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    public List<FeaturedGameInfo> getGameList() {
        return gameList;
    }

    public void setGameList(List<FeaturedGameInfo> gameList) {
        this.gameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeaturedGames)) {
            return false;
        }
        FeaturedGames that = (FeaturedGames) o;
        return Objects.equals(clientRefreshInterval, that.clientRefreshInterval) &&
            Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRefreshInterval, gameList);
    }

    @Override
    public String toString() {
        return "FeaturedGames{" +
            "clientRefreshInterval=" + clientRefreshInterval +
            ", gameList=" + gameList +
            '}';
    }
}
