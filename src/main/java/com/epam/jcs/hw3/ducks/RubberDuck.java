package com.epam.jcs.hw3.ducks;

import com.epam.jcs.hw3.interfaces.impl.FlyNoWay;
import com.epam.jcs.hw3.interfaces.impl.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public String display() {
        return "I am a rubber duck";
    }
}
