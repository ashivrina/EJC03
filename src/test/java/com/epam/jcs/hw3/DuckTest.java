package com.epam.jcs.hw3;

import com.epam.jcs.hw3.ducks.DabblingDuck;
import com.epam.jcs.hw3.ducks.Duck;
import com.epam.jcs.hw3.ducks.RubberDuck;
import com.epam.jcs.hw3.interfaces.impl.FlyRocketPowered;
import com.epam.jcs.hw3.interfaces.impl.MuteQuack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuckTest {
    private Duck dabblingDuck;
    private Duck rubberDuck;

    @Before
    public void setup() {
        dabblingDuck = new DabblingDuck();
        rubberDuck = new RubberDuck();
    }

    @Test
    public void testPerformFly() {
        Assert.assertEquals("I use my wings to fly!", dabblingDuck.performFly());
        Assert.assertEquals("I can't fly. What a shame!", rubberDuck.performFly());
        rubberDuck.setFlyBehaviour(new FlyRocketPowered());
        Assert.assertEquals("I'm flying with a rocket, far-far away", rubberDuck.performFly());
    }

    @Test
    public void testPerformQuack() {
        Assert.assertEquals("Quack-quack!", dabblingDuck.performQuack());
        Assert.assertEquals("Squeak-squeak", rubberDuck.performQuack());
        rubberDuck.setQuackBehaviour(new MuteQuack());
        Assert.assertEquals("<<I am silent>>", rubberDuck.performQuack());
    }

    @Test
    public void testDisplay() {
        Assert.assertEquals("I am a dabbling duck and I dabble", dabblingDuck.display());
        Assert.assertEquals("I am a rubber duck", rubberDuck.display());
    }

    @Test
    public void testSwim() {
        Assert.assertEquals("All ducks can swim. That's what they do!", dabblingDuck.swim());
    }
}
