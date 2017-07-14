package com.vgalloy.riot.api.internal.dto.champion;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public class ChampionDto implements Serializable {

    private static final long serialVersionUID = -8332035146067802177L;

    private Long id;
    private Boolean active;
    private Boolean freeToPlay;
    private Boolean botEnabled;
    private Boolean botMmEnabled;
    private Boolean rankedPlayEnabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(Boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public Boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(Boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public Boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(Boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public Boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(Boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChampionDto)) {
            return false;
        }
        ChampionDto that = (ChampionDto) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(active, that.active) &&
            Objects.equals(freeToPlay, that.freeToPlay) &&
            Objects.equals(botEnabled, that.botEnabled) &&
            Objects.equals(botMmEnabled, that.botMmEnabled) &&
            Objects.equals(rankedPlayEnabled, that.rankedPlayEnabled);
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
