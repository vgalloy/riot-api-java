package vgalloy.riot.api.api.dto.summoner;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class SummonerDto implements Serializable {

    private static final long serialVersionUID = -2147808052642266730L;

    private Long id;
    private String name;
    private Integer profileIconId;
    private Long revisionDate;
    private Long summonerLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public Long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public Long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummonerDto)) {
            return false;
        }
        SummonerDto that = (SummonerDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(profileIconId, that.profileIconId) &&
                Objects.equals(revisionDate, that.revisionDate) &&
                Objects.equals(summonerLevel, that.summonerLevel);
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
