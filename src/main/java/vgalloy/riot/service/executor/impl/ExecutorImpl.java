package vgalloy.riot.service.executor.impl;

import vgalloy.riot.service.executor.Executor;
import vgalloy.riot.service.executor.internal.InternalExecutor;
import vgalloy.riot.service.executor.internal.impl.AbstractInternalExecutor;

/**
 * @author Vincent Galloy
 * Created by Vincent Galloy on 21/05/16.
 */
public class ExecutorImpl implements Executor {

    private InternalExecutor internalExecutor = AbstractInternalExecutor.STOPPED;

    @Override
    public synchronized void addTask(Runnable task) {
        internalExecutor = internalExecutor.addTask(task);
    }

    @Override
    public synchronized void start() {
        internalExecutor = internalExecutor.start();
    }

    @Override
    public synchronized void finish() {
        internalExecutor = internalExecutor.finish();
    }
}
