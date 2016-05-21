package vgalloy.riot.api.dto;

import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class LanguageStringsDto {

    private Map<String, String> data;
    private String type;
    private String version;

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
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
        return "LanguageStringsDto{" +
                "data=" + data +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
