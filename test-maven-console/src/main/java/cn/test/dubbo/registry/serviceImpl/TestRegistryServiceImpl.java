package cn.test.dubbo.registry.serviceImpl;

import cn.test.dubbo.registry.service.TestRegistryService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/26 13:11
 * Desc:
 */
@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello" + name;
    }
}
