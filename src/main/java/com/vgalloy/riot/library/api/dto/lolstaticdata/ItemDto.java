package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ItemDto implements Serializable {

    private static final long serialVersionUID = -3253163759273195276L;

    private String colloq;
    private Boolean consumeOnFull;
    private Boolean consumed;
    private Integer depth;
    private String description;
    private Map<String, String> effect;
    private List<String> from;
    private GoldDto gold;
    private String group;
    private Boolean hideFromAll;
    private Integer id;
    private ImageDto image;
    private Boolean inStore;
    private List<String> into;
    private Map<String, Boolean> maps;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private MetaDataDto rune;
    private String sanitizedDescription;
    private Integer specialRecipe;
    private Integer stacks;
    private BasicDataStatsDto stats;
    private List<String> tags;

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public Boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public Boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getEffect() {
        return effect;
    }

    public void setEffect(Map<String, String> effect) {
        this.effect = effect;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public GoldDto getGold() {
        return gold;
    }

    public void setGold(GoldDto gold) {
        this.gold = gold;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(Boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
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

    public Boolean isInStore() {
        return inStore;
    }

    public void setInStore(Boolean inStore) {
        this.inStore = inStore;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public MetaDataDto getRune() {
        return rune;
    }

    public void setRune(MetaDataDto rune) {
        this.rune = rune;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public Integer getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(Integer specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
        this.stacks = stacks;
    }

    public BasicDataStatsDto getStats() {
        return stats;
    }

    public void setStats(BasicDataStatsDto stats) {
        this.stats = stats;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ItemDto)) {
            return false;
        }
        ItemDto itemDto = (ItemDto) o;
        return Objects.equals(colloq, itemDto.colloq) &&
            Objects.equals(consumeOnFull, itemDto.consumeOnFull) &&
            Objects.equals(consumed, itemDto.consumed) &&
            Objects.equals(depth, itemDto.depth) &&
            Objects.equals(description, itemDto.description) &&
            Objects.equals(effect, itemDto.effect) &&
            Objects.equals(from, itemDto.from) &&
            Objects.equals(gold, itemDto.gold) &&
            Objects.equals(group, itemDto.group) &&
            Objects.equals(hideFromAll, itemDto.hideFromAll) &&
            Objects.equals(id, itemDto.id) &&
            Objects.equals(image, itemDto.image) &&
            Objects.equals(inStore, itemDto.inStore) &&
            Objects.equals(into, itemDto.into) &&
            Objects.equals(maps, itemDto.maps) &&
            Objects.equals(name, itemDto.name) &&
            Objects.equals(plaintext, itemDto.plaintext) &&
            Objects.equals(requiredChampion, itemDto.requiredChampion) &&
            Objects.equals(rune, itemDto.rune) &&
            Objects.equals(sanitizedDescription, itemDto.sanitizedDescription) &&
            Objects.equals(specialRecipe, itemDto.specialRecipe) &&
            Objects.equals(stacks, itemDto.stacks) &&
            Objects.equals(stats, itemDto.stats) &&
            Objects.equals(tags, itemDto.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colloq, consumeOnFull, consumed, depth, description, effect, from, gold, group, hideFromAll, id, image, inStore, into, maps, name, plaintext, requiredChampion, rune, sanitizedDescription, specialRecipe, stacks, stats, tags);
    }

    @Override
    public String toString() {
        return "ItemDto{" +
            "colloq='" + colloq + '\'' +
            ", consumeOnFull=" + consumeOnFull +
            ", consumed=" + consumed +
            ", depth=" + depth +
            ", description='" + description + '\'' +
            ", effect=" + effect +
            ", from=" + from +
            ", gold=" + gold +
            ", group='" + group + '\'' +
            ", hideFromAll=" + hideFromAll +
            ", id=" + id +
            ", image=" + image +
            ", inStore=" + inStore +
            ", into=" + into +
            ", maps=" + maps +
            ", name='" + name + '\'' +
            ", plaintext='" + plaintext + '\'' +
            ", requiredChampion='" + requiredChampion + '\'' +
            ", rune=" + rune +
            ", sanitizedDescription='" + sanitizedDescription + '\'' +
            ", specialRecipe=" + specialRecipe +
            ", stacks=" + stacks +
            ", stats=" + stats +
            ", tags=" + tags +
            '}';
    }
}
