package top.ytazwc.zk;


import org.junit.After;
import org.junit.Before;

/**
 * @author 花木凋零成兰
 * @title CuratorFrameworkFactoryUtilTest
 * @date 2025-03-16 20:25
 * @package top.ytazwc.zk
 * @description 测试 Zookeeper 数据节点的增删改查
 */
public class CuratorFrameworkFactoryUtilTest {

    /**
     * Zookeeper 的数据节点分为四大类：
     * 1、持久节点，创建后就一直存在，即使集群宕机；
     * 2、临时节点，临时节点生命周期与 客户端(session)会话绑定 会话消失则节点也会消失，并且临时节点只能做叶子节点，不能创建节点
     * 3、持久顺序节点，
     */

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }




}