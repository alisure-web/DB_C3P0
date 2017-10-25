package test.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import test.spring.entity.TestEntity;
import test.spring.service.TestService;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="all",method = RequestMethod.GET)
    @ResponseBody
    public List<TestEntity> getEntity(){
        System.out.println("get all........");
        return testService.getAllTestEntity();
    }
}
