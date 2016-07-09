package vgalloy.riot.api.rest.request.currentgame.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Observer implements Serializable {

    private static final long serialVersionUID = -2400596391738345098L;

    private String encryptionKey;

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Observer observer = (Observer) o;
        return Objects.equals(encryptionKey, observer.encryptionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptionKey);
    }

    @Override
    public String toString() {
        return "Observer{" +
                "encryptionKey='" + encryptionKey + '\'' +
                '}';
    }
}
