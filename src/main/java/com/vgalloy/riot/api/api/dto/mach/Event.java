package com.vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.api.api.constant.AscendedType;
import com.vgalloy.riot.api.api.constant.BuildingType;
import com.vgalloy.riot.api.api.constant.EventType;
import com.vgalloy.riot.api.api.constant.LaneType;
import com.vgalloy.riot.api.api.constant.LevelUpType;
import com.vgalloy.riot.api.api.constant.MonsterType;
import com.vgalloy.riot.api.api.constant.PointCaptured;
import com.vgalloy.riot.api.api.constant.TowerType;
import com.vgalloy.riot.api.api.constant.WardType;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class Event implements Serializable {

    private static final long serialVersionUID = -7630804759806344004L;

    private AscendedType ascendedType;
    private List<Integer> assistingParticipantIds;
    private BuildingType buildingType;
    private Integer creatorId;
    private EventType eventType;
    private Integer itemAfter;
    private Integer itemBefore;
    private Integer itemId;
    private Integer killerId;
    private LaneType laneType;
    private LevelUpType levelUpType;
    private MonsterType monsterType;
    private String monsterSubType;
    private Integer participantId;
    private PointCaptured pointCaptured;
    private Position position;
    private Integer skillSlot;
    private Integer teamId;
    private Long timestamp;
    private TowerType towerType;
    private Integer victimId;
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

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Integer getItemAfter() {
        return itemAfter;
    }

    public void setItemAfter(Integer itemAfter) {
        this.itemAfter = itemAfter;
    }

    public Integer getItemBefore() {
        return itemBefore;
    }

    public void setItemBefore(Integer itemBefore) {
        this.itemBefore = itemBefore;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getKillerId() {
        return killerId;
    }

    public void setKillerId(Integer killerId) {
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

    public String getMonsterSubType() {
        return monsterSubType;
    }

    public void setMonsterSubType(String monsterSubType) {
        this.monsterSubType = monsterSubType;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
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

    public Integer getSkillSlot() {
        return skillSlot;
    }

    public void setSkillSlot(Integer skillSlot) {
        this.skillSlot = skillSlot;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TowerType getTowerType() {
        return towerType;
    }

    public void setTowerType(TowerType towerType) {
        this.towerType = towerType;
    }

    public Integer getVictimId() {
        return victimId;
    }

    public void setVictimId(Integer victimId) {
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
        if (!(o instanceof Event)) {
            return false;
        }
        Event event = (Event) o;
        return ascendedType == event.ascendedType &&
            Objects.equals(assistingParticipantIds, event.assistingParticipantIds) &&
            buildingType == event.buildingType &&
            Objects.equals(creatorId, event.creatorId) &&
            eventType == event.eventType &&
            Objects.equals(itemAfter, event.itemAfter) &&
            Objects.equals(itemBefore, event.itemBefore) &&
            Objects.equals(itemId, event.itemId) &&
            Objects.equals(killerId, event.killerId) &&
            laneType == event.laneType &&
            levelUpType == event.levelUpType &&
            monsterType == event.monsterType &&
            Objects.equals(monsterSubType, event.monsterSubType) &&
            Objects.equals(participantId, event.participantId) &&
            pointCaptured == event.pointCaptured &&
            Objects.equals(position, event.position) &&
            Objects.equals(skillSlot, event.skillSlot) &&
            Objects.equals(teamId, event.teamId) &&
            Objects.equals(timestamp, event.timestamp) &&
            towerType == event.towerType &&
            Objects.equals(victimId, event.victimId) &&
            wardType == event.wardType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ascendedType, assistingParticipantIds, buildingType, creatorId, eventType, itemAfter, itemBefore, itemId, killerId, laneType, levelUpType, monsterType, monsterSubType, participantId, pointCaptured, position, skillSlot, teamId, timestamp, towerType, victimId, wardType);
    }

    @Override
    public String toString() {
        return "Event{" +
            "ascendedType=" + ascendedType +
            ", assistingParticipantIds=" + assistingParticipantIds +
            ", buildingType=" + buildingType +
            ", creatorId=" + creatorId +
            ", eventType=" + eventType +
            ", itemAfter=" + itemAfter +
            ", itemBefore=" + itemBefore +
            ", itemId=" + itemId +
            ", killerId=" + killerId +
            ", laneType=" + laneType +
            ", levelUpType=" + levelUpType +
            ", monsterType=" + monsterType +
            ", monsterSubType='" + monsterSubType + '\'' +
            ", participantId=" + participantId +
            ", pointCaptured=" + pointCaptured +
            ", position=" + position +
            ", skillSlot=" + skillSlot +
            ", teamId=" + teamId +
            ", timestamp=" + timestamp +
            ", towerType=" + towerType +
            ", victimId=" + victimId +
            ", wardType=" + wardType +
            '}';
    }
}
