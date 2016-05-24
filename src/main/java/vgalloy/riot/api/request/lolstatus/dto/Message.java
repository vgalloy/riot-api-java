package vgalloy.riot.api.request.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Message {

    private String uthor;
    private String ontent;
    private String reated_at;
    private long d;
    private String everity;
    private List<Translation> ranslations;
    private String pdated_at;

    public String getUthor() {
        return uthor;
    }

    public void setUthor(String uthor) {
        this.uthor = uthor;
    }

    public String getOntent() {
        return ontent;
    }

    public void setOntent(String ontent) {
        this.ontent = ontent;
    }

    public String getReated_at() {
        return reated_at;
    }

    public void setReated_at(String reated_at) {
        this.reated_at = reated_at;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public String getEverity() {
        return everity;
    }

    public void setEverity(String everity) {
        this.everity = everity;
    }

    public List<Translation> getRanslations() {
        return ranslations;
    }

    public void setRanslations(List<Translation> ranslations) {
        this.ranslations = ranslations;
    }

    public String getPdated_at() {
        return pdated_at;
    }

    public void setPdated_at(String pdated_at) {
        this.pdated_at = pdated_at;
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
        return d == message.d &&
                Objects.equals(uthor, message.uthor) &&
                Objects.equals(ontent, message.ontent) &&
                Objects.equals(reated_at, message.reated_at) &&
                Objects.equals(everity, message.everity) &&
                Objects.equals(ranslations, message.ranslations) &&
                Objects.equals(pdated_at, message.pdated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uthor, ontent, reated_at, d, everity, ranslations, pdated_at);
    }

    @Override
    public String toString() {
        return "Message{" +
                "uthor='" + uthor + '\'' +
                ", ontent='" + ontent + '\'' +
                ", reated_at='" + reated_at + '\'' +
                ", d=" + d +
                ", everity='" + everity + '\'' +
                ", ranslations=" + ranslations +
                ", pdated_at='" + pdated_at + '\'' +
                '}';
    }
}
