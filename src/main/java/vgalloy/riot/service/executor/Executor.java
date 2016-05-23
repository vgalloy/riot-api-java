package vgalloy.riot.service.executor;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 *         TODO Add a shutdown method ?
 *         FIXME Est-ce que cette classe est vraiment utile ?
 */
public interface Executor {

    /**
     * Add the query in the executor list.
     * If the current executor is running the query is immediately started
     *
     * @param task the task to execute
     */
    void addTask(Runnable task);

    /**
     * Start to execute all the queries. You can still add tasks.
     */
    void start();

    /**
     * Complete all task. You can not add task anymore.
     */
    void finish();
}
