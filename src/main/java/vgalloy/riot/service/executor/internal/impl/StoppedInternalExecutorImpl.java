package vgalloy.riot.service.executor.internal.impl;

import vgalloy.riot.service.executor.internal.InternalExecutor;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class StoppedInternalExecutorImpl extends AbstractInternalExecutor {

    public static final InternalExecutor INSTANCE = new StoppedInternalExecutorImpl();

    /**
     * Private constructor to prevent instantiation.
     */
    private StoppedInternalExecutorImpl() {

    }

    @Override
    public InternalExecutor addTask(Runnable task) {
        threadList.add(new Thread(task));
        return STOPPED;
    }

    @Override
    public InternalExecutor start() {
        threadList.stream().forEach(Thread::start);
        return RUNNING;
    }

    @Override
    public InternalExecutor finish() {
        return STOPPED;
    }
}
