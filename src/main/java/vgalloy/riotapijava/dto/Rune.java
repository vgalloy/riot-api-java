package vgalloy.riotapijava.dto;
/**
 * Created by Vincent Galloy on 19/05/16.
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
    public String toString() {
        return "Rune{" +
                "count=" + count +
                ", runId=" + runId +
                '}';
    }
}
