package com.yasarcarel.qualifier3;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
@ApplicationScoped
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM UCUNCU: "+data;
    }

}
