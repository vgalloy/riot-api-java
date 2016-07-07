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
                .defaultRegion(Region.euw)
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
RiotApi riotApi = new RiotApi();
```
But maybe you should define some rate limit :
```java
RiotApi riotApi = new RiotApi().addGlobalRateLimit(new RateLimit(9, 10_000), new RateLimit(400, 10 * 60 * 1_000))
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
Do not forget to execute the query

## Asynchronous Request
The following request will print the same result as the first query;
```java
Query query = riotApi
                .getChallenger(RankedQueueType.RANKED_SOLO_5x5)
                .sorted(true)
                .onSuccess(new Callback<LeagueDto>() {
                    @Override
                    public void process(LeagueDto leagueDto) {
                        System.out.println("The best euw player is " + leagueDto.getEntries().get(leagueDto.getEntries().size() - 1).getPlayerOrTeamName());
                    }
                });

Executor executor = new ExecutorImpl();
executor.addQuery(query);
executor.start();
executor.finish();
```
You can also add different behaviour with onInternalServerErrorException()

## Other
You want to improve this code ? Feel free to open request

