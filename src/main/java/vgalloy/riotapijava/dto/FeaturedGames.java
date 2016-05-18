package vgalloy.riotapijava.dto;
import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class FeaturedGames {

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
    public String toString() {
        return "FeaturedGames{" +
                "clientRefreshInterval=" + clientRefreshInterval +
                ", gameList=" + gameList +
                '}';
    }
}
