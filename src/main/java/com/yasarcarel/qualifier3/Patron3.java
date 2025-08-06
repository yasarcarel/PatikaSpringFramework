package com.yasarcarel.qualifier3;

import javax.enterprise.context.ApplicationScoped;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
@ApplicationScoped
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM IKINCI: "+data;
    }

}
