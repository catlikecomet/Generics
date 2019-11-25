package com.company;

import java.util.ArrayList;

public class Cart<T extends Countable> implements Countable {

    int cartHeight = 5;
    int cartLength = 3;
    int cartDepth = 2;
    int cartSize = cartHeight * cartLength * cartDepth;

    ArrayList<T> boxes = new ArrayList<T>();

    public void add(T box) {
            for (int i = 0; i <= cartSize; i++) {
                boxes.add(box);
            }
    }

    public int getCount() {
        int getCount = boxes.size();

        return getCount;
    }
}