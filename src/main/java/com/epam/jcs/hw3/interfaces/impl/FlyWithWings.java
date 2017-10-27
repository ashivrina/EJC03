package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public String fly() {
        return "I use my wings to fly!";
    }
}
