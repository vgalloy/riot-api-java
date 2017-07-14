package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class RecommendedDto implements Serializable {

    private static final long serialVersionUID = -7118772025410454070L;

    private List<BlockDto> blocks;
    private String champion;
    private String map;
    private String mode;
    private Boolean priority;
    private String title;
    private String type;

    public List<BlockDto> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockDto> blocks) {
        this.blocks = blocks;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean isPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedDto)) {
            return false;
        }
        RecommendedDto that = (RecommendedDto) o;
        return Objects.equals(blocks, that.blocks) &&
            Objects.equals(champion, that.champion) &&
            Objects.equals(map, that.map) &&
            Objects.equals(mode, that.mode) &&
            Objects.equals(priority, that.priority) &&
            Objects.equals(title, that.title) &&
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blocks, champion, map, mode, priority, title, type);
    }

    @Override
    public String toString() {
        return "RecommendedDto{" +
            "blocks=" + blocks +
            ", champion='" + champion + '\'' +
            ", map='" + map + '\'' +
            ", mode='" + mode + '\'' +
            ", priority=" + priority +
            ", title='" + title + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
}
