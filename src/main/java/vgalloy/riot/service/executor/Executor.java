package vgalloy.riot.service.executor;

import vgalloy.riot.service.callback.CallBack;
import vgalloy.riot.service.query.Query;

/**
 * Created by Vincent on 21/05/2016.
 */
public interface Executor {

    /**
     * Add the query in the executor. If the current executor is running the query is immediately started
     *
     * @param query    the query
     * @param callBack the callback
     * @param <Dto>    the dto return type
     */
    <Dto> void addQuery(Query<Dto> query, CallBack<Dto> callBack);

    /**
     * Start to execute all the queries.
     */
    void start();
}
