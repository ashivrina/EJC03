package com.epam.jcs.hw3;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }
}
