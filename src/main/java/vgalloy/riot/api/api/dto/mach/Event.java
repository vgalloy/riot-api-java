package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vgalloy.riot.api.api.constant.AscendedType;
import vgalloy.riot.api.api.constant.BuildingType;
import vgalloy.riot.api.api.constant.EventType;
import vgalloy.riot.api.api.constant.LaneType;
import vgalloy.riot.api.api.constant.LevelUpType;
import vgalloy.riot.api.api.constant.MonsterType;
import vgalloy.riot.api.api.constant.PointCaptured;
import vgalloy.riot.api.api.constant.TowerType;
import vgalloy.riot.api.api.constant.WardType;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event implements Serializable {

    private static final long serialVersionUID = -7630804759806344004L;

    private AscendedType ascendedType;
    private List<Integer> assistingParticipantIds;
    private BuildingType buildingType;
    private int creatorId;
    private EventType eventType;
    private int itemAfter;
    private int itemBefore;
    private int itemId;
    private int killerId;
    private LaneType laneType;
    private LevelUpType levelUpType;
    private MonsterType monsterType;
    private int participantId;
    private PointCaptured pointCaptured;
    private Position position;
    private int skillSlot;
    private int teamId;
    private long timestamp;
    private TowerType towerType;
    private int victimId;
    private WardType wardType;

    public AscendedType getAscendedType() {
        return ascendedType;
    }

    public void setAscendedType(AscendedType ascendedType) {
        this.ascendedType = ascendedType;
    }

    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    public void setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
        this.assistingParticipantIds = assistingParticipantIds;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getItemAfter() {
        return itemAfter;
    }

    public void setItemAfter(int itemAfter) {
        this.itemAfter = itemAfter;
    }

    public int getItemBefore() {
        return itemBefore;
    }

    public void setItemBefore(int itemBefore) {
        this.itemBefore = itemBefore;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getKillerId() {
        return killerId;
    }

    public void setKillerId(int killerId) {
        this.killerId = killerId;
    }

    public LaneType getLaneType() {
        return laneType;
    }

    public void setLaneType(LaneType laneType) {
        this.laneType = laneType;
    }

    public LevelUpType getLevelUpType() {
        return levelUpType;
    }

    public void setLevelUpType(LevelUpType levelUpType) {
        this.levelUpType = levelUpType;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public PointCaptured getPointCaptured() {
        return pointCaptured;
    }

    public void setPointCaptured(PointCaptured pointCaptured) {
        this.pointCaptured = pointCaptured;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSkillSlot() {
        return skillSlot;
    }

    public void setSkillSlot(int skillSlot) {
        this.skillSlot = skillSlot;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public TowerType getTowerType() {
        return towerType;
    }

    public void setTowerType(TowerType towerType) {
        this.towerType = towerType;
    }

    public int getVictimId() {
        return victimId;
    }

    public void setVictimId(int victimId) {
        this.victimId = victimId;
    }

    public WardType getWardType() {
        return wardType;
    }

    public void setWardType(WardType wardType) {
        this.wardType = wardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return creatorId == event.creatorId &&
                itemAfter == event.itemAfter &&
                itemBefore == event.itemBefore &&
                itemId == event.itemId &&
                killerId == event.killerId &&
                participantId == event.participantId &&
                skillSlot == event.skillSlot &&
                teamId == event.teamId &&
                timestamp == event.timestamp &&
                victimId == event.victimId &&
                Objects.equals(ascendedType, event.ascendedType) &&
                Objects.equals(assistingParticipantIds, event.assistingParticipantIds) &&
                Objects.equals(buildingType, event.buildingType) &&
                Objects.equals(eventType, event.eventType) &&
                Objects.equals(laneType, event.laneType) &&
                Objects.equals(levelUpType, event.levelUpType) &&
                Objects.equals(monsterType, event.monsterType) &&
                Objects.equals(pointCaptured, event.pointCaptured) &&
                Objects.equals(position, event.position) &&
                Objects.equals(towerType, event.towerType) &&
                Objects.equals(wardType, event.wardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ascendedType, assistingParticipantIds, buildingType, creatorId, eventType, itemAfter, itemBefore, itemId, killerId, laneType, levelUpType, monsterType, participantId, pointCaptured, position, skillSlot, teamId, timestamp, towerType, victimId, wardType);
    }

    @Override
    public String toString() {
        return "Event{" +
                "ascendedType='" + ascendedType + '\'' +
                ", assistingParticipantIds=" + assistingParticipantIds +
                ", buildingType='" + buildingType + '\'' +
                ", creatorId=" + creatorId +
                ", eventType='" + eventType + '\'' +
                ", itemAfter=" + itemAfter +
                ", itemBefore=" + itemBefore +
                ", itemId=" + itemId +
                ", killerId=" + killerId +
                ", laneType='" + laneType + '\'' +
                ", levelUpType='" + levelUpType + '\'' +
                ", monsterType='" + monsterType + '\'' +
                ", participantId=" + participantId +
                ", pointCaptured='" + pointCaptured + '\'' +
                ", position=" + position +
                ", skillSlot=" + skillSlot +
                ", teamId=" + teamId +
                ", timestamp=" + timestamp +
                ", towerType='" + towerType + '\'' +
                ", victimId=" + victimId +
                ", wardType='" + wardType + '\'' +
                '}';
    }
}
