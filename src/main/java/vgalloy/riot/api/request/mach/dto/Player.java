package vgalloy.riot.api.request.mach.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Player {

    private String matchHistoryUri;
    private int profileIcon;
    private long summonerId;
    private String summonerName;

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(int profileIcon) {
        this.profileIcon = profileIcon;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return profileIcon == player.profileIcon &&
                summonerId == player.summonerId &&
                Objects.equals(matchHistoryUri, player.matchHistoryUri) &&
                Objects.equals(summonerName, player.summonerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchHistoryUri, profileIcon, summonerId, summonerName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "matchHistoryUri='" + matchHistoryUri + '\'' +
                ", profileIcon=" + profileIcon +
                ", summonerId=" + summonerId +
                ", summonerName='" + summonerName + '\'' +
                '}';
    }
}