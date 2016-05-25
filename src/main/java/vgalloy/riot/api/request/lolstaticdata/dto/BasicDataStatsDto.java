package vgalloy.riot.api.request.lolstaticdata.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
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
    private double rFlatArmorModPerLevel;
    private double rFlatArmorPenetrationMod;
    private double rFlatArmorPenetrationModPerLevel;
    private double rFlatCritChanceModPerLevel;
    private double rFlatCritDamageModPerLevel;
    private double rFlatDodgeMod;
    private double rFlatDodgeModPerLevel;
    private double rFlatEnergyModPerLevel;
    private double rFlatEnergyRegenModPerLevel;
    private double rFlatGoldPer10Mod;
    private double rFlatHPModPerLevel;
    private double rFlatHPRegenModPerLevel;
    private double rFlatMPModPerLevel;
    private double rFlatMPRegenModPerLevel;
    private double rFlatMagicDamageModPerLevel;
    private double rFlatMagicPenetrationMod;
    private double rFlatMagicPenetrationModPerLevel;
    private double rFlatMovementSpeedModPerLevel;
    private double rFlatPhysicalDamageModPerLevel;
    private double rFlatSpellBlockModPerLevel;
    private double rFlatTimeDeadMod;
    private double rFlatTimeDeadModPerLevel;
    private double rPercentArmorPenetrationMod;
    private double rPercentArmorPenetrationModPerLevel;
    private double rPercentAttackSpeedModPerLevel;
    private double rPercentCooldownMod;
    private double rPercentCooldownModPerLevel;
    private double rPercentMagicPenetrationMod;
    private double rPercentMagicPenetrationModPerLevel;
    private double rPercentMovementSpeedModPerLevel;
    private double rPercentTimeDeadMod;
    private double rPercentTimeDeadModPerLevel;

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

    public double getrFlatArmorModPerLevel() {
        return rFlatArmorModPerLevel;
    }

    public void setrFlatArmorModPerLevel(double rFlatArmorModPerLevel) {
        this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
    }

    public double getrFlatArmorPenetrationMod() {
        return rFlatArmorPenetrationMod;
    }

    public void setrFlatArmorPenetrationMod(double rFlatArmorPenetrationMod) {
        this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
    }

    public double getrFlatArmorPenetrationModPerLevel() {
        return rFlatArmorPenetrationModPerLevel;
    }

    public void setrFlatArmorPenetrationModPerLevel(double rFlatArmorPenetrationModPerLevel) {
        this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
    }

    public double getrFlatCritChanceModPerLevel() {
        return rFlatCritChanceModPerLevel;
    }

    public void setrFlatCritChanceModPerLevel(double rFlatCritChanceModPerLevel) {
        this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
    }

    public double getrFlatCritDamageModPerLevel() {
        return rFlatCritDamageModPerLevel;
    }

    public void setrFlatCritDamageModPerLevel(double rFlatCritDamageModPerLevel) {
        this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
    }

    public double getrFlatDodgeMod() {
        return rFlatDodgeMod;
    }

    public void setrFlatDodgeMod(double rFlatDodgeMod) {
        this.rFlatDodgeMod = rFlatDodgeMod;
    }

    public double getrFlatDodgeModPerLevel() {
        return rFlatDodgeModPerLevel;
    }

    public void setrFlatDodgeModPerLevel(double rFlatDodgeModPerLevel) {
        this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
    }

    public double getrFlatEnergyModPerLevel() {
        return rFlatEnergyModPerLevel;
    }

    public void setrFlatEnergyModPerLevel(double rFlatEnergyModPerLevel) {
        this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
    }

    public double getrFlatEnergyRegenModPerLevel() {
        return rFlatEnergyRegenModPerLevel;
    }

    public void setrFlatEnergyRegenModPerLevel(double rFlatEnergyRegenModPerLevel) {
        this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
    }

    public double getrFlatGoldPer10Mod() {
        return rFlatGoldPer10Mod;
    }

    public void setrFlatGoldPer10Mod(double rFlatGoldPer10Mod) {
        this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
    }

    public double getrFlatHPModPerLevel() {
        return rFlatHPModPerLevel;
    }

    public void setrFlatHPModPerLevel(double rFlatHPModPerLevel) {
        this.rFlatHPModPerLevel = rFlatHPModPerLevel;
    }

    public double getrFlatHPRegenModPerLevel() {
        return rFlatHPRegenModPerLevel;
    }

    public void setrFlatHPRegenModPerLevel(double rFlatHPRegenModPerLevel) {
        this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
    }

    public double getrFlatMPModPerLevel() {
        return rFlatMPModPerLevel;
    }

    public void setrFlatMPModPerLevel(double rFlatMPModPerLevel) {
        this.rFlatMPModPerLevel = rFlatMPModPerLevel;
    }

    public double getrFlatMPRegenModPerLevel() {
        return rFlatMPRegenModPerLevel;
    }

    public void setrFlatMPRegenModPerLevel(double rFlatMPRegenModPerLevel) {
        this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
    }

    public double getrFlatMagicDamageModPerLevel() {
        return rFlatMagicDamageModPerLevel;
    }

    public void setrFlatMagicDamageModPerLevel(double rFlatMagicDamageModPerLevel) {
        this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
    }

    public double getrFlatMagicPenetrationMod() {
        return rFlatMagicPenetrationMod;
    }

    public void setrFlatMagicPenetrationMod(double rFlatMagicPenetrationMod) {
        this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
    }

    public double getrFlatMagicPenetrationModPerLevel() {
        return rFlatMagicPenetrationModPerLevel;
    }

    public void setrFlatMagicPenetrationModPerLevel(double rFlatMagicPenetrationModPerLevel) {
        this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
    }

    public double getrFlatMovementSpeedModPerLevel() {
        return rFlatMovementSpeedModPerLevel;
    }

    public void setrFlatMovementSpeedModPerLevel(double rFlatMovementSpeedModPerLevel) {
        this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
    }

    public double getrFlatPhysicalDamageModPerLevel() {
        return rFlatPhysicalDamageModPerLevel;
    }

    public void setrFlatPhysicalDamageModPerLevel(double rFlatPhysicalDamageModPerLevel) {
        this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
    }

    public double getrFlatSpellBlockModPerLevel() {
        return rFlatSpellBlockModPerLevel;
    }

    public void setrFlatSpellBlockModPerLevel(double rFlatSpellBlockModPerLevel) {
        this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
    }

    public double getrFlatTimeDeadMod() {
        return rFlatTimeDeadMod;
    }

    public void setrFlatTimeDeadMod(double rFlatTimeDeadMod) {
        this.rFlatTimeDeadMod = rFlatTimeDeadMod;
    }

    public double getrFlatTimeDeadModPerLevel() {
        return rFlatTimeDeadModPerLevel;
    }

    public void setrFlatTimeDeadModPerLevel(double rFlatTimeDeadModPerLevel) {
        this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
    }

    public double getrPercentArmorPenetrationMod() {
        return rPercentArmorPenetrationMod;
    }

    public void setrPercentArmorPenetrationMod(double rPercentArmorPenetrationMod) {
        this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
    }

    public double getrPercentArmorPenetrationModPerLevel() {
        return rPercentArmorPenetrationModPerLevel;
    }

    public void setrPercentArmorPenetrationModPerLevel(double rPercentArmorPenetrationModPerLevel) {
        this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
    }

    public double getrPercentAttackSpeedModPerLevel() {
        return rPercentAttackSpeedModPerLevel;
    }

    public void setrPercentAttackSpeedModPerLevel(double rPercentAttackSpeedModPerLevel) {
        this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
    }

    public double getrPercentCooldownMod() {
        return rPercentCooldownMod;
    }

    public void setrPercentCooldownMod(double rPercentCooldownMod) {
        this.rPercentCooldownMod = rPercentCooldownMod;
    }

    public double getrPercentCooldownModPerLevel() {
        return rPercentCooldownModPerLevel;
    }

    public void setrPercentCooldownModPerLevel(double rPercentCooldownModPerLevel) {
        this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
    }

    public double getrPercentMagicPenetrationMod() {
        return rPercentMagicPenetrationMod;
    }

    public void setrPercentMagicPenetrationMod(double rPercentMagicPenetrationMod) {
        this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
    }

    public double getrPercentMagicPenetrationModPerLevel() {
        return rPercentMagicPenetrationModPerLevel;
    }

    public void setrPercentMagicPenetrationModPerLevel(double rPercentMagicPenetrationModPerLevel) {
        this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
    }

    public double getrPercentMovementSpeedModPerLevel() {
        return rPercentMovementSpeedModPerLevel;
    }

    public void setrPercentMovementSpeedModPerLevel(double rPercentMovementSpeedModPerLevel) {
        this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
    }

    public double getrPercentTimeDeadMod() {
        return rPercentTimeDeadMod;
    }

    public void setrPercentTimeDeadMod(double rPercentTimeDeadMod) {
        this.rPercentTimeDeadMod = rPercentTimeDeadMod;
    }

    public double getrPercentTimeDeadModPerLevel() {
        return rPercentTimeDeadModPerLevel;
    }

    public void setrPercentTimeDeadModPerLevel(double rPercentTimeDeadModPerLevel) {
        this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
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
                Double.compare(that.rFlatArmorModPerLevel, rFlatArmorModPerLevel) == 0 &&
                Double.compare(that.rFlatArmorPenetrationMod, rFlatArmorPenetrationMod) == 0 &&
                Double.compare(that.rFlatArmorPenetrationModPerLevel, rFlatArmorPenetrationModPerLevel) == 0 &&
                Double.compare(that.rFlatCritChanceModPerLevel, rFlatCritChanceModPerLevel) == 0 &&
                Double.compare(that.rFlatCritDamageModPerLevel, rFlatCritDamageModPerLevel) == 0 &&
                Double.compare(that.rFlatDodgeMod, rFlatDodgeMod) == 0 &&
                Double.compare(that.rFlatDodgeModPerLevel, rFlatDodgeModPerLevel) == 0 &&
                Double.compare(that.rFlatEnergyModPerLevel, rFlatEnergyModPerLevel) == 0 &&
                Double.compare(that.rFlatEnergyRegenModPerLevel, rFlatEnergyRegenModPerLevel) == 0 &&
                Double.compare(that.rFlatGoldPer10Mod, rFlatGoldPer10Mod) == 0 &&
                Double.compare(that.rFlatHPModPerLevel, rFlatHPModPerLevel) == 0 &&
                Double.compare(that.rFlatHPRegenModPerLevel, rFlatHPRegenModPerLevel) == 0 &&
                Double.compare(that.rFlatMPModPerLevel, rFlatMPModPerLevel) == 0 &&
                Double.compare(that.rFlatMPRegenModPerLevel, rFlatMPRegenModPerLevel) == 0 &&
                Double.compare(that.rFlatMagicDamageModPerLevel, rFlatMagicDamageModPerLevel) == 0 &&
                Double.compare(that.rFlatMagicPenetrationMod, rFlatMagicPenetrationMod) == 0 &&
                Double.compare(that.rFlatMagicPenetrationModPerLevel, rFlatMagicPenetrationModPerLevel) == 0 &&
                Double.compare(that.rFlatMovementSpeedModPerLevel, rFlatMovementSpeedModPerLevel) == 0 &&
                Double.compare(that.rFlatPhysicalDamageModPerLevel, rFlatPhysicalDamageModPerLevel) == 0 &&
                Double.compare(that.rFlatSpellBlockModPerLevel, rFlatSpellBlockModPerLevel) == 0 &&
                Double.compare(that.rFlatTimeDeadMod, rFlatTimeDeadMod) == 0 &&
                Double.compare(that.rFlatTimeDeadModPerLevel, rFlatTimeDeadModPerLevel) == 0 &&
                Double.compare(that.rPercentArmorPenetrationMod, rPercentArmorPenetrationMod) == 0 &&
                Double.compare(that.rPercentArmorPenetrationModPerLevel, rPercentArmorPenetrationModPerLevel) == 0 &&
                Double.compare(that.rPercentAttackSpeedModPerLevel, rPercentAttackSpeedModPerLevel) == 0 &&
                Double.compare(that.rPercentCooldownMod, rPercentCooldownMod) == 0 &&
                Double.compare(that.rPercentCooldownModPerLevel, rPercentCooldownModPerLevel) == 0 &&
                Double.compare(that.rPercentMagicPenetrationMod, rPercentMagicPenetrationMod) == 0 &&
                Double.compare(that.rPercentMagicPenetrationModPerLevel, rPercentMagicPenetrationModPerLevel) == 0 &&
                Double.compare(that.rPercentMovementSpeedModPerLevel, rPercentMovementSpeedModPerLevel) == 0 &&
                Double.compare(that.rPercentTimeDeadMod, rPercentTimeDeadMod) == 0 &&
                Double.compare(that.rPercentTimeDeadModPerLevel, rPercentTimeDeadModPerLevel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatArmorMod, flatAttackSpeedMod, flatBlockMod, flatCritChanceMod, flatCritDamageMod, flatEXPBonus, flatEnergyPoolMod, flatEnergyRegenMod, flatHPPoolMod, flatHPRegenMod, flatMPPoolMod, flatMPRegenMod, flatMagicDamageMod, flatMovementSpeedMod, flatPhysicalDamageMod, flatSpellBlockMod, percentArmorMod, percentAttackSpeedMod, percentBlockMod, percentCritChanceMod, percentCritDamageMod, percentDodgeMod, percentEXPBonus, percentHPPoolMod, percentHPRegenMod, percentLifeStealMod, percentMPPoolMod, percentMPRegenMod, percentMagicDamageMod, percentMovementSpeedMod, percentPhysicalDamageMod, percentSpellBlockMod, percentSpellVampMod, rFlatArmorModPerLevel, rFlatArmorPenetrationMod, rFlatArmorPenetrationModPerLevel, rFlatCritChanceModPerLevel, rFlatCritDamageModPerLevel, rFlatDodgeMod, rFlatDodgeModPerLevel, rFlatEnergyModPerLevel, rFlatEnergyRegenModPerLevel, rFlatGoldPer10Mod, rFlatHPModPerLevel, rFlatHPRegenModPerLevel, rFlatMPModPerLevel, rFlatMPRegenModPerLevel, rFlatMagicDamageModPerLevel, rFlatMagicPenetrationMod, rFlatMagicPenetrationModPerLevel, rFlatMovementSpeedModPerLevel, rFlatPhysicalDamageModPerLevel, rFlatSpellBlockModPerLevel, rFlatTimeDeadMod, rFlatTimeDeadModPerLevel, rPercentArmorPenetrationMod, rPercentArmorPenetrationModPerLevel, rPercentAttackSpeedModPerLevel, rPercentCooldownMod, rPercentCooldownModPerLevel, rPercentMagicPenetrationMod, rPercentMagicPenetrationModPerLevel, rPercentMovementSpeedModPerLevel, rPercentTimeDeadMod, rPercentTimeDeadModPerLevel);
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
                ", rFlatArmorModPerLevel=" + rFlatArmorModPerLevel +
                ", rFlatArmorPenetrationMod=" + rFlatArmorPenetrationMod +
                ", rFlatArmorPenetrationModPerLevel=" + rFlatArmorPenetrationModPerLevel +
                ", rFlatCritChanceModPerLevel=" + rFlatCritChanceModPerLevel +
                ", rFlatCritDamageModPerLevel=" + rFlatCritDamageModPerLevel +
                ", rFlatDodgeMod=" + rFlatDodgeMod +
                ", rFlatDodgeModPerLevel=" + rFlatDodgeModPerLevel +
                ", rFlatEnergyModPerLevel=" + rFlatEnergyModPerLevel +
                ", rFlatEnergyRegenModPerLevel=" + rFlatEnergyRegenModPerLevel +
                ", rFlatGoldPer10Mod=" + rFlatGoldPer10Mod +
                ", rFlatHPModPerLevel=" + rFlatHPModPerLevel +
                ", rFlatHPRegenModPerLevel=" + rFlatHPRegenModPerLevel +
                ", rFlatMPModPerLevel=" + rFlatMPModPerLevel +
                ", rFlatMPRegenModPerLevel=" + rFlatMPRegenModPerLevel +
                ", rFlatMagicDamageModPerLevel=" + rFlatMagicDamageModPerLevel +
                ", rFlatMagicPenetrationMod=" + rFlatMagicPenetrationMod +
                ", rFlatMagicPenetrationModPerLevel=" + rFlatMagicPenetrationModPerLevel +
                ", rFlatMovementSpeedModPerLevel=" + rFlatMovementSpeedModPerLevel +
                ", rFlatPhysicalDamageModPerLevel=" + rFlatPhysicalDamageModPerLevel +
                ", rFlatSpellBlockModPerLevel=" + rFlatSpellBlockModPerLevel +
                ", rFlatTimeDeadMod=" + rFlatTimeDeadMod +
                ", rFlatTimeDeadModPerLevel=" + rFlatTimeDeadModPerLevel +
                ", rPercentArmorPenetrationMod=" + rPercentArmorPenetrationMod +
                ", rPercentArmorPenetrationModPerLevel=" + rPercentArmorPenetrationModPerLevel +
                ", rPercentAttackSpeedModPerLevel=" + rPercentAttackSpeedModPerLevel +
                ", rPercentCooldownMod=" + rPercentCooldownMod +
                ", rPercentCooldownModPerLevel=" + rPercentCooldownModPerLevel +
                ", rPercentMagicPenetrationMod=" + rPercentMagicPenetrationMod +
                ", rPercentMagicPenetrationModPerLevel=" + rPercentMagicPenetrationModPerLevel +
                ", rPercentMovementSpeedModPerLevel=" + rPercentMovementSpeedModPerLevel +
                ", rPercentTimeDeadMod=" + rPercentTimeDeadMod +
                ", rPercentTimeDeadModPerLevel=" + rPercentTimeDeadModPerLevel +
                '}';
    }
}