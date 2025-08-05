package com.yasarcarel.ioclidili;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Patron implements PatronInterface {

    @Override
    public String surum(String data){
        return "sürüm: "+data;
    }

}
