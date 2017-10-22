package com.epam.jcs.hw3;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //Creating a new dabbling duck to check how it flies and quacks.
        Duck dabblingDuck = new DabblingDuck();
        dabblingDuck.display();
        dabblingDuck.performFly();
        dabblingDuck.performQuack();

        //Creating a new rubber duck that can't fly by default and then changing her fly behaviour.
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyBehaviour(new FlyRocketPowered());
        rubberDuck.performFly();
    }
}
