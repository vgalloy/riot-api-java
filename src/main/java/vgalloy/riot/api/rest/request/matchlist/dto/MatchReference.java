package vgalloy.riot.api.rest.request.matchlist.dto;

import java.util.Objects;

import vgalloy.riot.api.rest.constant.Lane;
import vgalloy.riot.api.rest.constant.NormalQueueType;
import vgalloy.riot.api.rest.constant.Role;
import vgalloy.riot.api.rest.constant.Season;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MatchReference {

    private long champion;
    private Lane lane;
    private long matchId;
    private String platformId;
    private NormalQueueType queue;
    private String region;
    private Role role;
    private Season season;
    private long timestamp;

    public long getChampion() {
        return champion;
    }

    public void setChampion(long champion) {
        this.champion = champion;
    }

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public NormalQueueType getQueue() {
        return queue;
    }

    public void setQueue(NormalQueueType queue) {
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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchReference that = (MatchReference) o;
        return champion == that.champion &&
                matchId == that.matchId &&
                timestamp == that.timestamp &&
                lane == that.lane &&
                Objects.equals(platformId, that.platformId) &&
                queue == that.queue &&
                Objects.equals(region, that.region) &&
                role == that.role &&
                season == that.season;
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
