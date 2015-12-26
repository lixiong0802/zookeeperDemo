package cn.duboo.test;

import cn.test.dubbo.registry.service.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/26 13:38
 * Desc:
 */

public class Clinet {

    public static void main(String[] args) {

        while (true) {

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            context.start();
            TestRegistryService demoService = (TestRegistryService) context.getBean("testRegistryService"); // 获取远程服务代理
            String hello = demoService.hello(" lixiong"); // 执行远程方法
            System.out.println(hello);
        }
    }

}
