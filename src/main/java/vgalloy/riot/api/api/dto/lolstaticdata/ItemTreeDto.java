package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ItemTreeDto implements Serializable {

    private static final long serialVersionUID = 6788374486650041637L;

    private String header;
    private List<String> tags;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemTreeDto that = (ItemTreeDto) o;
        return Objects.equals(header, that.header) &&
            Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, tags);
    }

    @Override
    public String toString() {
        return "ItemTreeDto{" +
            "header='" + header + '\'' +
            ", tags=" + tags +
            '}';
    }
}
