package com.yasarcarel.ioclidili;

@Component
public class Patron implements PatronInterface {

    @Override
    public String surum(String data){
        return "sürüm: "+data;
    }

}
