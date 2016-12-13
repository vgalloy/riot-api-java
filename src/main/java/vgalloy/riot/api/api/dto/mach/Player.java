package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player implements Serializable {

    private static final long serialVersionUID = 2769261555091917691L;

    private String matchHistoryUri;
    private Integer profileIcon;
    private Long summonerId;
    private String summonerName;

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public Integer getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
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
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(matchHistoryUri, player.matchHistoryUri) &&
                Objects.equals(profileIcon, player.profileIcon) &&
                Objects.equals(summonerId, player.summonerId) &&
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
