package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class BlockDto implements Serializable {

    private static final long serialVersionUID = -4377326597195325231L;

    private List<BlockItemDto> items;
    private Boolean recMath;
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
        if (!(o instanceof BlockDto)) {
            return false;
        }
        BlockDto blockDto = (BlockDto) o;
        return Objects.equals(items, blockDto.items) &&
            Objects.equals(recMath, blockDto.recMath) &&
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
