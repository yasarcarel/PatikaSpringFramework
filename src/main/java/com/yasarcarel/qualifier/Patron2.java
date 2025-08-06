package com.yasarcarel.qualifier;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple 1: "+data;
    }

}
