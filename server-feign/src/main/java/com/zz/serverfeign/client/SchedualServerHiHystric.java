package com.zz.serverfeign.client;

import org.springframework.stereotype.Component;
@Component
public class SchedualServerHiHystric implements SchedualServerHi {
    @Override
    public String sayHiFromClientOne(String name) {

        return "sorry, you are fail,"+name;

    }

}
