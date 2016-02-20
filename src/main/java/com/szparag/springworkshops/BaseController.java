package com.szparag.springworkshops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @Autowired
    @Resource(name = "jakiesrepo")
    private Repo repo;

    @Autowired
    private PrototypeBean prototypeBean;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        String homeMessage = "Hello World!<br/><br/>";

        homeMessage += "count: " + counterBean.incrementAndGet() + "<br/>";
        homeMessage += "repo: " + repo.toString() + "<br/>";
        homeMessage += "PROTOTYPE (from Controller): " + prototypeBean.toString() + "<br/>" + prototypeBean.getUuid() + "<br/>";
        homeMessage += "PROTOTYPE (from ComposableBean): " + logBean.getPrototypeInfo() + "<br/>" + prototypeBean.getUuid() + "<br/>";
        return homeMessage;
    }

    //to learn:
        //REFLEKSJA W JAVIE
        //MAP W JAVIE
        //kolejka MQ na serwerze
        //spring typowo tworzy jedna instancje : SINGLETONA
        //obchodzimy poprzez zadeklarowanie PROTOTYPU
        //wstrzykniecia poprzez autowire
        //Factory - Beans that create other beans
        //exceptions: throw vs try&catch
        //Lazy and Eager beans
        //Serwisy + hibernate
        // SIMILAR TO SYMFONY2: every controller for different mappings
}
