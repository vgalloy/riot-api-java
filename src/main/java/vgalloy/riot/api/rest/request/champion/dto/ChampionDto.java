package vgalloy.riot.api.rest.request.champion.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class ChampionDto implements Serializable {

    private long id;
    private boolean active;
    private boolean freeToPlay;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean rankedPlayEnabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChampionDto that = (ChampionDto) o;
        return id == that.id &&
                active == that.active &&
                freeToPlay == that.freeToPlay &&
                botEnabled == that.botEnabled &&
                botMmEnabled == that.botMmEnabled &&
                rankedPlayEnabled == that.rankedPlayEnabled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, freeToPlay, botEnabled, botMmEnabled, rankedPlayEnabled);
    }

    @Override
    public String toString() {
        return "ChampionDto{" +
                "id=" + id +
                ", active=" + active +
                ", freeToPlay=" + freeToPlay +
                ", botEnabled=" + botEnabled +
                ", botMmEnabled=" + botMmEnabled +
                ", rankedPlayEnabled=" + rankedPlayEnabled +
                '}';
    }
}
