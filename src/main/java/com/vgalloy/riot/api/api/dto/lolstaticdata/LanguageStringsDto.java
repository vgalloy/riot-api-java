package com.vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class LanguageStringsDto implements Serializable {

    private static final long serialVersionUID = -6369834474551640559L;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LanguageStringsDto that = (LanguageStringsDto) o;
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
        return "LanguageStringsDto{" +
            "data=" + data +
            ", type='" + type + '\'' +
            ", version='" + version + '\'' +
            '}';
    }
}
