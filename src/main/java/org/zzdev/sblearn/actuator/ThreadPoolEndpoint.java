package org.zzdev.sblearn.actuator;



import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class ThreadPoolEndpoint  {
    @Resource(name = "consumerQueueThreadPool")
    private ExecutorService consumerQueueThreadPool;

    private final Map<String, Object> pool = new HashMap<>();

    ThreadPoolEndpoint() {
        this.pool.put("12","12");
    }

    public Map<String, Object> getAll() {
        return pool;
    }

}






