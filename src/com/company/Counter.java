package com.company;

import java.util.ArrayList;

public class Counter<T extends Predicate> implements Predicate<T> {

    ArrayList<T> counterList = new ArrayList<>();

//    public int getCount() {
//
//
//
//
//
//        int count = 0;
//
//        for(T item : counterList) {
//            count += item.getCount();
//        }
//
//        return count;
//    }

    //predicate to determine whether an object should be counted or not
    @Override
    public boolean test(T t) {
        return t.equals("Red");
    }
}