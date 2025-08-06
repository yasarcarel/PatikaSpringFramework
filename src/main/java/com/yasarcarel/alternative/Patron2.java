package com.yasarcarel.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@Alternative
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "patron2: "+data;
    }

}
