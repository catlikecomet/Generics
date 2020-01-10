package com.company;

import java.util.ArrayList;
import java.util.List;

public class Apple<T extends Predicate> implements Predicate<T> {

    String colour = "Red";

    public int getCount() {
        return 1;
    }

    public String getColour() {
        return colour;
    }

    //predicate to determine whether an object should be counted or not
    @Override
    public boolean test(T t) {
         getCount() = T -> getColour();
    }

}
