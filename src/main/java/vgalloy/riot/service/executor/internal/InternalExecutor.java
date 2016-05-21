package vgalloy.riot.service.executor.internal;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public interface InternalExecutor {

    /**
     * Add the query in the executor list.
     * If the current executor is running the query is immediately started
     *
     * @param task the task to execute
     * @return the new InternalExecutor state
     */
    InternalExecutor addTask(Runnable task);

    /**
     * Start to execute all the queries.
     *
     * @return the new InternalExecutor state
     */
    InternalExecutor start();

    /**
     * Wait all the request response.
     *
     * @return the new InternalExecutor state
     */
    InternalExecutor finish();
}
