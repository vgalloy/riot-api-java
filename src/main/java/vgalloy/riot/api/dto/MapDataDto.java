package vgalloy.riot.api.dto;

import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MapDataDto {

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
    public String toString() {
        return "MapDataDto{" +
                "data=" + data +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
