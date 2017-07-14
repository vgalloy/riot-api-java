package com.vgalloy.riot.api.internal.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.library.api.constant.GameMode;
import com.vgalloy.riot.library.api.constant.GameType;
import com.vgalloy.riot.library.api.constant.QueueType;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.constant.Season;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MatchDetail implements Serializable {

    private static final long serialVersionUID = 6184418107833110266L;

    private Integer mapId;
    private Long matchCreation;
    private Long matchDuration;
    private Long matchId;
    private GameMode matchMode;
    private GameType matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String platformId;
    private QueueType queueType;
    private Region region;
    private Season season;
    private List<Team> teams;
    private Timeline timeline;

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Long getMatchCreation() {
        return matchCreation;
    }

    public void setMatchCreation(Long matchCreation) {
        this.matchCreation = matchCreation;
    }

    public Long getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(Long matchDuration) {
        this.matchDuration = matchDuration;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
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

    public QueueType getQueueType() {
        return queueType;
    }

    public void setQueueType(QueueType queueType) {
        this.queueType = queueType;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
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
        if (!(o instanceof MatchDetail)) {
            return false;
        }
        MatchDetail that = (MatchDetail) o;
        return Objects.equals(mapId, that.mapId) &&
            Objects.equals(matchCreation, that.matchCreation) &&
            Objects.equals(matchDuration, that.matchDuration) &&
            Objects.equals(matchId, that.matchId) &&
            matchMode == that.matchMode &&
            matchType == that.matchType &&
            Objects.equals(matchVersion, that.matchVersion) &&
            Objects.equals(participantIdentities, that.participantIdentities) &&
            Objects.equals(participants, that.participants) &&
            Objects.equals(platformId, that.platformId) &&
            queueType == that.queueType &&
            region == that.region &&
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
