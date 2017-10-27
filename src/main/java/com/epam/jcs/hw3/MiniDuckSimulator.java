package com.epam.jcs.hw3;

import com.epam.jcs.hw3.ducks.DabblingDuck;
import com.epam.jcs.hw3.ducks.Duck;
import com.epam.jcs.hw3.ducks.RubberDuck;
import com.epam.jcs.hw3.interfaces.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //Creating a new dabbling duck to check how it flies and quacks.
        Duck dabblingDuck = new DabblingDuck();
        System.out.println(dabblingDuck.display());
        System.out.println(dabblingDuck.performFly());
        System.out.println(dabblingDuck.performQuack());

        //Creating a new rubber duck that can't fly by default and then changing her fly behaviour.
        Duck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.display());
        System.out.println(rubberDuck.performFly());
        System.out.println(rubberDuck.performQuack());
        rubberDuck.setFlyBehaviour(new FlyRocketPowered());
        System.out.println(rubberDuck.performFly());
    }
}
