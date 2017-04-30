package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class ChampionSpellDto implements Serializable {

    private static final long serialVersionUID = 6545547053430860603L;

    private List<ImageDto> altimages;
    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private String costType;
    private String description;
    private List<Object> effect;
    private List<String> effectBurn;
    private ImageDto image;
    private String key;
    private LevelTipDto leveltip;
    private Integer maxrank;
    private String name;
    private Object range;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private String tooltip;
    private List<SpellVarsDto> vars;

    public List<ImageDto> getAltimages() {
        return altimages;
    }

    public void setAltimages(List<ImageDto> altimages) {
        this.altimages = altimages;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LevelTipDto getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(LevelTipDto leveltip) {
        this.leveltip = leveltip;
    }

    public Integer getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(Integer maxrank) {
        this.maxrank = maxrank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public void setSanitizedTooltip(String sanitizedTooltip) {
        this.sanitizedTooltip = sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public List<SpellVarsDto> getVars() {
        return vars;
    }

    public void setVars(List<SpellVarsDto> vars) {
        this.vars = vars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChampionSpellDto)) {
            return false;
        }
        ChampionSpellDto that = (ChampionSpellDto) o;
        return Objects.equals(altimages, that.altimages) &&
            Objects.equals(cooldown, that.cooldown) &&
            Objects.equals(cooldownBurn, that.cooldownBurn) &&
            Objects.equals(cost, that.cost) &&
            Objects.equals(costBurn, that.costBurn) &&
            Objects.equals(costType, that.costType) &&
            Objects.equals(description, that.description) &&
            Objects.equals(effect, that.effect) &&
            Objects.equals(effectBurn, that.effectBurn) &&
            Objects.equals(image, that.image) &&
            Objects.equals(key, that.key) &&
            Objects.equals(leveltip, that.leveltip) &&
            Objects.equals(maxrank, that.maxrank) &&
            Objects.equals(name, that.name) &&
            Objects.equals(range, that.range) &&
            Objects.equals(rangeBurn, that.rangeBurn) &&
            Objects.equals(resource, that.resource) &&
            Objects.equals(sanitizedDescription, that.sanitizedDescription) &&
            Objects.equals(sanitizedTooltip, that.sanitizedTooltip) &&
            Objects.equals(tooltip, that.tooltip) &&
            Objects.equals(vars, that.vars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altimages, cooldown, cooldownBurn, cost, costBurn, costType, description, effect, effectBurn, image, key, leveltip, maxrank, name, range, rangeBurn, resource, sanitizedDescription, sanitizedTooltip, tooltip, vars);
    }

    @Override
    public String toString() {
        return "ChampionSpellDto{" +
            "altimages=" + altimages +
            ", cooldown=" + cooldown +
            ", cooldownBurn='" + cooldownBurn + '\'' +
            ", cost=" + cost +
            ", costBurn='" + costBurn + '\'' +
            ", costType='" + costType + '\'' +
            ", description='" + description + '\'' +
            ", effect=" + effect +
            ", effectBurn=" + effectBurn +
            ", image=" + image +
            ", key='" + key + '\'' +
            ", leveltip=" + leveltip +
            ", maxrank=" + maxrank +
            ", name='" + name + '\'' +
            ", range=" + range +
            ", rangeBurn='" + rangeBurn + '\'' +
            ", resource='" + resource + '\'' +
            ", sanitizedDescription='" + sanitizedDescription + '\'' +
            ", sanitizedTooltip='" + sanitizedTooltip + '\'' +
            ", tooltip='" + tooltip + '\'' +
            ", vars=" + vars +
            '}';
    }
}
