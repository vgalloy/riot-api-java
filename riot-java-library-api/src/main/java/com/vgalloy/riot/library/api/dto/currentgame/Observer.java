package com.vgalloy.riot.library.api.dto.currentgame;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
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
        if (!(o instanceof Observer)) {
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
