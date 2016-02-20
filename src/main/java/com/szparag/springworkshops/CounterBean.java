package com.szparag.springworkshops;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component
public class CounterBean {

    //bezpiecznosc wielowatkowa - dlatego AtomicInteger, a nie int
    private final AtomicInteger counter = new AtomicInteger();

    public Integer incrementAndGet() {
        return counter.incrementAndGet();
    }

    public Integer get(){
        return counter.get();
    }
}
