package vgalloy.riot.api.rest.request.featuredgame.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturedGames implements Serializable {

    private static final long serialVersionUID = 6320892582685715424L;

    private long clientRefreshInterval;
    private List<FeaturedGameInfo> gameList;

    public long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public void setClientRefreshInterval(long clientRefreshInterval) {
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeaturedGames that = (FeaturedGames) o;
        return clientRefreshInterval == that.clientRefreshInterval &&
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
