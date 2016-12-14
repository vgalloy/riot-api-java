package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MapDataDto implements Serializable {

    private static final long serialVersionUID = 6587872487213756793L;

    private Map<String, MapDetailsDto> data;
    private String type;
    private String version;

    public Map<String, MapDetailsDto> getData() {
        return data;
    }

    public void setData(Map<String, MapDetailsDto> data) {
        this.data = data;
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
        MapDataDto that = (MapDataDto) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(type, that.type) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, type, version);
    }

    @Override
    public String toString() {
        return "MapDataDto{" +
                "data=" + data +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
