package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Timeline implements Serializable {

    private static final long serialVersionUID = 1421796048475887198L;

    private Long frameInterval;
    private List<Frame> frames;

    public Long getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Long frameInterval) {
        this.frameInterval = frameInterval;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) o;
        return Objects.equals(frameInterval, timeline.frameInterval) &&
                Objects.equals(frames, timeline.frames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameInterval, frames);
    }

    @Override
    public String toString() {
        return "Timeline{" +
                "frameInterval=" + frameInterval +
                ", frames=" + frames +
                '}';
    }
}
