package vgalloy.riot.service.executor.impl;

import vgalloy.riot.service.executor.Executor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ExecutorImpl implements Executor {

    private static List<Thread> threadList = new ArrayList<>();
    private boolean isRunning;

    @Override
    public synchronized void addTask(Runnable task) {
        Thread thread = new Thread(task);
        threadList.add(thread);
        if (isRunning) {
            thread.start();
        }
    }

    @Override
    public synchronized void start() {
        if (!isRunning) {
            isRunning = true;
            threadList.forEach(Thread::start);
        }
    }

    @Override
    public synchronized void finish() {
        if (isRunning) {
            threadList.forEach(e -> {
                try {
                    e.join();
                } catch (InterruptedException e1) {
                    e1.printStackTrace(); // TODO Virer cette merde et faire un logging digne de ce nom
                }
            });
            threadList = new ArrayList<>();
            isRunning = false;
        }
    }
}
