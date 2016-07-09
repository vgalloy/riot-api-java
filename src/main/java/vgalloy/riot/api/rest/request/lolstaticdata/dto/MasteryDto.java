package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vgalloy.riot.api.rest.constant.MasteryTree;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryDto implements Serializable {

    private static final long serialVersionUID = 5897727835074046665L;

    private List<String> description;
    private int id;
    private ImageDto image;
    private MasteryTree masteryTree;
    private String name;
    private String prereq;
    private int ranks;
    private List<String> sanitizedDescription;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public MasteryTree getMasteryTree() {
        return masteryTree;
    }

    public void setMasteryTree(MasteryTree masteryTree) {
        this.masteryTree = masteryTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrereq() {
        return prereq;
    }

    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public List<String> getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(List<String> sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryDto that = (MasteryDto) o;
        return id == that.id &&
                ranks == that.ranks &&
                Objects.equals(description, that.description) &&
                Objects.equals(image, that.image) &&
                masteryTree == that.masteryTree &&
                Objects.equals(name, that.name) &&
                Objects.equals(prereq, that.prereq) &&
                Objects.equals(sanitizedDescription, that.sanitizedDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, image, masteryTree, name, prereq, ranks, sanitizedDescription);
    }

    @Override
    public String toString() {
        return "MasteryDto{" +
                "description=" + description +
                ", id=" + id +
                ", image=" + image +
                ", masteryTree=" + masteryTree +
                ", name='" + name + '\'' +
                ", prereq='" + prereq + '\'' +
                ", ranks=" + ranks +
                ", sanitizedDescription=" + sanitizedDescription +
                '}';
    }
}
