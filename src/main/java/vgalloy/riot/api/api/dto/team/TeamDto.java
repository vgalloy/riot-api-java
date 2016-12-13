package vgalloy.riot.api.api.dto.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDto implements Serializable {

    private static final long serialVersionUID = -5589018373507908238L;

    private Long createDate;
    private String fullId;
    private Long lastGameDate;
    private Long lastJoinDate;
    private Long lastJoinedRankedTeamQueueDate;
    private List<MatchHistorySummaryDto> matchHistory;
    private Long modifyDate;
    private String name;
    private RosterDto roster;
    private Long secondLastJoinDate;
    private String status;
    private String tag;
    private List<TeamStatDetailDto> teamStatDetails;
    private Long thirdLastJoinDate;

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    public Long getLastGameDate() {
        return lastGameDate;
    }

    public void setLastGameDate(Long lastGameDate) {
        this.lastGameDate = lastGameDate;
    }

    public Long getLastJoinDate() {
        return lastJoinDate;
    }

    public void setLastJoinDate(Long lastJoinDate) {
        this.lastJoinDate = lastJoinDate;
    }

    public Long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public void setLastJoinedRankedTeamQueueDate(Long lastJoinedRankedTeamQueueDate) {
        this.lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummaryDto> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(List<MatchHistorySummaryDto> matchHistory) {
        this.matchHistory = matchHistory;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RosterDto getRoster() {
        return roster;
    }

    public void setRoster(RosterDto roster) {
        this.roster = roster;
    }

    public Long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public void setSecondLastJoinDate(Long secondLastJoinDate) {
        this.secondLastJoinDate = secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<TeamStatDetailDto> getTeamStatDetails() {
        return teamStatDetails;
    }

    public void setTeamStatDetails(List<TeamStatDetailDto> teamStatDetails) {
        this.teamStatDetails = teamStatDetails;
    }

    public Long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }

    public void setThirdLastJoinDate(Long thirdLastJoinDate) {
        this.thirdLastJoinDate = thirdLastJoinDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamDto)) {
            return false;
        }
        TeamDto teamDto = (TeamDto) o;
        return Objects.equals(createDate, teamDto.createDate) &&
                Objects.equals(fullId, teamDto.fullId) &&
                Objects.equals(lastGameDate, teamDto.lastGameDate) &&
                Objects.equals(lastJoinDate, teamDto.lastJoinDate) &&
                Objects.equals(lastJoinedRankedTeamQueueDate, teamDto.lastJoinedRankedTeamQueueDate) &&
                Objects.equals(matchHistory, teamDto.matchHistory) &&
                Objects.equals(modifyDate, teamDto.modifyDate) &&
                Objects.equals(name, teamDto.name) &&
                Objects.equals(roster, teamDto.roster) &&
                Objects.equals(secondLastJoinDate, teamDto.secondLastJoinDate) &&
                Objects.equals(status, teamDto.status) &&
                Objects.equals(tag, teamDto.tag) &&
                Objects.equals(teamStatDetails, teamDto.teamStatDetails) &&
                Objects.equals(thirdLastJoinDate, teamDto.thirdLastJoinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDate, fullId, lastGameDate, lastJoinDate, lastJoinedRankedTeamQueueDate, matchHistory, modifyDate, name, roster, secondLastJoinDate, status, tag, teamStatDetails, thirdLastJoinDate);
    }

    @Override
    public String toString() {
        return "TeamDto{" +
                "createDate=" + createDate +
                ", fullId='" + fullId + '\'' +
                ", lastGameDate=" + lastGameDate +
                ", lastJoinDate=" + lastJoinDate +
                ", lastJoinedRankedTeamQueueDate=" + lastJoinedRankedTeamQueueDate +
                ", matchHistory=" + matchHistory +
                ", modifyDate=" + modifyDate +
                ", name='" + name + '\'' +
                ", roster=" + roster +
                ", secondLastJoinDate=" + secondLastJoinDate +
                ", status='" + status + '\'' +
                ", tag='" + tag + '\'' +
                ", teamStatDetails=" + teamStatDetails +
                ", thirdLastJoinDate=" + thirdLastJoinDate +
                '}';
    }
}
