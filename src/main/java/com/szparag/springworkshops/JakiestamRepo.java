package com.szparag.springworkshops;

import org.springframework.stereotype.Component;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component("jakiesrepo")
public class JakiestamRepo implements Repo {
    @Override
    public int store(int id) {
        return 9999;
    }
}
