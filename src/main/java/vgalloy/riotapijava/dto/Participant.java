package vgalloy.riotapijava.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class Participant {

    private boolean bot;
    private long championId;
    private long profileIconId;
    private long spell1Id;
    private long spell2Id;
    private String summonerName;
    private long teamId;

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "bot=" + bot +
                ", championId=" + championId +
                ", profileIconId=" + profileIconId +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", summonerName='" + summonerName + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
