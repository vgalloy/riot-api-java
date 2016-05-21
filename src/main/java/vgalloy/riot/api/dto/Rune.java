package vgalloy.riot.api.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class Rune {

    private int count;
    private long runId;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rune rune = (Rune) o;
        return count == rune.count &&
                runId == rune.runId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, runId);
    }

    @Override
    public String toString() {
        return "Rune{" +
                "count=" + count +
                ", runId=" + runId +
                '}';
    }
}
