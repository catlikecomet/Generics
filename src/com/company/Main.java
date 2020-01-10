package com.company;

import java.util.List;


public class Main <T extends Countable> extends Box {

    public static void main(String[] args) {

        Apple apple = new Apple();

        Box box = new Box();
        box.add(apple);
        box.add(apple);

        Cart cart = new Cart();
        cart.add(box);

        Cart cart1 = new Cart();
        cart1.add(box);
        cart1.add(box);

        System.out.println("apples counter: " + apple.getCount());
        System.out.println("box contains: " + box.getCount() + " apples ");
        System.out.println("cart contains: " + cart.getCount() + " boxes and " + cart.getCount() * box.getCount() + " Apple(s).");
        System.out.println("cart 2 contains: " + cart1.getCount() + " boxes and " + cart.getCount() * box.getCount() + " Apple(s).");
        }
        }