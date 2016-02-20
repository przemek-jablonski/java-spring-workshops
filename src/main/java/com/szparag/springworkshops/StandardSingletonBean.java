package com.szparag.springworkshops;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Ciemek on 20/02/16.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StandardSingletonBean {

    private final UUID uuid;


    public StandardSingletonBean() {
        uuid = UUID.randomUUID();
    }

    public String getString() {
        return "";
    }


}