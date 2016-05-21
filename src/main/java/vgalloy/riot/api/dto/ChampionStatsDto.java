package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ChampionStatsDto {

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
    public String toString() {
        return "ChampionStatsDto{" +
                "id=" + id +
                ", stats=" + stats +
                '}';
    }
}
