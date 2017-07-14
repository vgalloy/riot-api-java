package com.vgalloy.riot.api.internal.dto.matchlist;

import java.io.Serializable;
import java.util.Objects;

import com.vgalloy.riot.api.api.constant.Lane;
import com.vgalloy.riot.api.api.constant.Role;
import com.vgalloy.riot.api.api.constant.Season;
import com.vgalloy.riot.api.api.constant.SimpleQueueType;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MatchReference implements Serializable {

    private static final long serialVersionUID = -2517076929253866341L;

    private Long champion;
    private Lane lane;
    private Long matchId;
    private String platformId;
    private SimpleQueueType queue;
    private String region;
    private Role role;
    private Season season;
    private Long timestamp;

    public Long getChampion() {
        return champion;
    }

    public void setChampion(Long champion) {
        this.champion = champion;
    }

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public SimpleQueueType getQueue() {
        return queue;
    }

    public void setQueue(SimpleQueueType queue) {
        this.queue = queue;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchReference)) {
            return false;
        }
        MatchReference that = (MatchReference) o;
        return Objects.equals(champion, that.champion) &&
            lane == that.lane &&
            Objects.equals(matchId, that.matchId) &&
            Objects.equals(platformId, that.platformId) &&
            queue == that.queue &&
            Objects.equals(region, that.region) &&
            role == that.role &&
            season == that.season &&
            Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(champion, lane, matchId, platformId, queue, region, role, season, timestamp);
    }

    @Override
    public String toString() {
        return "MatchReference{" +
            "champion=" + champion +
            ", lane=" + lane +
            ", matchId=" + matchId +
            ", platformId='" + platformId + '\'' +
            ", queue=" + queue +
            ", region='" + region + '\'' +
            ", role=" + role +
            ", season=" + season +
            ", timestamp=" + timestamp +
            '}';
    }
}
