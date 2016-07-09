package vgalloy.riot.api.rest.request.stats.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionStatsDto implements Serializable {

    private static final long serialVersionUID = 1980178965101442467L;

    private int id;
    private AggregatedStatsDto stats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AggregatedStatsDto getStats() {
        return stats;
    }

    public void setStats(AggregatedStatsDto stats) {
        this.stats = stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChampionStatsDto that = (ChampionStatsDto) o;
        return id == that.id &&
                Objects.equals(stats, that.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stats);
    }

    @Override
    public String toString() {
        return "ChampionStatsDto{" +
                "id=" + id +
                ", stats=" + stats +
                '}';
    }
}
