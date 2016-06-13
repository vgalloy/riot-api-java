package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDto {

    private List<BlockItemDto> items;
    private boolean recMath;
    private String type;

    public List<BlockItemDto> getItems() {
        return items;
    }

    public void setItems(List<BlockItemDto> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockDto blockDto = (BlockDto) o;
        return recMath == blockDto.recMath &&
                Objects.equals(items, blockDto.items) &&
                Objects.equals(type, blockDto.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, recMath, type);
    }

    @Override
    public String toString() {
        return "BlockDto{" +
                "items=" + items +
                ", recMath=" + recMath +
                ", type='" + type + '\'' +
                '}';
    }
}
