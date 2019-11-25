package com.company;

import java.util.ArrayList;

public class Box<T extends Countable> implements Countable {

    int boxLength = 10;
    int boxWidth = 12;
    int boxSize = boxLength * boxWidth;

    ArrayList<T> apples = new ArrayList<T>();

    public void add(T apple) {
            for (int i = 0; i <= boxSize; i++) {
                apples.add(apple);
            }
    }

    public int getCount() {
        int getCount = apples.size();

        return getCount;
    }

}