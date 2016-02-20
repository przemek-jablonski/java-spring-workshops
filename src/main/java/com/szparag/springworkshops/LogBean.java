package com.szparag.springworkshops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component
public class LogBean implements InitializingBean, DisposableBean {

    final static Logger log = LoggerFactory.getLogger(LogBean.class);

    @Autowired
    private CounterBean counterBean;

    @Override
    public void destroy() throws Exception {
        log.info("shutting down LogBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(counterBean, "counterBean");
        log.info("INITIALIZING LOG BEAN");
    }
}
