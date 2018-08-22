package org.zzdev.sblearn.threadPractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;

@Component
public class ThreadPoolTest implements CommandLineRunner {
    @Resource(name = "consumerQueueThreadPool")
    private ExecutorService consumerQueueThreadPool;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            consumerQueueThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }
}
