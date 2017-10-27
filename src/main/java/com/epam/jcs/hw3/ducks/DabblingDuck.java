package com.epam.jcs.hw3.ducks;

import com.epam.jcs.hw3.interfaces.impl.FlyWithWings;
import com.epam.jcs.hw3.interfaces.impl.Quack;

public class DabblingDuck extends Duck {

    public DabblingDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public String display() {
        return "I am a dabbling duck and I dabble";
    }
}
