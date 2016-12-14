package vgalloy.riot.api.api.dto.featuredgame;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class Participant implements Serializable {

    private static final long serialVersionUID = 3970179561864269906L;

    private Boolean bot;
    private Long championId;
    private Long profileIconId;
    private Long spell1Id;
    private Long spell2Id;
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

    public Long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Long profileIconId) {
        this.profileIconId = profileIconId;
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
        if (!(o instanceof Participant)) {
            return false;
        }
        Participant that = (Participant) o;
        return Objects.equals(bot, that.bot) &&
                Objects.equals(championId, that.championId) &&
                Objects.equals(profileIconId, that.profileIconId) &&
                Objects.equals(spell1Id, that.spell1Id) &&
                Objects.equals(spell2Id, that.spell2Id) &&
                Objects.equals(summonerName, that.summonerName) &&
                Objects.equals(teamId, that.teamId);
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
