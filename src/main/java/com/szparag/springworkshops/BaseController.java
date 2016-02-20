package com.szparag.springworkshops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ciemek on 20/02/16.
 */
@Controller
@ComponentScan(value="com.szparag.springworkshops")
@EnableAutoConfiguration
public class BaseController{

    @Autowired
    private CounterBean counterBean;

    @Autowired
    private LogBean logBean;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        String homeMessage = "Hello World!<br/><br/>";

        homeMessage += "count: " + counterBean.incrementAndGet() + "<br/>";
//        homeMessage += "logBean: " +

        return homeMessage;
    }




    //to learn:
        //REFLEKSJA W JAVIE
        //MAP W JAVIE
        //kolejka MQ na serwerze
}
