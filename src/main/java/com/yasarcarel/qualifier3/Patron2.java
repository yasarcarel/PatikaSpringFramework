package com.yasarcarel.qualifier3;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM BIRINCI: "+data;
    }

}
