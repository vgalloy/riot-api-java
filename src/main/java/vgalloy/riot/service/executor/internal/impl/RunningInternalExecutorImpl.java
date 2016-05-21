package vgalloy.riot.service.executor.internal.impl;

import vgalloy.riot.service.executor.internal.InternalExecutor;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class RunningInternalExecutorImpl extends AbstractInternalExecutor {

    protected static final InternalExecutor INSTANCE = new RunningInternalExecutorImpl();

    /**
     * Private constructor to prevent instantiation.
     */
    private RunningInternalExecutorImpl() {

    }

    @Override
    public InternalExecutor addTask(Runnable task) {
        new Thread(task).start();
        return RUNNING;
    }

    @Override
    public InternalExecutor start() {
        return RUNNING;
    }

    @Override
    public InternalExecutor finish() {
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace(); // TODO Virer cette merde et faire un logging digne de ce nom
            }
        }
        return STOPPED;
    }
}
