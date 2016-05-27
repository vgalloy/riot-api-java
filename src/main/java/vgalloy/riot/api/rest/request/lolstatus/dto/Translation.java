package vgalloy.riot.api.rest.request.lolstatus.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Translation {

    private String content;
    private String locale;
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Translation that = (Translation) o;
        return Objects.equals(content, that.content) &&
                Objects.equals(locale, that.locale) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, locale, updatedAt);
    }

    @Override
    public String toString() {
        return "Translation{" +
                "content='" + content + '\'' +
                ", locale='" + locale + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
