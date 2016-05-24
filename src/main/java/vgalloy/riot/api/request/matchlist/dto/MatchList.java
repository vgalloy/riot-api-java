package vgalloy.riot.api.request.matchlist.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MatchList {

    private int endIndex;
    private List<MatchReference> matches;
    private int startIndex;
    private int totalGames;

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public List<MatchReference> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReference> matches) {
        this.matches = matches;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchList matchList = (MatchList) o;
        return endIndex == matchList.endIndex &&
                startIndex == matchList.startIndex &&
                totalGames == matchList.totalGames &&
                Objects.equals(matches, matchList.matches);
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
