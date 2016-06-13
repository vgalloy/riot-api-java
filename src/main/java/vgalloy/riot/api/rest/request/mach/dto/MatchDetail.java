package vgalloy.riot.api.rest.request.mach.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import vgalloy.riot.api.rest.constant.GameMode;
import vgalloy.riot.api.rest.constant.GameType;
import vgalloy.riot.api.rest.constant.NormalQueueType;
import vgalloy.riot.api.rest.constant.Season;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDetail {

    private int mapId;
    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private GameMode matchMode;
    private GameType matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String platformId;
    private NormalQueueType queueType;
    private String region;
    private Season season;
    private List<Team> teams;
    private Timeline timeline;

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public long getMatchCreation() {
        return matchCreation;
    }

    public void setMatchCreation(long matchCreation) {
        this.matchCreation = matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(long matchDuration) {
        this.matchDuration = matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public GameMode getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(GameMode matchMode) {
        this.matchMode = matchMode;
    }

    public GameType getMatchType() {
        return matchType;
    }

    public void setMatchType(GameType matchType) {
        this.matchType = matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public void setMatchVersion(String matchVersion) {
        this.matchVersion = matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public NormalQueueType getQueueType() {
        return queueType;
    }

    public void setQueueType(NormalQueueType queueType) {
        this.queueType = queueType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchDetail that = (MatchDetail) o;
        return mapId == that.mapId &&
                matchCreation == that.matchCreation &&
                matchDuration == that.matchDuration &&
                matchId == that.matchId &&
                matchMode == that.matchMode &&
                matchType == that.matchType &&
                Objects.equals(matchVersion, that.matchVersion) &&
                Objects.equals(participantIdentities, that.participantIdentities) &&
                Objects.equals(participants, that.participants) &&
                Objects.equals(platformId, that.platformId) &&
                queueType == that.queueType &&
                Objects.equals(region, that.region) &&
                season == that.season &&
                Objects.equals(teams, that.teams) &&
                Objects.equals(timeline, that.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapId, matchCreation, matchDuration, matchId, matchMode, matchType, matchVersion, participantIdentities, participants, platformId, queueType, region, season, teams, timeline);
    }

    @Override
    public String toString() {
        return "MatchDetail{" +
                "mapId=" + mapId +
                ", matchCreation=" + matchCreation +
                ", matchDuration=" + matchDuration +
                ", matchId=" + matchId +
                ", matchMode=" + matchMode +
                ", matchType=" + matchType +
                ", matchVersion='" + matchVersion + '\'' +
                ", participantIdentities=" + participantIdentities +
                ", participants=" + participants +
                ", platformId='" + platformId + '\'' +
                ", queueType=" + queueType +
                ", region='" + region + '\'' +
                ", season=" + season +
                ", teams=" + teams +
                ", timeline=" + timeline +
                '}';
    }
}
