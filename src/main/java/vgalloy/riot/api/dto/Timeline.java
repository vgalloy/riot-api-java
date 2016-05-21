package vgalloy.riot.api.dto;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Timeline {

    private long frameInterval;
    private List<Frame> frames;

    public long getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(long frameInterval) {
        this.frameInterval = frameInterval;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    @Override
    public String toString() {
        return "Timeline{" +
                "frameInterval=" + frameInterval +
                ", frames=" + frames +
                '}';
    }
}
