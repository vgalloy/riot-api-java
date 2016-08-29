package vgalloy.riot.api.api.dto.lolstaticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemListDto implements Serializable {

    private static final long serialVersionUID = -1342783327619893975L;

    private BasicDataDto basic;
    private Map<String, ItemDto> data;
    private List<GroupDto> groups;
    private List<ItemTreeDto> tree;
    private String type;
    private String version;

    public BasicDataDto getBasic() {
        return basic;
    }

    public void setBasic(BasicDataDto basic) {
        this.basic = basic;
    }

    public Map<String, ItemDto> getData() {
        return data;
    }

    public void setData(Map<String, ItemDto> data) {
        this.data = data;
    }

    public List<GroupDto> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDto> groups) {
        this.groups = groups;
    }

    public List<ItemTreeDto> getTree() {
        return tree;
    }

    public void setTree(List<ItemTreeDto> tree) {
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
        ItemListDto that = (ItemListDto) o;
        return Objects.equals(basic, that.basic) &&
                Objects.equals(data, that.data) &&
                Objects.equals(groups, that.groups) &&
                Objects.equals(tree, that.tree) &&
                Objects.equals(type, that.type) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic, data, groups, tree, type, version);
    }

    @Override
    public String toString() {
        return "ItemListDto{" +
                "basic=" + basic +
                ", data=" + data +
                ", groups=" + groups +
                ", tree=" + tree +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
