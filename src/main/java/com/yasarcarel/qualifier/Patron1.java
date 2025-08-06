package com.yasarcarel.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@Default
@ApplicationScoped
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data){
        return "default data: "+data;
    }

}
