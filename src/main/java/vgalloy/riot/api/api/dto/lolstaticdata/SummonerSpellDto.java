package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummonerSpellDto implements Serializable {

    private static final long serialVersionUID = 4533241267458654734L;

    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private String costType;
    private String description;
    private List<Object> effect;
    private List<String> effectBurn;
    private Integer id;
    private ImageDto image;
    private String key;
    private LevelTipDto leveltip;
    private Integer maxrank;
    private List<String> modes;
    private String name;
    private Object range;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private Integer summonerLevel;
    private String tooltip;
    private List<SpellVarsDto> vars;

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

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
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

    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
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
        if (!(o instanceof SummonerSpellDto)) {
            return false;
        }
        SummonerSpellDto that = (SummonerSpellDto) o;
        return Objects.equals(cooldown, that.cooldown) &&
                Objects.equals(cooldownBurn, that.cooldownBurn) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(costBurn, that.costBurn) &&
                Objects.equals(costType, that.costType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(effect, that.effect) &&
                Objects.equals(effectBurn, that.effectBurn) &&
                Objects.equals(id, that.id) &&
                Objects.equals(image, that.image) &&
                Objects.equals(key, that.key) &&
                Objects.equals(leveltip, that.leveltip) &&
                Objects.equals(maxrank, that.maxrank) &&
                Objects.equals(modes, that.modes) &&
                Objects.equals(name, that.name) &&
                Objects.equals(range, that.range) &&
                Objects.equals(rangeBurn, that.rangeBurn) &&
                Objects.equals(resource, that.resource) &&
                Objects.equals(sanitizedDescription, that.sanitizedDescription) &&
                Objects.equals(sanitizedTooltip, that.sanitizedTooltip) &&
                Objects.equals(summonerLevel, that.summonerLevel) &&
                Objects.equals(tooltip, that.tooltip) &&
                Objects.equals(vars, that.vars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cooldown, cooldownBurn, cost, costBurn, costType, description, effect, effectBurn, id, image, key, leveltip, maxrank, modes, name, range, rangeBurn, resource, sanitizedDescription, sanitizedTooltip, summonerLevel, tooltip, vars);
    }

    @Override
    public String toString() {
        return "SummonerSpellDto{" +
                "cooldown=" + cooldown +
                ", cooldownBurn='" + cooldownBurn + '\'' +
                ", cost=" + cost +
                ", costBurn='" + costBurn + '\'' +
                ", costType='" + costType + '\'' +
                ", description='" + description + '\'' +
                ", effect=" + effect +
                ", effectBurn=" + effectBurn +
                ", id=" + id +
                ", image=" + image +
                ", key='" + key + '\'' +
                ", leveltip=" + leveltip +
                ", maxrank=" + maxrank +
                ", modes=" + modes +
                ", name='" + name + '\'' +
                ", range=" + range +
                ", rangeBurn='" + rangeBurn + '\'' +
                ", resource='" + resource + '\'' +
                ", sanitizedDescription='" + sanitizedDescription + '\'' +
                ", sanitizedTooltip='" + sanitizedTooltip + '\'' +
                ", summonerLevel=" + summonerLevel +
                ", tooltip='" + tooltip + '\'' +
                ", vars=" + vars +
                '}';
    }
}

