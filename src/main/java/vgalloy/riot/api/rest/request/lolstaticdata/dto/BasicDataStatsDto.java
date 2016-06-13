package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicDataStatsDto {

    @JsonProperty("FlatArmorMod")
    private double flatArmorMod;
    @JsonProperty("FlatAttackSpeedMod")
    private double flatAttackSpeedMod;
    @JsonProperty("FlatBlockMod")
    private double flatBlockMod;
    @JsonProperty("FlatCritChanceMod")
    private double flatCritChanceMod;
    @JsonProperty("FlatCritDamageMod")
    private double flatCritDamageMod;
    @JsonProperty("FlatEXPBonus")
    private double flatEXPBonus;
    @JsonProperty("FlatEnergyPoolMod")
    private double flatEnergyPoolMod;
    @JsonProperty("FlatEnergyRegenMod")
    private double flatEnergyRegenMod;
    @JsonProperty("FlatHPPoolMod")
    private double flatHPPoolMod;
    @JsonProperty("FlatHPRegenMod")
    private double flatHPRegenMod;
    @JsonProperty("FlatMPPoolMod")
    private double flatMPPoolMod;
    @JsonProperty("FlatMPRegenMod")
    private double flatMPRegenMod;
    @JsonProperty("FlatMagicDamageMod")
    private double flatMagicDamageMod;
    @JsonProperty("FlatMovementSpeedMod")
    private double flatMovementSpeedMod;
    @JsonProperty("FlatPhysicalDamageMod")
    private double flatPhysicalDamageMod;
    @JsonProperty("FlatSpellBlockMod")
    private double flatSpellBlockMod;
    @JsonProperty("PercentArmorMod")
    private double percentArmorMod;
    @JsonProperty("PercentAttackSpeedMod")
    private double percentAttackSpeedMod;
    @JsonProperty("PercentBlockMod")
    private double percentBlockMod;
    @JsonProperty("PercentCritChanceMod")
    private double percentCritChanceMod;
    @JsonProperty("PercentCritDamageMod")
    private double percentCritDamageMod;
    @JsonProperty("PercentDodgeMod")
    private double percentDodgeMod;
    @JsonProperty("PercentEXPBonus")
    private double percentEXPBonus;
    @JsonProperty("PercentHPPoolMod")
    private double percentHPPoolMod;
    @JsonProperty("PercentHPRegenMod")
    private double percentHPRegenMod;
    @JsonProperty("PercentLifeStealMod")
    private double percentLifeStealMod;
    @JsonProperty("PercentMPPoolMod")
    private double percentMPPoolMod;
    @JsonProperty("PercentMPRegenMod")
    private double percentMPRegenMod;
    @JsonProperty("PercentMagicDamageMod")
    private double percentMagicDamageMod;
    @JsonProperty("PercentMovementSpeedMod")
    private double percentMovementSpeedMod;
    @JsonProperty("PercentPhysicalDamageMod")
    private double percentPhysicalDamageMod;
    @JsonProperty("PercentSpellBlockMod")
    private double percentSpellBlockMod;
    @JsonProperty("PercentSpellVampMod")
    private double percentSpellVampMod;
    @JsonProperty("rFlatArmorModPerLevel")
    private double flatArmorModPerLevel;
    @JsonProperty("rFlatArmorPenetrationMod")
    private double flatArmorPenetrationMod;
    @JsonProperty("rFlatArmorPenetrationModPerLevel")
    private double flatArmorPenetrationModPerLevel;
    @JsonProperty("rFlatCritChanceModPerLevel")
    private double flatCritChanceModPerLevel;
    @JsonProperty("rFlatCritDamageModPerLevel")
    private double flatCritDamageModPerLevel;
    @JsonProperty("rFlatDodgeMod")
    private double flatDodgeMod;
    @JsonProperty("rFlatDodgeModPerLevel")
    private double flatDodgeModPerLevel;
    @JsonProperty("rFlatEnergyModPerLevel")
    private double flatEnergyModPerLevel;
    @JsonProperty("rFlatEnergyRegenModPerLevel")
    private double flatEnergyRegenModPerLevel;
    @JsonProperty("rFlatGoldPer10Mod")
    private double flatGoldPer10Mod;
    @JsonProperty("rFlatHPModPerLevel")
    private double flatHPModPerLevel;
    @JsonProperty("rFlatHPRegenModPerLevel")
    private double flatHPRegenModPerLevel;
    @JsonProperty("rFlatMPModPerLevel")
    private double flatMPModPerLevel;
    @JsonProperty("rFlatMPRegenModPerLevel")
    private double flatMPRegenModPerLevel;
    @JsonProperty("rFlatMagicDamageModPerLevel")
    private double flatMagicDamageModPerLevel;
    @JsonProperty("rFlatMagicPenetrationMod")
    private double flatMagicPenetrationMod;
    @JsonProperty("rFlatMagicPenetrationModPerLevel")
    private double flatMagicPenetrationModPerLevel;
    @JsonProperty("rFlatMovementSpeedModPerLevel")
    private double flatMovementSpeedModPerLevel;
    @JsonProperty("rFlatPhysicalDamageModPerLevel")
    private double flatPhysicalDamageModPerLevel;
    @JsonProperty("rFlatSpellBlockModPerLevel")
    private double flatSpellBlockModPerLevel;
    @JsonProperty("rFlatTimeDeadMod")
    private double flatTimeDeadMod;
    @JsonProperty("rFlatTimeDeadModPerLevel")
    private double flatTimeDeadModPerLevel;
    @JsonProperty("rPercentArmorPenetrationMod")
    private double percentArmorPenetrationMod;
    @JsonProperty("rPercentArmorPenetrationModPerLevel")
    private double percentArmorPenetrationModPerLevel;
    @JsonProperty("rPercentAttackSpeedModPerLevel")
    private double percentAttackSpeedModPerLevel;
    @JsonProperty("rPercentCooldownMod")
    private double percentCooldownMod;
    @JsonProperty("rPercentCooldownModPerLevel")
    private double percentCooldownModPerLevel;
    @JsonProperty("rPercentMagicPenetrationMod")
    private double percentMagicPenetrationMod;
    @JsonProperty("rPercentMagicPenetrationModPerLevel")
    private double percentMagicPenetrationModPerLevel;
    @JsonProperty("rPercentMovementSpeedModPerLevel")
    private double percentMovementSpeedModPerLevel;
    @JsonProperty("rPercentTimeDeadMod")
    private double percentTimeDeadMod;
    @JsonProperty("rPercentTimeDeadModPerLevel")
    private double percentTimeDeadModPerLevel;

    public double getFlatArmorMod() {
        return flatArmorMod;
    }

    public void setFlatArmorMod(double flatArmorMod) {
        this.flatArmorMod = flatArmorMod;
    }

    public double getFlatAttackSpeedMod() {
        return flatAttackSpeedMod;
    }

    public void setFlatAttackSpeedMod(double flatAttackSpeedMod) {
        this.flatAttackSpeedMod = flatAttackSpeedMod;
    }

    public double getFlatBlockMod() {
        return flatBlockMod;
    }

    public void setFlatBlockMod(double flatBlockMod) {
        this.flatBlockMod = flatBlockMod;
    }

    public double getFlatCritChanceMod() {
        return flatCritChanceMod;
    }

    public void setFlatCritChanceMod(double flatCritChanceMod) {
        this.flatCritChanceMod = flatCritChanceMod;
    }

    public double getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(double flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public double getFlatEXPBonus() {
        return flatEXPBonus;
    }

    public void setFlatEXPBonus(double flatEXPBonus) {
        this.flatEXPBonus = flatEXPBonus;
    }

    public double getFlatEnergyPoolMod() {
        return flatEnergyPoolMod;
    }

    public void setFlatEnergyPoolMod(double flatEnergyPoolMod) {
        this.flatEnergyPoolMod = flatEnergyPoolMod;
    }

    public double getFlatEnergyRegenMod() {
        return flatEnergyRegenMod;
    }

    public void setFlatEnergyRegenMod(double flatEnergyRegenMod) {
        this.flatEnergyRegenMod = flatEnergyRegenMod;
    }

    public double getFlatHPPoolMod() {
        return flatHPPoolMod;
    }

    public void setFlatHPPoolMod(double flatHPPoolMod) {
        this.flatHPPoolMod = flatHPPoolMod;
    }

    public double getFlatHPRegenMod() {
        return flatHPRegenMod;
    }

    public void setFlatHPRegenMod(double flatHPRegenMod) {
        this.flatHPRegenMod = flatHPRegenMod;
    }

    public double getFlatMPPoolMod() {
        return flatMPPoolMod;
    }

    public void setFlatMPPoolMod(double flatMPPoolMod) {
        this.flatMPPoolMod = flatMPPoolMod;
    }

    public double getFlatMPRegenMod() {
        return flatMPRegenMod;
    }

    public void setFlatMPRegenMod(double flatMPRegenMod) {
        this.flatMPRegenMod = flatMPRegenMod;
    }

    public double getFlatMagicDamageMod() {
        return flatMagicDamageMod;
    }

    public void setFlatMagicDamageMod(double flatMagicDamageMod) {
        this.flatMagicDamageMod = flatMagicDamageMod;
    }

    public double getFlatMovementSpeedMod() {
        return flatMovementSpeedMod;
    }

    public void setFlatMovementSpeedMod(double flatMovementSpeedMod) {
        this.flatMovementSpeedMod = flatMovementSpeedMod;
    }

    public double getFlatPhysicalDamageMod() {
        return flatPhysicalDamageMod;
    }

    public void setFlatPhysicalDamageMod(double flatPhysicalDamageMod) {
        this.flatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public double getFlatSpellBlockMod() {
        return flatSpellBlockMod;
    }

    public void setFlatSpellBlockMod(double flatSpellBlockMod) {
        this.flatSpellBlockMod = flatSpellBlockMod;
    }

    public double getPercentArmorMod() {
        return percentArmorMod;
    }

    public void setPercentArmorMod(double percentArmorMod) {
        this.percentArmorMod = percentArmorMod;
    }

    public double getPercentAttackSpeedMod() {
        return percentAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(double percentAttackSpeedMod) {
        this.percentAttackSpeedMod = percentAttackSpeedMod;
    }

    public double getPercentBlockMod() {
        return percentBlockMod;
    }

    public void setPercentBlockMod(double percentBlockMod) {
        this.percentBlockMod = percentBlockMod;
    }

    public double getPercentCritChanceMod() {
        return percentCritChanceMod;
    }

    public void setPercentCritChanceMod(double percentCritChanceMod) {
        this.percentCritChanceMod = percentCritChanceMod;
    }

    public double getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(double percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public double getPercentDodgeMod() {
        return percentDodgeMod;
    }

    public void setPercentDodgeMod(double percentDodgeMod) {
        this.percentDodgeMod = percentDodgeMod;
    }

    public double getPercentEXPBonus() {
        return percentEXPBonus;
    }

    public void setPercentEXPBonus(double percentEXPBonus) {
        this.percentEXPBonus = percentEXPBonus;
    }

    public double getPercentHPPoolMod() {
        return percentHPPoolMod;
    }

    public void setPercentHPPoolMod(double percentHPPoolMod) {
        this.percentHPPoolMod = percentHPPoolMod;
    }

    public double getPercentHPRegenMod() {
        return percentHPRegenMod;
    }

    public void setPercentHPRegenMod(double percentHPRegenMod) {
        this.percentHPRegenMod = percentHPRegenMod;
    }

    public double getPercentLifeStealMod() {
        return percentLifeStealMod;
    }

    public void setPercentLifeStealMod(double percentLifeStealMod) {
        this.percentLifeStealMod = percentLifeStealMod;
    }

    public double getPercentMPPoolMod() {
        return percentMPPoolMod;
    }

    public void setPercentMPPoolMod(double percentMPPoolMod) {
        this.percentMPPoolMod = percentMPPoolMod;
    }

    public double getPercentMPRegenMod() {
        return percentMPRegenMod;
    }

    public void setPercentMPRegenMod(double percentMPRegenMod) {
        this.percentMPRegenMod = percentMPRegenMod;
    }

    public double getPercentMagicDamageMod() {
        return percentMagicDamageMod;
    }

    public void setPercentMagicDamageMod(double percentMagicDamageMod) {
        this.percentMagicDamageMod = percentMagicDamageMod;
    }

    public double getPercentMovementSpeedMod() {
        return percentMovementSpeedMod;
    }

    public void setPercentMovementSpeedMod(double percentMovementSpeedMod) {
        this.percentMovementSpeedMod = percentMovementSpeedMod;
    }

    public double getPercentPhysicalDamageMod() {
        return percentPhysicalDamageMod;
    }

    public void setPercentPhysicalDamageMod(double percentPhysicalDamageMod) {
        this.percentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public double getPercentSpellBlockMod() {
        return percentSpellBlockMod;
    }

    public void setPercentSpellBlockMod(double percentSpellBlockMod) {
        this.percentSpellBlockMod = percentSpellBlockMod;
    }

    public double getPercentSpellVampMod() {
        return percentSpellVampMod;
    }

    public void setPercentSpellVampMod(double percentSpellVampMod) {
        this.percentSpellVampMod = percentSpellVampMod;
    }

    public double getFlatArmorModPerLevel() {
        return flatArmorModPerLevel;
    }

    public void setFlatArmorModPerLevel(double flatArmorModPerLevel) {
        this.flatArmorModPerLevel = flatArmorModPerLevel;
    }

    public double getFlatArmorPenetrationMod() {
        return flatArmorPenetrationMod;
    }

    public void setFlatArmorPenetrationMod(double flatArmorPenetrationMod) {
        this.flatArmorPenetrationMod = flatArmorPenetrationMod;
    }

    public double getFlatArmorPenetrationModPerLevel() {
        return flatArmorPenetrationModPerLevel;
    }

    public void setFlatArmorPenetrationModPerLevel(double flatArmorPenetrationModPerLevel) {
        this.flatArmorPenetrationModPerLevel = flatArmorPenetrationModPerLevel;
    }

    public double getFlatCritChanceModPerLevel() {
        return flatCritChanceModPerLevel;
    }

    public void setFlatCritChanceModPerLevel(double flatCritChanceModPerLevel) {
        this.flatCritChanceModPerLevel = flatCritChanceModPerLevel;
    }

    public double getFlatCritDamageModPerLevel() {
        return flatCritDamageModPerLevel;
    }

    public void setFlatCritDamageModPerLevel(double flatCritDamageModPerLevel) {
        this.flatCritDamageModPerLevel = flatCritDamageModPerLevel;
    }

    public double getFlatDodgeMod() {
        return flatDodgeMod;
    }

    public void setFlatDodgeMod(double flatDodgeMod) {
        this.flatDodgeMod = flatDodgeMod;
    }

    public double getFlatDodgeModPerLevel() {
        return flatDodgeModPerLevel;
    }

    public void setFlatDodgeModPerLevel(double flatDodgeModPerLevel) {
        this.flatDodgeModPerLevel = flatDodgeModPerLevel;
    }

    public double getFlatEnergyModPerLevel() {
        return flatEnergyModPerLevel;
    }

    public void setFlatEnergyModPerLevel(double flatEnergyModPerLevel) {
        this.flatEnergyModPerLevel = flatEnergyModPerLevel;
    }

    public double getFlatEnergyRegenModPerLevel() {
        return flatEnergyRegenModPerLevel;
    }

    public void setFlatEnergyRegenModPerLevel(double flatEnergyRegenModPerLevel) {
        this.flatEnergyRegenModPerLevel = flatEnergyRegenModPerLevel;
    }

    public double getFlatGoldPer10Mod() {
        return flatGoldPer10Mod;
    }

    public void setFlatGoldPer10Mod(double flatGoldPer10Mod) {
        this.flatGoldPer10Mod = flatGoldPer10Mod;
    }

    public double getFlatHPModPerLevel() {
        return flatHPModPerLevel;
    }

    public void setFlatHPModPerLevel(double flatHPModPerLevel) {
        this.flatHPModPerLevel = flatHPModPerLevel;
    }

    public double getFlatHPRegenModPerLevel() {
        return flatHPRegenModPerLevel;
    }

    public void setFlatHPRegenModPerLevel(double flatHPRegenModPerLevel) {
        this.flatHPRegenModPerLevel = flatHPRegenModPerLevel;
    }

    public double getFlatMPModPerLevel() {
        return flatMPModPerLevel;
    }

    public void setFlatMPModPerLevel(double flatMPModPerLevel) {
        this.flatMPModPerLevel = flatMPModPerLevel;
    }

    public double getFlatMPRegenModPerLevel() {
        return flatMPRegenModPerLevel;
    }

    public void setFlatMPRegenModPerLevel(double flatMPRegenModPerLevel) {
        this.flatMPRegenModPerLevel = flatMPRegenModPerLevel;
    }

    public double getFlatMagicDamageModPerLevel() {
        return flatMagicDamageModPerLevel;
    }

    public void setFlatMagicDamageModPerLevel(double flatMagicDamageModPerLevel) {
        this.flatMagicDamageModPerLevel = flatMagicDamageModPerLevel;
    }

    public double getFlatMagicPenetrationMod() {
        return flatMagicPenetrationMod;
    }

    public void setFlatMagicPenetrationMod(double flatMagicPenetrationMod) {
        this.flatMagicPenetrationMod = flatMagicPenetrationMod;
    }

    public double getFlatMagicPenetrationModPerLevel() {
        return flatMagicPenetrationModPerLevel;
    }

    public void setFlatMagicPenetrationModPerLevel(double flatMagicPenetrationModPerLevel) {
        this.flatMagicPenetrationModPerLevel = flatMagicPenetrationModPerLevel;
    }

    public double getFlatMovementSpeedModPerLevel() {
        return flatMovementSpeedModPerLevel;
    }

    public void setFlatMovementSpeedModPerLevel(double flatMovementSpeedModPerLevel) {
        this.flatMovementSpeedModPerLevel = flatMovementSpeedModPerLevel;
    }

    public double getFlatPhysicalDamageModPerLevel() {
        return flatPhysicalDamageModPerLevel;
    }

    public void setFlatPhysicalDamageModPerLevel(double flatPhysicalDamageModPerLevel) {
        this.flatPhysicalDamageModPerLevel = flatPhysicalDamageModPerLevel;
    }

    public double getFlatSpellBlockModPerLevel() {
        return flatSpellBlockModPerLevel;
    }

    public void setFlatSpellBlockModPerLevel(double flatSpellBlockModPerLevel) {
        this.flatSpellBlockModPerLevel = flatSpellBlockModPerLevel;
    }

    public double getFlatTimeDeadMod() {
        return flatTimeDeadMod;
    }

    public void setFlatTimeDeadMod(double flatTimeDeadMod) {
        this.flatTimeDeadMod = flatTimeDeadMod;
    }

    public double getFlatTimeDeadModPerLevel() {
        return flatTimeDeadModPerLevel;
    }

    public void setFlatTimeDeadModPerLevel(double flatTimeDeadModPerLevel) {
        this.flatTimeDeadModPerLevel = flatTimeDeadModPerLevel;
    }

    public double getPercentArmorPenetrationMod() {
        return percentArmorPenetrationMod;
    }

    public void setPercentArmorPenetrationMod(double percentArmorPenetrationMod) {
        this.percentArmorPenetrationMod = percentArmorPenetrationMod;
    }

    public double getPercentArmorPenetrationModPerLevel() {
        return percentArmorPenetrationModPerLevel;
    }

    public void setPercentArmorPenetrationModPerLevel(double percentArmorPenetrationModPerLevel) {
        this.percentArmorPenetrationModPerLevel = percentArmorPenetrationModPerLevel;
    }

    public double getPercentAttackSpeedModPerLevel() {
        return percentAttackSpeedModPerLevel;
    }

    public void setPercentAttackSpeedModPerLevel(double percentAttackSpeedModPerLevel) {
        this.percentAttackSpeedModPerLevel = percentAttackSpeedModPerLevel;
    }

    public double getPercentCooldownMod() {
        return percentCooldownMod;
    }

    public void setPercentCooldownMod(double percentCooldownMod) {
        this.percentCooldownMod = percentCooldownMod;
    }

    public double getPercentCooldownModPerLevel() {
        return percentCooldownModPerLevel;
    }

    public void setPercentCooldownModPerLevel(double percentCooldownModPerLevel) {
        this.percentCooldownModPerLevel = percentCooldownModPerLevel;
    }

    public double getPercentMagicPenetrationMod() {
        return percentMagicPenetrationMod;
    }

    public void setPercentMagicPenetrationMod(double percentMagicPenetrationMod) {
        this.percentMagicPenetrationMod = percentMagicPenetrationMod;
    }

    public double getPercentMagicPenetrationModPerLevel() {
        return percentMagicPenetrationModPerLevel;
    }

    public void setPercentMagicPenetrationModPerLevel(double percentMagicPenetrationModPerLevel) {
        this.percentMagicPenetrationModPerLevel = percentMagicPenetrationModPerLevel;
    }

    public double getPercentMovementSpeedModPerLevel() {
        return percentMovementSpeedModPerLevel;
    }

    public void setPercentMovementSpeedModPerLevel(double percentMovementSpeedModPerLevel) {
        this.percentMovementSpeedModPerLevel = percentMovementSpeedModPerLevel;
    }

    public double getPercentTimeDeadMod() {
        return percentTimeDeadMod;
    }

    public void setPercentTimeDeadMod(double percentTimeDeadMod) {
        this.percentTimeDeadMod = percentTimeDeadMod;
    }

    public double getPercentTimeDeadModPerLevel() {
        return percentTimeDeadModPerLevel;
    }

    public void setPercentTimeDeadModPerLevel(double percentTimeDeadModPerLevel) {
        this.percentTimeDeadModPerLevel = percentTimeDeadModPerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicDataStatsDto that = (BasicDataStatsDto) o;
        return Double.compare(that.flatArmorMod, flatArmorMod) == 0 &&
                Double.compare(that.flatAttackSpeedMod, flatAttackSpeedMod) == 0 &&
                Double.compare(that.flatBlockMod, flatBlockMod) == 0 &&
                Double.compare(that.flatCritChanceMod, flatCritChanceMod) == 0 &&
                Double.compare(that.flatCritDamageMod, flatCritDamageMod) == 0 &&
                Double.compare(that.flatEXPBonus, flatEXPBonus) == 0 &&
                Double.compare(that.flatEnergyPoolMod, flatEnergyPoolMod) == 0 &&
                Double.compare(that.flatEnergyRegenMod, flatEnergyRegenMod) == 0 &&
                Double.compare(that.flatHPPoolMod, flatHPPoolMod) == 0 &&
                Double.compare(that.flatHPRegenMod, flatHPRegenMod) == 0 &&
                Double.compare(that.flatMPPoolMod, flatMPPoolMod) == 0 &&
                Double.compare(that.flatMPRegenMod, flatMPRegenMod) == 0 &&
                Double.compare(that.flatMagicDamageMod, flatMagicDamageMod) == 0 &&
                Double.compare(that.flatMovementSpeedMod, flatMovementSpeedMod) == 0 &&
                Double.compare(that.flatPhysicalDamageMod, flatPhysicalDamageMod) == 0 &&
                Double.compare(that.flatSpellBlockMod, flatSpellBlockMod) == 0 &&
                Double.compare(that.percentArmorMod, percentArmorMod) == 0 &&
                Double.compare(that.percentAttackSpeedMod, percentAttackSpeedMod) == 0 &&
                Double.compare(that.percentBlockMod, percentBlockMod) == 0 &&
                Double.compare(that.percentCritChanceMod, percentCritChanceMod) == 0 &&
                Double.compare(that.percentCritDamageMod, percentCritDamageMod) == 0 &&
                Double.compare(that.percentDodgeMod, percentDodgeMod) == 0 &&
                Double.compare(that.percentEXPBonus, percentEXPBonus) == 0 &&
                Double.compare(that.percentHPPoolMod, percentHPPoolMod) == 0 &&
                Double.compare(that.percentHPRegenMod, percentHPRegenMod) == 0 &&
                Double.compare(that.percentLifeStealMod, percentLifeStealMod) == 0 &&
                Double.compare(that.percentMPPoolMod, percentMPPoolMod) == 0 &&
                Double.compare(that.percentMPRegenMod, percentMPRegenMod) == 0 &&
                Double.compare(that.percentMagicDamageMod, percentMagicDamageMod) == 0 &&
                Double.compare(that.percentMovementSpeedMod, percentMovementSpeedMod) == 0 &&
                Double.compare(that.percentPhysicalDamageMod, percentPhysicalDamageMod) == 0 &&
                Double.compare(that.percentSpellBlockMod, percentSpellBlockMod) == 0 &&
                Double.compare(that.percentSpellVampMod, percentSpellVampMod) == 0 &&
                Double.compare(that.flatArmorModPerLevel, flatArmorModPerLevel) == 0 &&
                Double.compare(that.flatArmorPenetrationMod, flatArmorPenetrationMod) == 0 &&
                Double.compare(that.flatArmorPenetrationModPerLevel, flatArmorPenetrationModPerLevel) == 0 &&
                Double.compare(that.flatCritChanceModPerLevel, flatCritChanceModPerLevel) == 0 &&
                Double.compare(that.flatCritDamageModPerLevel, flatCritDamageModPerLevel) == 0 &&
                Double.compare(that.flatDodgeMod, flatDodgeMod) == 0 &&
                Double.compare(that.flatDodgeModPerLevel, flatDodgeModPerLevel) == 0 &&
                Double.compare(that.flatEnergyModPerLevel, flatEnergyModPerLevel) == 0 &&
                Double.compare(that.flatEnergyRegenModPerLevel, flatEnergyRegenModPerLevel) == 0 &&
                Double.compare(that.flatGoldPer10Mod, flatGoldPer10Mod) == 0 &&
                Double.compare(that.flatHPModPerLevel, flatHPModPerLevel) == 0 &&
                Double.compare(that.flatHPRegenModPerLevel, flatHPRegenModPerLevel) == 0 &&
                Double.compare(that.flatMPModPerLevel, flatMPModPerLevel) == 0 &&
                Double.compare(that.flatMPRegenModPerLevel, flatMPRegenModPerLevel) == 0 &&
                Double.compare(that.flatMagicDamageModPerLevel, flatMagicDamageModPerLevel) == 0 &&
                Double.compare(that.flatMagicPenetrationMod, flatMagicPenetrationMod) == 0 &&
                Double.compare(that.flatMagicPenetrationModPerLevel, flatMagicPenetrationModPerLevel) == 0 &&
                Double.compare(that.flatMovementSpeedModPerLevel, flatMovementSpeedModPerLevel) == 0 &&
                Double.compare(that.flatPhysicalDamageModPerLevel, flatPhysicalDamageModPerLevel) == 0 &&
                Double.compare(that.flatSpellBlockModPerLevel, flatSpellBlockModPerLevel) == 0 &&
                Double.compare(that.flatTimeDeadMod, flatTimeDeadMod) == 0 &&
                Double.compare(that.flatTimeDeadModPerLevel, flatTimeDeadModPerLevel) == 0 &&
                Double.compare(that.percentArmorPenetrationMod, percentArmorPenetrationMod) == 0 &&
                Double.compare(that.percentArmorPenetrationModPerLevel, percentArmorPenetrationModPerLevel) == 0 &&
                Double.compare(that.percentAttackSpeedModPerLevel, percentAttackSpeedModPerLevel) == 0 &&
                Double.compare(that.percentCooldownMod, percentCooldownMod) == 0 &&
                Double.compare(that.percentCooldownModPerLevel, percentCooldownModPerLevel) == 0 &&
                Double.compare(that.percentMagicPenetrationMod, percentMagicPenetrationMod) == 0 &&
                Double.compare(that.percentMagicPenetrationModPerLevel, percentMagicPenetrationModPerLevel) == 0 &&
                Double.compare(that.percentMovementSpeedModPerLevel, percentMovementSpeedModPerLevel) == 0 &&
                Double.compare(that.percentTimeDeadMod, percentTimeDeadMod) == 0 &&
                Double.compare(that.percentTimeDeadModPerLevel, percentTimeDeadModPerLevel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatArmorMod, flatAttackSpeedMod, flatBlockMod, flatCritChanceMod, flatCritDamageMod, flatEXPBonus, flatEnergyPoolMod, flatEnergyRegenMod, flatHPPoolMod, flatHPRegenMod, flatMPPoolMod, flatMPRegenMod, flatMagicDamageMod, flatMovementSpeedMod, flatPhysicalDamageMod, flatSpellBlockMod, percentArmorMod, percentAttackSpeedMod, percentBlockMod, percentCritChanceMod, percentCritDamageMod, percentDodgeMod, percentEXPBonus, percentHPPoolMod, percentHPRegenMod, percentLifeStealMod, percentMPPoolMod, percentMPRegenMod, percentMagicDamageMod, percentMovementSpeedMod, percentPhysicalDamageMod, percentSpellBlockMod, percentSpellVampMod, flatArmorModPerLevel, flatArmorPenetrationMod, flatArmorPenetrationModPerLevel, flatCritChanceModPerLevel, flatCritDamageModPerLevel, flatDodgeMod, flatDodgeModPerLevel, flatEnergyModPerLevel, flatEnergyRegenModPerLevel, flatGoldPer10Mod, flatHPModPerLevel, flatHPRegenModPerLevel, flatMPModPerLevel, flatMPRegenModPerLevel, flatMagicDamageModPerLevel, flatMagicPenetrationMod, flatMagicPenetrationModPerLevel, flatMovementSpeedModPerLevel, flatPhysicalDamageModPerLevel, flatSpellBlockModPerLevel, flatTimeDeadMod, flatTimeDeadModPerLevel, percentArmorPenetrationMod, percentArmorPenetrationModPerLevel, percentAttackSpeedModPerLevel, percentCooldownMod, percentCooldownModPerLevel, percentMagicPenetrationMod, percentMagicPenetrationModPerLevel, percentMovementSpeedModPerLevel, percentTimeDeadMod, percentTimeDeadModPerLevel);
    }

    @Override
    public String toString() {
        return "BasicDataStatsDto{" +
                "flatArmorMod=" + flatArmorMod +
                ", flatAttackSpeedMod=" + flatAttackSpeedMod +
                ", flatBlockMod=" + flatBlockMod +
                ", flatCritChanceMod=" + flatCritChanceMod +
                ", flatCritDamageMod=" + flatCritDamageMod +
                ", flatEXPBonus=" + flatEXPBonus +
                ", flatEnergyPoolMod=" + flatEnergyPoolMod +
                ", flatEnergyRegenMod=" + flatEnergyRegenMod +
                ", flatHPPoolMod=" + flatHPPoolMod +
                ", flatHPRegenMod=" + flatHPRegenMod +
                ", flatMPPoolMod=" + flatMPPoolMod +
                ", flatMPRegenMod=" + flatMPRegenMod +
                ", flatMagicDamageMod=" + flatMagicDamageMod +
                ", flatMovementSpeedMod=" + flatMovementSpeedMod +
                ", flatPhysicalDamageMod=" + flatPhysicalDamageMod +
                ", flatSpellBlockMod=" + flatSpellBlockMod +
                ", percentArmorMod=" + percentArmorMod +
                ", percentAttackSpeedMod=" + percentAttackSpeedMod +
                ", percentBlockMod=" + percentBlockMod +
                ", percentCritChanceMod=" + percentCritChanceMod +
                ", percentCritDamageMod=" + percentCritDamageMod +
                ", percentDodgeMod=" + percentDodgeMod +
                ", percentEXPBonus=" + percentEXPBonus +
                ", percentHPPoolMod=" + percentHPPoolMod +
                ", percentHPRegenMod=" + percentHPRegenMod +
                ", percentLifeStealMod=" + percentLifeStealMod +
                ", percentMPPoolMod=" + percentMPPoolMod +
                ", percentMPRegenMod=" + percentMPRegenMod +
                ", percentMagicDamageMod=" + percentMagicDamageMod +
                ", percentMovementSpeedMod=" + percentMovementSpeedMod +
                ", percentPhysicalDamageMod=" + percentPhysicalDamageMod +
                ", percentSpellBlockMod=" + percentSpellBlockMod +
                ", percentSpellVampMod=" + percentSpellVampMod +
                ", flatArmorModPerLevel=" + flatArmorModPerLevel +
                ", flatArmorPenetrationMod=" + flatArmorPenetrationMod +
                ", flatArmorPenetrationModPerLevel=" + flatArmorPenetrationModPerLevel +
                ", flatCritChanceModPerLevel=" + flatCritChanceModPerLevel +
                ", flatCritDamageModPerLevel=" + flatCritDamageModPerLevel +
                ", flatDodgeMod=" + flatDodgeMod +
                ", flatDodgeModPerLevel=" + flatDodgeModPerLevel +
                ", flatEnergyModPerLevel=" + flatEnergyModPerLevel +
                ", flatEnergyRegenModPerLevel=" + flatEnergyRegenModPerLevel +
                ", flatGoldPer10Mod=" + flatGoldPer10Mod +
                ", flatHPModPerLevel=" + flatHPModPerLevel +
                ", flatHPRegenModPerLevel=" + flatHPRegenModPerLevel +
                ", flatMPModPerLevel=" + flatMPModPerLevel +
                ", flatMPRegenModPerLevel=" + flatMPRegenModPerLevel +
                ", flatMagicDamageModPerLevel=" + flatMagicDamageModPerLevel +
                ", flatMagicPenetrationMod=" + flatMagicPenetrationMod +
                ", flatMagicPenetrationModPerLevel=" + flatMagicPenetrationModPerLevel +
                ", flatMovementSpeedModPerLevel=" + flatMovementSpeedModPerLevel +
                ", flatPhysicalDamageModPerLevel=" + flatPhysicalDamageModPerLevel +
                ", flatSpellBlockModPerLevel=" + flatSpellBlockModPerLevel +
                ", flatTimeDeadMod=" + flatTimeDeadMod +
                ", flatTimeDeadModPerLevel=" + flatTimeDeadModPerLevel +
                ", percentArmorPenetrationMod=" + percentArmorPenetrationMod +
                ", percentArmorPenetrationModPerLevel=" + percentArmorPenetrationModPerLevel +
                ", percentAttackSpeedModPerLevel=" + percentAttackSpeedModPerLevel +
                ", percentCooldownMod=" + percentCooldownMod +
                ", percentCooldownModPerLevel=" + percentCooldownModPerLevel +
                ", percentMagicPenetrationMod=" + percentMagicPenetrationMod +
                ", percentMagicPenetrationModPerLevel=" + percentMagicPenetrationModPerLevel +
                ", percentMovementSpeedModPerLevel=" + percentMovementSpeedModPerLevel +
                ", percentTimeDeadMod=" + percentTimeDeadMod +
                ", percentTimeDeadModPerLevel=" + percentTimeDeadModPerLevel +
                '}';
    }
}
