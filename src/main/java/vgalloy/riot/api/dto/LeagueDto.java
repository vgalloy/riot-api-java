package vgalloy.riot.api.dto;

import vgalloy.riot.api.dto.constant.QueueType;
import vgalloy.riot.api.dto.constant.Tier;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeagueDto leagueDto = (LeagueDto) o;
        return Objects.equals(entries, leagueDto.entries) &&
                Objects.equals(name, leagueDto.name) &&
                Objects.equals(participantId, leagueDto.participantId) &&
                queue == leagueDto.queue &&
                tier == leagueDto.tier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entries, name, participantId, queue, tier);
    }

    @Override
    public String toString() {
        return "LeagueDto{" +
                "entries=" + entries +
                ", name='" + name + '\'' +
                ", participantId='" + participantId + '\'' +
                ", queue=" + queue +
                ", tier=" + tier +
                '}';
    }
}
