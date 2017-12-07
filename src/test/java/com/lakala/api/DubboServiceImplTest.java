package com.lakala.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:webservice-demo-consumer.xml"})
public class DubboServiceImplTest {

    @Autowired
    private DubboService dubboService;

    @Test
    public void testPrintWorld() {
        String str=dubboService.printWorld("this is just a test");
        System.out.println(str);
    }
}
