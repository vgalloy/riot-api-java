package vgalloy.riot.service.executor;

import org.junit.Ignore;
import org.junit.Test;
import vgalloy.riot.service.executor.impl.ExecutorImpl;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ExecutorTest {

    // TODO des vrais test. JUnit ne support pas le multithreading ... :/
    @Test
    @Ignore
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
    @Ignore
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
        System.out.println("TMP .... " + count.get());

        // THEN
        assertEquals(6, count.get());
    }

    @Test
    @Ignore
    public void testThread() throws Exception {
        AtomicInteger count = new AtomicInteger();
        Thread t = new Thread(createPlusOneThread(count));
        System.out.println("CREATION");
        t.start();
        System.out.println("START");
        t.join();
        System.out.println("JOIN");
    }

    public Runnable createPlusOneThread(AtomicInteger count) {
        return () -> {
            System.out.println("B " + count.get());
            count.incrementAndGet();
            System.out.println("A .... " + count.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}