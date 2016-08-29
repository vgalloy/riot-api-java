package vgalloy.riot.api.api.dto.featuredgame;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Participant implements Serializable {

    private static final long serialVersionUID = 3970179561864269906L;

    private boolean bot;
    private long championId;
    private long profileIconId;
    private long spell1Id;
    private long spell2Id;
    private String summonerName;
    private long teamId;

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Participant that = (Participant) o;
        return bot == that.bot &&
                championId == that.championId &&
                profileIconId == that.profileIconId &&
                spell1Id == that.spell1Id &&
                spell2Id == that.spell2Id &&
                teamId == that.teamId &&
                Objects.equals(summonerName, that.summonerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bot, championId, profileIconId, spell1Id, spell2Id, summonerName, teamId);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "bot=" + bot +
                ", championId=" + championId +
                ", profileIconId=" + profileIconId +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", summonerName='" + summonerName + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
