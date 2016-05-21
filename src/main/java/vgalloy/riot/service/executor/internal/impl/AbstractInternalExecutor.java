package vgalloy.riot.service.executor.internal.impl;

import vgalloy.riot.service.executor.internal.InternalExecutor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public abstract class AbstractInternalExecutor implements InternalExecutor {

    public static final InternalExecutor RUNNING = RunningInternalExecutorImpl.INSTANCE;
    public static final InternalExecutor STOPPED = StoppedInternalExecutorImpl.INSTANCE;

    protected static List<Thread> threadList = new ArrayList<>();
}
