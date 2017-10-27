package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public String fly() {
        return "I'm flying with a rocket, far-far away";
    }
}
