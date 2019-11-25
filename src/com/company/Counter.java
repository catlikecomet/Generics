package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counter<T> {

    public ArrayList<T> things = new ArrayList<T>();

    public void add(T thing) {
        things.add(thing);
        things.add(thing);
        things.add(thing);
    }

    public <T> T countThings(){
        for (int count = 0; count <= things.size(); count++){
            System.out.println(count);
        }
        return countThings();
    }
}
