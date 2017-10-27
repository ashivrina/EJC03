package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public String quack() {
        return "Quack-quack!";
    }
}
