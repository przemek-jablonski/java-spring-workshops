package com.szparag.springworkshops;

import org.springframework.stereotype.Component;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component
public class InMemporyRepo  implements Repo{


    @Override
    public int store(int id) {
        return 100;
    }
}
