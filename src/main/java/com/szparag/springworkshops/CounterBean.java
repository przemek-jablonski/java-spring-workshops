package com.szparag.springworkshops;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component
public class CounterBean implements InitializingBean {

    @Value("${counter.initialVal}")
    private Integer initialVal;

    //bezpiecznosc wielowatkowa - dlatego AtomicInteger, a nie zwykly int
//    private final AtomicInteger counter = new AtomicInteger(initialVal);
    private AtomicInteger counter;

    public Integer incrementAndGet() {
        return counter.incrementAndGet();
    }

    public Integer get(){
        return counter.get();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        counter = new AtomicInteger(initialVal);
    }
}
