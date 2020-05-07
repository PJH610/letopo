package com.letopo.app.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-28 17:17
 */
public class GlobalExecutor {

    private static final ExecutorService executor = Executors.newFixedThreadPool(1);

    public static void execute(Runnable runnable) {
        executor.execute(runnable);
    }

}
