package com.ssmshop;

import com.alibaba.fastjson.JSON;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BaseTest {
    public Logger logger;
    public BaseTest(Class classObj){
        this.logger = LoggerFactory.getLogger(classObj);
    }
    public void jsonPrint(Object object){
        System.out.println(JSON.toJSON(object));
    }
}
