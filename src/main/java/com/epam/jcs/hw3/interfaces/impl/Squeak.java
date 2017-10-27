package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public String quack() {
        return "Squeak-squeak";
    }
}
