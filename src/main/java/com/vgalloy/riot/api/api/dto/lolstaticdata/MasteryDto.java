package com.vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.api.api.constant.MasteryTree;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class MasteryDto implements Serializable {

    private static final long serialVersionUID = 5897727835074046665L;

    private List<String> description;
    private Integer id;
    private ImageDto image;
    private MasteryTree masteryTree;
    private String name;
    private String prereq;
    private Integer ranks;
    private List<String> sanitizedDescription;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getRanks() {
        return ranks;
    }

    public void setRanks(Integer ranks) {
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
        if (!(o instanceof MasteryDto)) {
            return false;
        }
        MasteryDto that = (MasteryDto) o;
        return Objects.equals(description, that.description) &&
            Objects.equals(id, that.id) &&
            Objects.equals(image, that.image) &&
            masteryTree == that.masteryTree &&
            Objects.equals(name, that.name) &&
            Objects.equals(prereq, that.prereq) &&
            Objects.equals(ranks, that.ranks) &&
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
