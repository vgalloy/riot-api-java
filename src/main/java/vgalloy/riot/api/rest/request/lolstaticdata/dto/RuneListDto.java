package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class RuneListDto {

    private BasicDataDto basic;
    private Map<String, RuneDto> data;
    private String type;
    private String version;

    public BasicDataDto getBasic() {
        return basic;
    }

    public void setBasic(BasicDataDto basic) {
        this.basic = basic;
    }

    public Map<String, RuneDto> getData() {
        return data;
    }

    public void setData(Map<String, RuneDto> data) {
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
        RuneListDto that = (RuneListDto) o;
        return Objects.equals(basic, that.basic) &&
                Objects.equals(data, that.data) &&
                Objects.equals(type, that.type) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic, data, type, version);
    }

    @Override
    public String toString() {
        return "RuneListDto{" +
                "basic=" + basic +
                ", data=" + data +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
