package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ParticipantTimeline implements Serializable {

    private static final long serialVersionUID = -3472976135664296492L;

    private ParticipantTimelineData ancientGolemAssistsPerMinCounts;
    private ParticipantTimelineData ancientGolemKillsPerMinCounts;
    private ParticipantTimelineData assistedLaneDeathsPerMinDeltas;
    private ParticipantTimelineData assistedLaneKillsPerMinDeltas;
    private ParticipantTimelineData baronAssistsPerMinCounts;
    private ParticipantTimelineData baronKillsPerMinCounts;
    private ParticipantTimelineData creepsPerMinDeltas;
    private ParticipantTimelineData csDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenPerMinDeltas;
    private ParticipantTimelineData dragonAssistsPerMinCounts;
    private ParticipantTimelineData dragonKillsPerMinCounts;
    private ParticipantTimelineData elderLizardAssistsPerMinCounts;
    private ParticipantTimelineData elderLizardKillsPerMinCounts;
    private ParticipantTimelineData goldPerMinDeltas;
    private ParticipantTimelineData inhibitorAssistsPerMinCounts;
    private ParticipantTimelineData inhibitorKillsPerMinCounts;
    private String lane;
    private String role;
    private ParticipantTimelineData towerAssistsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinDeltas;
    private ParticipantTimelineData vilemawAssistsPerMinCounts;
    private ParticipantTimelineData vilemawKillsPerMinCounts;
    private ParticipantTimelineData wardsPerMinDeltas;
    private ParticipantTimelineData xpDiffPerMinDeltas;
    private ParticipantTimelineData xpPerMinDeltas;

    public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
        return ancientGolemAssistsPerMinCounts;
    }

    public void setAncientGolemAssistsPerMinCounts(ParticipantTimelineData ancientGolemAssistsPerMinCounts) {
        this.ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts;
    }

    public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
        return ancientGolemKillsPerMinCounts;
    }

    public void setAncientGolemKillsPerMinCounts(ParticipantTimelineData ancientGolemKillsPerMinCounts) {
        this.ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts;
    }

    public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
        return assistedLaneDeathsPerMinDeltas;
    }

    public void setAssistedLaneDeathsPerMinDeltas(ParticipantTimelineData assistedLaneDeathsPerMinDeltas) {
        this.assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas;
    }

    public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
        return assistedLaneKillsPerMinDeltas;
    }

    public void setAssistedLaneKillsPerMinDeltas(ParticipantTimelineData assistedLaneKillsPerMinDeltas) {
        this.assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas;
    }

    public ParticipantTimelineData getBaronAssistsPerMinCounts() {
        return baronAssistsPerMinCounts;
    }

    public void setBaronAssistsPerMinCounts(ParticipantTimelineData baronAssistsPerMinCounts) {
        this.baronAssistsPerMinCounts = baronAssistsPerMinCounts;
    }

    public ParticipantTimelineData getBaronKillsPerMinCounts() {
        return baronKillsPerMinCounts;
    }

    public void setBaronKillsPerMinCounts(ParticipantTimelineData baronKillsPerMinCounts) {
        this.baronKillsPerMinCounts = baronKillsPerMinCounts;
    }

    public ParticipantTimelineData getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public void setCreepsPerMinDeltas(ParticipantTimelineData creepsPerMinDeltas) {
        this.creepsPerMinDeltas = creepsPerMinDeltas;
    }

    public ParticipantTimelineData getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public void setCsDiffPerMinDeltas(ParticipantTimelineData csDiffPerMinDeltas) {
        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    public void setDamageTakenDiffPerMinDeltas(ParticipantTimelineData damageTakenDiffPerMinDeltas) {
        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public void setDamageTakenPerMinDeltas(ParticipantTimelineData damageTakenPerMinDeltas) {
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
    }

    public ParticipantTimelineData getDragonAssistsPerMinCounts() {
        return dragonAssistsPerMinCounts;
    }

    public void setDragonAssistsPerMinCounts(ParticipantTimelineData dragonAssistsPerMinCounts) {
        this.dragonAssistsPerMinCounts = dragonAssistsPerMinCounts;
    }

    public ParticipantTimelineData getDragonKillsPerMinCounts() {
        return dragonKillsPerMinCounts;
    }

    public void setDragonKillsPerMinCounts(ParticipantTimelineData dragonKillsPerMinCounts) {
        this.dragonKillsPerMinCounts = dragonKillsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
        return elderLizardAssistsPerMinCounts;
    }

    public void setElderLizardAssistsPerMinCounts(ParticipantTimelineData elderLizardAssistsPerMinCounts) {
        this.elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
        return elderLizardKillsPerMinCounts;
    }

    public void setElderLizardKillsPerMinCounts(ParticipantTimelineData elderLizardKillsPerMinCounts) {
        this.elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts;
    }

    public ParticipantTimelineData getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public void setGoldPerMinDeltas(ParticipantTimelineData goldPerMinDeltas) {
        this.goldPerMinDeltas = goldPerMinDeltas;
    }

    public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
        return inhibitorAssistsPerMinCounts;
    }

    public void setInhibitorAssistsPerMinCounts(ParticipantTimelineData inhibitorAssistsPerMinCounts) {
        this.inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts;
    }

    public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
        return inhibitorKillsPerMinCounts;
    }

    public void setInhibitorKillsPerMinCounts(ParticipantTimelineData inhibitorKillsPerMinCounts) {
        this.inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ParticipantTimelineData getTowerAssistsPerMinCounts() {
        return towerAssistsPerMinCounts;
    }

    public void setTowerAssistsPerMinCounts(ParticipantTimelineData towerAssistsPerMinCounts) {
        this.towerAssistsPerMinCounts = towerAssistsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinCounts() {
        return towerKillsPerMinCounts;
    }

    public void setTowerKillsPerMinCounts(ParticipantTimelineData towerKillsPerMinCounts) {
        this.towerKillsPerMinCounts = towerKillsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinDeltas() {
        return towerKillsPerMinDeltas;
    }

    public void setTowerKillsPerMinDeltas(ParticipantTimelineData towerKillsPerMinDeltas) {
        this.towerKillsPerMinDeltas = towerKillsPerMinDeltas;
    }

    public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
        return vilemawAssistsPerMinCounts;
    }

    public void setVilemawAssistsPerMinCounts(ParticipantTimelineData vilemawAssistsPerMinCounts) {
        this.vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts;
    }

    public ParticipantTimelineData getVilemawKillsPerMinCounts() {
        return vilemawKillsPerMinCounts;
    }

    public void setVilemawKillsPerMinCounts(ParticipantTimelineData vilemawKillsPerMinCounts) {
        this.vilemawKillsPerMinCounts = vilemawKillsPerMinCounts;
    }

    public ParticipantTimelineData getWardsPerMinDeltas() {
        return wardsPerMinDeltas;
    }

    public void setWardsPerMinDeltas(ParticipantTimelineData wardsPerMinDeltas) {
        this.wardsPerMinDeltas = wardsPerMinDeltas;
    }

    public ParticipantTimelineData getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public void setXpDiffPerMinDeltas(ParticipantTimelineData xpDiffPerMinDeltas) {
        this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
    }

    public ParticipantTimelineData getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public void setXpPerMinDeltas(ParticipantTimelineData xpPerMinDeltas) {
        this.xpPerMinDeltas = xpPerMinDeltas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantTimeline that = (ParticipantTimeline) o;
        return Objects.equals(ancientGolemAssistsPerMinCounts, that.ancientGolemAssistsPerMinCounts) &&
            Objects.equals(ancientGolemKillsPerMinCounts, that.ancientGolemKillsPerMinCounts) &&
            Objects.equals(assistedLaneDeathsPerMinDeltas, that.assistedLaneDeathsPerMinDeltas) &&
            Objects.equals(assistedLaneKillsPerMinDeltas, that.assistedLaneKillsPerMinDeltas) &&
            Objects.equals(baronAssistsPerMinCounts, that.baronAssistsPerMinCounts) &&
            Objects.equals(baronKillsPerMinCounts, that.baronKillsPerMinCounts) &&
            Objects.equals(creepsPerMinDeltas, that.creepsPerMinDeltas) &&
            Objects.equals(csDiffPerMinDeltas, that.csDiffPerMinDeltas) &&
            Objects.equals(damageTakenDiffPerMinDeltas, that.damageTakenDiffPerMinDeltas) &&
            Objects.equals(damageTakenPerMinDeltas, that.damageTakenPerMinDeltas) &&
            Objects.equals(dragonAssistsPerMinCounts, that.dragonAssistsPerMinCounts) &&
            Objects.equals(dragonKillsPerMinCounts, that.dragonKillsPerMinCounts) &&
            Objects.equals(elderLizardAssistsPerMinCounts, that.elderLizardAssistsPerMinCounts) &&
            Objects.equals(elderLizardKillsPerMinCounts, that.elderLizardKillsPerMinCounts) &&
            Objects.equals(goldPerMinDeltas, that.goldPerMinDeltas) &&
            Objects.equals(inhibitorAssistsPerMinCounts, that.inhibitorAssistsPerMinCounts) &&
            Objects.equals(inhibitorKillsPerMinCounts, that.inhibitorKillsPerMinCounts) &&
            Objects.equals(lane, that.lane) &&
            Objects.equals(role, that.role) &&
            Objects.equals(towerAssistsPerMinCounts, that.towerAssistsPerMinCounts) &&
            Objects.equals(towerKillsPerMinCounts, that.towerKillsPerMinCounts) &&
            Objects.equals(towerKillsPerMinDeltas, that.towerKillsPerMinDeltas) &&
            Objects.equals(vilemawAssistsPerMinCounts, that.vilemawAssistsPerMinCounts) &&
            Objects.equals(vilemawKillsPerMinCounts, that.vilemawKillsPerMinCounts) &&
            Objects.equals(wardsPerMinDeltas, that.wardsPerMinDeltas) &&
            Objects.equals(xpDiffPerMinDeltas, that.xpDiffPerMinDeltas) &&
            Objects.equals(xpPerMinDeltas, that.xpPerMinDeltas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancientGolemAssistsPerMinCounts, ancientGolemKillsPerMinCounts, assistedLaneDeathsPerMinDeltas, assistedLaneKillsPerMinDeltas, baronAssistsPerMinCounts, baronKillsPerMinCounts, creepsPerMinDeltas, csDiffPerMinDeltas, damageTakenDiffPerMinDeltas, damageTakenPerMinDeltas, dragonAssistsPerMinCounts, dragonKillsPerMinCounts, elderLizardAssistsPerMinCounts, elderLizardKillsPerMinCounts, goldPerMinDeltas, inhibitorAssistsPerMinCounts, inhibitorKillsPerMinCounts, lane, role, towerAssistsPerMinCounts, towerKillsPerMinCounts, towerKillsPerMinDeltas, vilemawAssistsPerMinCounts, vilemawKillsPerMinCounts, wardsPerMinDeltas, xpDiffPerMinDeltas, xpPerMinDeltas);
    }

    @Override
    public String toString() {
        return "ParticipantTimeline{" +
            "ancientGolemAssistsPerMinCounts=" + ancientGolemAssistsPerMinCounts +
            ", ancientGolemKillsPerMinCounts=" + ancientGolemKillsPerMinCounts +
            ", assistedLaneDeathsPerMinDeltas=" + assistedLaneDeathsPerMinDeltas +
            ", assistedLaneKillsPerMinDeltas=" + assistedLaneKillsPerMinDeltas +
            ", baronAssistsPerMinCounts=" + baronAssistsPerMinCounts +
            ", baronKillsPerMinCounts=" + baronKillsPerMinCounts +
            ", creepsPerMinDeltas=" + creepsPerMinDeltas +
            ", csDiffPerMinDeltas=" + csDiffPerMinDeltas +
            ", damageTakenDiffPerMinDeltas=" + damageTakenDiffPerMinDeltas +
            ", damageTakenPerMinDeltas=" + damageTakenPerMinDeltas +
            ", dragonAssistsPerMinCounts=" + dragonAssistsPerMinCounts +
            ", dragonKillsPerMinCounts=" + dragonKillsPerMinCounts +
            ", elderLizardAssistsPerMinCounts=" + elderLizardAssistsPerMinCounts +
            ", elderLizardKillsPerMinCounts=" + elderLizardKillsPerMinCounts +
            ", goldPerMinDeltas=" + goldPerMinDeltas +
            ", inhibitorAssistsPerMinCounts=" + inhibitorAssistsPerMinCounts +
            ", inhibitorKillsPerMinCounts=" + inhibitorKillsPerMinCounts +
            ", lane='" + lane + '\'' +
            ", role='" + role + '\'' +
            ", towerAssistsPerMinCounts=" + towerAssistsPerMinCounts +
            ", towerKillsPerMinCounts=" + towerKillsPerMinCounts +
            ", towerKillsPerMinDeltas=" + towerKillsPerMinDeltas +
            ", vilemawAssistsPerMinCounts=" + vilemawAssistsPerMinCounts +
            ", vilemawKillsPerMinCounts=" + vilemawKillsPerMinCounts +
            ", wardsPerMinDeltas=" + wardsPerMinDeltas +
            ", xpDiffPerMinDeltas=" + xpDiffPerMinDeltas +
            ", xpPerMinDeltas=" + xpPerMinDeltas +
            '}';
    }
}
