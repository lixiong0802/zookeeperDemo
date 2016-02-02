package cn.duboo.test;

import cn.test.dubbo.registry.service.TestRegistryService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/22 14:53
 * Desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class JunitTest {

//    private final static transient Logger logger = LoggerFactory.getLogger(JunitTest.class);

    @Reference(version = "1.0.0")
    private TestRegistryService testRegistryService;

    @Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            String result = testRegistryService.hello("lixiong");
            System.out.println(result);
        }

    }
}
