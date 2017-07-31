package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 31/07/17.
 *
 * @author Vincent Galloy
 */
public class LeagueListDto implements Serializable {

    private static final long serialVersionUID = 8057863364245346363L;

    private String tier;
    private String queue;
    private String name;
    private List<LeagueItemDto> entries;

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LeagueItemDto> getEntries() {
        return entries;
    }

    public void setEntries(List<LeagueItemDto> entries) {
        this.entries = entries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LeagueListDto that = (LeagueListDto) o;
        return Objects.equals(tier, that.tier) &&
                Objects.equals(queue, that.queue) &&
                Objects.equals(name, that.name) &&
                Objects.equals(entries, that.entries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier, queue, name, entries);
    }

    @Override
    public String toString() {
        return "LeagueListDto{" +
                "tier='" + tier + '\'' +
                ", queue='" + queue + '\'' +
                ", name='" + name + '\'' +
                ", entries=" + entries +
                '}';
    }
}
