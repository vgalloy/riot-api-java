package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import vgalloy.riot.api.api.constant.Tier;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Participant implements Serializable {

    private static final long serialVersionUID = -1799062856872707886L;

    private Integer championId;
    private Tier highestAchievedSeasonTier;
    private List<Mastery> masteries;
    private Integer participantId;
    private List<Rune> runes;
    private Integer spell1Id;
    private Integer spell2Id;
    private ParticipantStats stats;
    private Integer teamId;
    private ParticipantTimeline timeline;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Tier getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(Tier highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    public Integer getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(Integer spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Integer getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(Integer spell2Id) {
        this.spell2Id = spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public void setStats(ParticipantStats stats) {
        this.stats = stats;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(ParticipantTimeline timeline) {
        this.timeline = timeline;
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
        return Objects.equals(championId, that.championId) &&
                highestAchievedSeasonTier == that.highestAchievedSeasonTier &&
                Objects.equals(masteries, that.masteries) &&
                Objects.equals(participantId, that.participantId) &&
                Objects.equals(runes, that.runes) &&
                Objects.equals(spell1Id, that.spell1Id) &&
                Objects.equals(spell2Id, that.spell2Id) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(teamId, that.teamId) &&
                Objects.equals(timeline, that.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, highestAchievedSeasonTier, masteries, participantId, runes, spell1Id, spell2Id, stats, teamId, timeline);
    }

    @Override
    public String toString() {
        return "ParticipantDto{" +
                "championId=" + championId +
                ", highestAchievedSeasonTier='" + highestAchievedSeasonTier + '\'' +
                ", masteries=" + masteries +
                ", participantId=" + participantId +
                ", runes=" + runes +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", stats=" + stats +
                ", teamId=" + teamId +
                ", timeline=" + timeline +
                '}';
    }
}
