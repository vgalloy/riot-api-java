package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
public class RecommendedDto {

    private List<BlockDto> blocks;
    private String champion;
    private String map;
    private String mode;
    private boolean priority;
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

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecommendedDto that = (RecommendedDto) o;
        return priority == that.priority &&
                Objects.equals(blocks, that.blocks) &&
                Objects.equals(champion, that.champion) &&
                Objects.equals(map, that.map) &&
                Objects.equals(mode, that.mode) &&
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
