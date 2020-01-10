package com.company;

import java.util.function.Predicate;

public class Main <T extends Countable> extends Box {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Apple apple = new Apple();

        Box box = new Box();
        box.add(apple);
        box.add(apple);

        Cart cart = new Cart();
        cart.add(box);

        Cart cart1 = new Cart();
        cart1.add(box);
        cart1.add(box);

        System.out.println(counter.getCount(box.getApples(), new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColour().equals("Red");
            }
        }));
        }
        }