package vgalloy.riot.api.api.dto.summoner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummonerDto implements Serializable {

    private static final long serialVersionUID = -2147808052642266730L;

    private long id;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummonerDto that = (SummonerDto) o;
        return id == that.id &&
                profileIconId == that.profileIconId &&
                revisionDate == that.revisionDate &&
                summonerLevel == that.summonerLevel &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profileIconId, revisionDate, summonerLevel);
    }

    @Override
    public String toString() {
        return "SummonerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profileIconId=" + profileIconId +
                ", revisionDate=" + revisionDate +
                ", summonerLevel=" + summonerLevel +
                '}';
    }
}