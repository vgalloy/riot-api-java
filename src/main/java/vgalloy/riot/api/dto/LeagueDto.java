package vgalloy.riot.api.dto;

import vgalloy.riot.api.dto.constant.QueueType;
import vgalloy.riot.api.dto.constant.Tier;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public class LeagueDto {

    private List<LeagueEntryDto> entries;
    private String name;
    private String participantId;
    private QueueType queue;
    private Tier tier;

    public List<LeagueEntryDto> getEntries() {
        return entries;
    }

    public void setEntries(List<LeagueEntryDto> entries) {
        this.entries = entries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public QueueType getQueue() {
        return queue;
    }

    public void setQueue(QueueType queue) {
        this.queue = queue;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }
}
