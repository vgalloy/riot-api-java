package vgalloy.riot.api.request.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Message {

    private String author;
    private String content;
    private String created_at;
    private String id;
    private String severity;
    private List<Translation> translations;
    private String updated_at;

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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
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
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(author, message.author) &&
                Objects.equals(content, message.content) &&
                Objects.equals(created_at, message.created_at) &&
                Objects.equals(severity, message.severity) &&
                Objects.equals(translations, message.translations) &&
                Objects.equals(updated_at, message.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, content, created_at, id, severity, translations, updated_at);
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", created_at='" + created_at + '\'' +
                ", id=" + id +
                ", severity='" + severity + '\'' +
                ", translations=" + translations +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
