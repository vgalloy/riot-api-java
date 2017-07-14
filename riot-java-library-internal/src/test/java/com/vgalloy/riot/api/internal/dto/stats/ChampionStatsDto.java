package com.vgalloy.riot.api.internal.dto.stats;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ChampionStatsDto implements Serializable {

    private static final long serialVersionUID = 1980178965101442467L;

    private Integer id;
    private AggregatedStatsDto stats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (!(o instanceof ChampionStatsDto)) {
            return false;
        }
        ChampionStatsDto that = (ChampionStatsDto) o;
        return Objects.equals(id, that.id) &&
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
