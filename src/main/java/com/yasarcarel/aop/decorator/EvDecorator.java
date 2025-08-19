package com.yasarcarel.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract class EvDecorator implements IEv {

    private @Inject @Delegate
    IEv iEv;

    @Override
    public String boyama(String data) {
        System.out.println("decorator burada");
        String dataInformation=iEv.boyama(data);
        if(dataInformation.equals("ekmek")){
            dataInformation=dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
