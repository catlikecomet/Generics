package com.company;

import java.util.List;


public class Main <T extends Countable> extends Box {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Box box = new Box();
        Cart cart = new Cart();

        System.out.println("apples: " + apple.getCount());
        System.out.println("boxes: " + box.getCount());
        System.out.println("cart: " + cart.getCount());
    }
}