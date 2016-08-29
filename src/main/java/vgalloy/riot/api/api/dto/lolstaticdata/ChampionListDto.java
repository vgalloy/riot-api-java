package vgalloy.riot.api.api.dto.lolstaticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDto implements Serializable {

    private static final long serialVersionUID = -3068669329756114722L;

    private Map<String, ChampionDto> data;
    private String format;
    private Map<String, String> keys;
    private String type;
    private String version;

    public Map<String, ChampionDto> getData() {
        return data;
    }

    public void setData(Map<String, ChampionDto> data) {
        this.data = data;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Map<String, String> getKeys() {
        return keys;
    }

    public void setKeys(Map<String, String> keys) {
        this.keys = keys;
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
        ChampionListDto that = (ChampionListDto) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(format, that.format) &&
                Objects.equals(keys, that.keys) &&
                Objects.equals(type, that.type) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, format, keys, type, version);
    }

    @Override
    public String toString() {
        return "ChampionListDto{" +
                "data=" + data +
                ", format='" + format + '\'' +
                ", keys=" + keys +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
