package vgalloy.riot.api.rest.request.currentgame.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentGameParticipant implements Serializable {

    private static final long serialVersionUID = 6861376740687555579L;

    private boolean bot;
    private long championId;
    private List<Mastery> masteries;
    private long profileIconId;
    private List<Rune> runes;
    private long spell1Id;
    private long spell2Id;
    private long summonerId;
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

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
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
        CurrentGameParticipant that = (CurrentGameParticipant) o;
        return bot == that.bot &&
                championId == that.championId &&
                profileIconId == that.profileIconId &&
                spell1Id == that.spell1Id &&
                spell2Id == that.spell2Id &&
                summonerId == that.summonerId &&
                teamId == that.teamId &&
                Objects.equals(masteries, that.masteries) &&
                Objects.equals(runes, that.runes) &&
                Objects.equals(summonerName, that.summonerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bot, championId, masteries, profileIconId, runes, spell1Id, spell2Id, summonerId, summonerName, teamId);
    }

    @Override
    public String toString() {
        return "CurrentGameParticipant{" +
                "bot=" + bot +
                ", championId=" + championId +
                ", masteries=" + masteries +
                ", profileIconId=" + profileIconId +
                ", runes=" + runes +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", summonerId=" + summonerId +
                ", summonerName='" + summonerName + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
