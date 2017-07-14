package com.vgalloy.riot.api.internal.service.executor;

import com.vgalloy.riot.library.api.query.Query;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public interface Executor {

    /**
     * Add the task in the executor list.
     * If the current executor is running the task is immediately started
     *
     * @param task the task to execute
     */
    void addTask(Runnable task);

    /**
     * Add the query in the executor list.
     * If the current executor is running the query is immediately started
     *
     * @param query the query to execute
     */
    void addQuery(Query query);

    /**
     * Start to execute all the queries. You can still add tasks.
     */
    void start();

    /**
     * Complete all task. You can not add task anymore.
     */
    void finish();
}
