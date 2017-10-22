package com.epam.jcs.hw3;

public class DabblingDuck extends Duck {

    public DabblingDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a dabbling duck and I dabble");
    }
}
