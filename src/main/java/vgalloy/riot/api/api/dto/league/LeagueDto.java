package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.constant.Tier;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueDto implements Serializable {

    private static final long serialVersionUID = -5890977182579337979L;

    private List<LeagueEntryDto> entries;
    private String name;
    private String participantId;
    private LeagueQueueType queue;
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

    public LeagueQueueType getQueue() {
        return queue;
    }

    public void setQueue(LeagueQueueType queue) {
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
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
