package cn.test.dubbo.registry.serviceImpl;

import cn.test.dubbo.registry.service.TestRegistryService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/26 13:11
 * Desc:
 */
@Service(version="1.0.0")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {

        System.out.println("------------本地测试------------");

        return "hello" + name;
    }
}
