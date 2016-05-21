package vgalloy.riot.api.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Event {

    private String ascendedType;
    private List<Integer> assistingParticipantIds;
    private String buildingType;
    private int creatorId;
    private String eventType;
    private int itemAfter;
    private int itemBefore;
    private int itemId;
    private int killerId;
    private String laneType;
    private String levelUpType;
    private String monsterType;
    private int participantId;
    private String pointCaptured;
    private Position position;
    private int skillSlot;
    private int teamId;
    private long timestamp;
    private String towerType;
    private int victimId;
    private String wardType;

    public String getAscendedType() {
        return ascendedType;
    }

    public void setAscendedType(String ascendedType) {
        this.ascendedType = ascendedType;
    }

    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    public void setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
        this.assistingParticipantIds = assistingParticipantIds;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
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

    public String getLaneType() {
        return laneType;
    }

    public void setLaneType(String laneType) {
        this.laneType = laneType;
    }

    public String getLevelUpType() {
        return levelUpType;
    }

    public void setLevelUpType(String levelUpType) {
        this.levelUpType = levelUpType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getPointCaptured() {
        return pointCaptured;
    }

    public void setPointCaptured(String pointCaptured) {
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

    public String getTowerType() {
        return towerType;
    }

    public void setTowerType(String towerType) {
        this.towerType = towerType;
    }

    public int getVictimId() {
        return victimId;
    }

    public void setVictimId(int victimId) {
        this.victimId = victimId;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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
