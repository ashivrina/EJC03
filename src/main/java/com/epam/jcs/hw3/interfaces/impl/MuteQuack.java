package com.epam.jcs.hw3.interfaces.impl;

import com.epam.jcs.hw3.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public String quack() {
        return "<<I am silent>>";
    }
}
