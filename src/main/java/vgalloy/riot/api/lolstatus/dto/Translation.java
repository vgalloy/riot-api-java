package vgalloy.riot.api.lolstatus.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Translation {

    private String content;
    private String locale;
    private String updated_at;

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

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
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
                Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, locale, updated_at);
    }

    @Override
    public String toString() {
        return "Translation{" +
                "content='" + content + '\'' +
                ", locale='" + locale + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}