package top.ytazwc.zk;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @author 花木凋零成兰
 * @title CuratorFrameworkFactoryUtil
 * @date 2025-03-14 21:29
 * @package top.ytazwc.zk
 * @description CuratorFramework 连接 Zookeeper 客户端类工厂
 */
public class CuratorFrameworkFactoryUtil {

    // 连接重试等待的初始时间
    private static final int BASE_SLEEP_TIME = 1000;
    // 最大重试次数
    private static final int MAX_RETRIES = 3;

    public static CuratorFramework getCuratorFramework(String connectAddress) {
        // 重试策略
        // 指数重试等待策略：每次重试连接的等待时间逐渐变长
        RetryPolicy policy = new ExponentialBackoffRetry(BASE_SLEEP_TIME, MAX_RETRIES);
        return CuratorFrameworkFactory.builder()
                .connectString(connectAddress)
                .retryPolicy(policy)
                .build();
    }


}
