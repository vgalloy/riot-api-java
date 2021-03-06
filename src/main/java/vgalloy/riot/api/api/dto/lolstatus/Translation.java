package vgalloy.riot.api.api.dto.lolstatus;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class Translation implements Serializable {

    private static final long serialVersionUID = -5175574601062082762L;

    private String content;
    private String locale;
    @JsonProperty("updated_at")
    private String updatedAt;
    private String heading;

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

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
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
            Objects.equals(updatedAt, that.updatedAt) &&
            Objects.equals(heading, that.heading);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, locale, updatedAt, heading);
    }

    @Override
    public String toString() {
        return "Translation{" +
            "content='" + content + '\'' +
            ", locale='" + locale + '\'' +
            ", updatedAt='" + updatedAt + '\'' +
            ", heading='" + heading + '\'' +
            '}';
    }
}
