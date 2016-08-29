package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Timeline implements Serializable {

    private static final long serialVersionUID = 1421796048475887198L;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Timeline timeline = (Timeline) o;
        return frameInterval == timeline.frameInterval &&
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