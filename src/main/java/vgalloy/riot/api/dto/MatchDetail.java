package vgalloy.riot.api.dto;

import vgalloy.riot.api.dto.constant.GameMode;
import vgalloy.riot.api.dto.constant.GameType;
import vgalloy.riot.api.dto.constant.QueueType;
import vgalloy.riot.api.dto.constant.Season;

import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public class MatchDetail {

    private int mapId;
    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private GameMode matchMode;
    private GameType matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<ParticipantDto> participants;
    private String platformId;
    private QueueType queueType;
    private String region;
    private Season season;
    private List<Team> teams;
    private Timeline timeline;
}
