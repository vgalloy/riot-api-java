package vgalloy.riot.api.api.dto.currentgame;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class CurrentGameParticipant implements Serializable {

    private static final long serialVersionUID = 6861376740687555579L;

    private Boolean bot;
    private Long championId;
    private List<Mastery> masteries;
    private Long profileIconId;
    private List<Rune> runes;
    private Long spell1Id;
    private Long spell2Id;
    private Long summonerId;
    private String summonerName;
    private Long teamId;

    public Boolean isBot() {
        return bot;
    }

    public void setBot(Boolean bot) {
        this.bot = bot;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    public Long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    public Long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrentGameParticipant)) {
            return false;
        }
        CurrentGameParticipant that = (CurrentGameParticipant) o;
        return Objects.equals(bot, that.bot) &&
                Objects.equals(championId, that.championId) &&
                Objects.equals(masteries, that.masteries) &&
                Objects.equals(profileIconId, that.profileIconId) &&
                Objects.equals(runes, that.runes) &&
                Objects.equals(spell1Id, that.spell1Id) &&
                Objects.equals(spell2Id, that.spell2Id) &&
                Objects.equals(summonerId, that.summonerId) &&
                Objects.equals(summonerName, that.summonerName) &&
                Objects.equals(teamId, that.teamId);
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
