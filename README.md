# riot-api-java

## Example

### First one line query

```java
package vgalloy.riot.api;

import vgalloy.riot.api.rest.constant.RankedQueueType;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.rest.request.league.dto.LeagueDto;
import vgalloy.riot.api.service.RiotApi;
import vgalloy.riot.api.service.RiotApiKey;

public class Main {

    public static void main(String[] args) {
        LeagueDto leagueDto = new RiotApi()
                .defaultRiotApiKey(new RiotApiKey("MY-API-KEY"))
                .defaultRegion(Region.EUW)
                .getChallenger(RankedQueueType.RANKED_SOLO_5x5)
                .sorted(true)
                .execute();

        System.out.println("The best euw player is " + leagueDto.getEntries().get(leagueDto.getEntries().size() - 1).getPlayerOrTeamName());
    }
}
```

## Create RiotApi

### Simple Riot api

You can create a simple riotApi like this :
```java
    RiotApi riotApi = new RiotApi();
```
But maybe you should define some rate limit :
```java
    RiotApi riotApi = new RiotApi(new RateLimit(10, 10_000), new RateLimit(500, 10 * 60 * 1000));
```

## Request
wip


## WIP
You want to improve this code ? Feel free to open request

