package com.epam.jcs.hw3.ducks;

import com.epam.jcs.hw3.interfaces.FlyBehaviour;
import com.epam.jcs.hw3.interfaces.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract String display();

    public String performFly() {
        return flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public String swim() {
        return "All ducks can swim. That's what they do!";
    }
}
