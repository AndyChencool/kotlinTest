package com.andy.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> nunbers = new HashSet<>();
    int numberCount = 0;
    // abstract  抽象
    public abstract void generate();
    public boolean validate(){
        if (nunbers.size() == numberCount)
            return true;
        else
            return false;
    }


}
