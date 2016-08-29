package vgalloy.riot.api.internal.service.executor;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;
import vgalloy.riot.api.internal.service.executor.impl.ExecutorImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ExecutorTest {

    @Test
    public void testSimple() {
        // GIVEN
        AtomicInteger count = new AtomicInteger();
        Executor executor = new ExecutorImpl();
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));

        // WHEN
        executor.start();
        executor.finish();

        // THEN
        assertEquals(4, count.get());
    }

    @Test
    public void testNotRunning() {
        // GIVEN
        AtomicInteger count = new AtomicInteger();
        Executor executor = new ExecutorImpl();
        executor.addTask(createPlusOneThread(count));

        // WHEN
        executor.finish();

        // THEN
        assertEquals(0, count.get());
    }

    @Test
    public void testAddDuringRunning() throws InterruptedException {
        // GIVEN
        AtomicInteger count = new AtomicInteger();
        Executor executor = new ExecutorImpl();
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));

        // WHEN
        executor.start();
        executor.addTask(createPlusOneThread(count));
        executor.addTask(createPlusOneThread(count));
        executor.finish();

        // THEN
        assertEquals(6, count.get());
    }

    public Runnable createPlusOneThread(AtomicInteger count) {
        return () -> {
            count.incrementAndGet();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}