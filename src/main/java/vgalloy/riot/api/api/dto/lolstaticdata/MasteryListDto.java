package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MasteryListDto implements Serializable {

    private static final long serialVersionUID = 3638148151266958638L;

    private Map<String, MasteryDto> data;
    private MasteryTreeDto tree;
    private String type;
    private String version;

    public Map<String, MasteryDto> getData() {
        return data;
    }

    public void setData(Map<String, MasteryDto> data) {
        this.data = data;
    }

    public MasteryTreeDto getTree() {
        return tree;
    }

    public void setTree(MasteryTreeDto tree) {
        this.tree = tree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryListDto that = (MasteryListDto) o;
        return Objects.equals(data, that.data) &&
            Objects.equals(tree, that.tree) &&
            Objects.equals(type, that.type) &&
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, tree, type, version);
    }

    @Override
    public String toString() {
        return "MasteryListDto{" +
            "data=" + data +
            ", tree=" + tree +
            ", type='" + type + '\'' +
            ", version='" + version + '\'' +
            '}';
    }
}
