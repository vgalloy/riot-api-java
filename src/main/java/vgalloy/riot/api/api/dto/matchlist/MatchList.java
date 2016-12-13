package vgalloy.riot.api.api.dto.matchlist;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchList implements Serializable {

    private static final long serialVersionUID = 907811536739611091L;

    private Integer endIndex;
    private List<MatchReference> matches;
    private Integer startIndex;
    private Integer totalGames;

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public List<MatchReference> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReference> matches) {
        this.matches = matches;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchList)) {
            return false;
        }
        MatchList matchList = (MatchList) o;
        return Objects.equals(endIndex, matchList.endIndex) &&
                Objects.equals(matches, matchList.matches) &&
                Objects.equals(startIndex, matchList.startIndex) &&
                Objects.equals(totalGames, matchList.totalGames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endIndex, matches, startIndex, totalGames);
    }

    @Override
    public String toString() {
        return "MatchList{" +
                "endIndex=" + endIndex +
                ", matches=" + matches +
                ", startIndex=" + startIndex +
                ", totalGames=" + totalGames +
                '}';
    }
}
