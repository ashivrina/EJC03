package com.epam.jcs.hw3;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<<I am silent>>");
    }
}
