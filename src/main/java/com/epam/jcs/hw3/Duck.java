package com.epam.jcs.hw3;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    void performFly() {
        flyBehaviour.fly();
    }

    void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void swim() {
        System.out.println("All ducks can swim. That's what they do!");
    }
}
