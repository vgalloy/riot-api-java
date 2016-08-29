# riot-api-java

## Example

### First one line query

```java
package vgalloy.riot.api;

import vgalloy.riot.api.api.constant.RankedQueueType;
import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.api.dto.league.LeagueDto;
import vgalloy.riot.api.api.factory.RiotApiFactory;
import vgalloy.riot.api.api.model.RiotApiKey;

public class Main {

    public static void main(String[] args) {
        LeagueDto leagueDto = RiotApiFactory.newRiotApi()
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
You can create a simple RiotApi like this :
```java
RiotApi riotApi = RiotApiFactory.newRiotApi();
```
But maybe you should define some rate limit :
```java
RiotApi riotApi = RiotApiFactory.newRiotApi().addGlobalRateLimit(new RateLimit(9, 10_000), new RateLimit(400, 10 * 60 * 1_000))
```

### Create RiotApiKey
The easy way to create a riot api is :
```java
RiotApiKey riotApiKey = new RiotApiKey("MY-API-KEY");
```
But the prefer use the properties constructor :
```java
Properties properties = new Properties();
InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("riot.properties");
properties.load(inputStream);
RiotApiKey riotApiKey = new RiotApiKey(properties);
```

### Global parameter
If you don't want to repeat the api key and the region for all request you set these parameters in the riotApi.
```java
RiotApi riotApi = new RiotApi()
                .defaultRiotApiKey(new RiotApiKey("MY-API-KEY"))
                .defaultRegion(Region.euw)
```

## Synchronous Request
```java
riotApi.getSummonerByNames("Ivaranne").execute();
```
Do not forget to execute the query ! !

## Other
You want to improve this code ? Feel free to open request

