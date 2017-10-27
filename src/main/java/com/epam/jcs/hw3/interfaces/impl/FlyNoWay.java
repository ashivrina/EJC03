package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public String fly() {
        return "I can't fly. What a shame!";
    }
}
