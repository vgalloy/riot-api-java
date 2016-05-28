package vgalloy.riot.api.rest.request.lolstatus.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Message {

    private String author;
    private String content;
    @JsonProperty("created_at")
    private String createdAt;
    private String id;
    private String severity;
    private List<Translation> translations;
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
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
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(author, message.author) &&
                Objects.equals(content, message.content) &&
                Objects.equals(createdAt, message.createdAt) &&
                Objects.equals(severity, message.severity) &&
                Objects.equals(translations, message.translations) &&
                Objects.equals(updatedAt, message.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, content, createdAt, id, severity, translations, updatedAt);
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", id=" + id +
                ", severity='" + severity + '\'' +
                ", translations=" + translations +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
