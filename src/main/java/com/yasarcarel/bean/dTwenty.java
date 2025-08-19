package com.yasarcarel.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "d20")
@ApplicationScoped
@Setter @Getter
public class dTwenty {

    int randGen = (int)(Math.random() * 20);
    int incRandGen = randGen + 1;

    private String dTwenty;

    public dTwenty() {
        this.dTwenty="You've Rolled: ";
    }
}
