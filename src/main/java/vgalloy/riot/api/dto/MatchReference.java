package vgalloy.riot.api.dto;

import vgalloy.riot.api.dto.constant.Lane;
import vgalloy.riot.api.dto.constant.QueueType;
import vgalloy.riot.api.dto.constant.Season;

import javax.management.relation.Role;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public class MatchReference {

    private long champion;
    private Lane lane;
    private long matchId;
    private String platformId;
    private QueueType queue;
    private String region;
    private Role role;
    private Season season;

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

    public QueueType getQueue() {
        return queue;
    }

    public void setQueue(QueueType queue) {
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
                '}';
    }
}
