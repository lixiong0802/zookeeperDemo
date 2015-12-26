package cn.test.dubbo.controller;

import cn.test.dubbo.registry.service.TestRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/26 13:32
 * Desc:
 */
@Controller
public class IndexController {

    @Autowired
    private TestRegistryService testRegistryService;

    public String index(Model model) {
        String name = testRegistryService.hello("zz");
        System.out.println("xx==" + name);
        return "";
    }

}