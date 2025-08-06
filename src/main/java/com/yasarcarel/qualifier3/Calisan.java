package com.yasarcarel.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value= "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    //Defaultta çalışacak kodlar
//    @Inject
//    private PatronInterface patronInterface;

    //istediğim seçenek(1) için çalışacak kodlar
//    @Inject
//    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
//    private PatronInterface patronInterface;

    //istediğim seçenek(2) için çalışacak kodlar
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;

    //istediğim seçenek(3) için çalışacak kodlar
//    @Inject
//    @QualifierMultiple2(EFazlaSecenekler.UCUNCU)
//    private PatronInterface patronInterface;


    public String getData(String data){
        return patronInterface.surum(data);
    }
}
