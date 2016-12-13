package vgalloy.riot.api.api.dto.summoner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryPagesDto implements Serializable {

    private static final long serialVersionUID = -6627455402286223114L;

    private Set<MasteryPageDto> pages;
    private Long summonerId;

    public Set<MasteryPageDto> getPages() {
        return pages;
    }

    public void setPages(Set<MasteryPageDto> pages) {
        this.pages = pages;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MasteryPagesDto)) {
            return false;
        }
        MasteryPagesDto that = (MasteryPagesDto) o;
        return Objects.equals(pages, that.pages) &&
                Objects.equals(summonerId, that.summonerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, summonerId);
    }

    @Override
    public String toString() {
        return "MasteryPagesDto{" +
                "pages=" + pages +
                ", summonerId=" + summonerId +
                '}';
    }
}
