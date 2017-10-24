package com.epam.jcs.hm2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class tests whether determineColour and parseNumber methods of the TrafficLight test work correctly.
 *
 * @author Anna Shivrina
 */

public class TrafficLightTest {
    private TrafficLight trafficLight;

    @Before
    public void setup() {
        trafficLight = new TrafficLight();
    }

    /**
     * Test checks whether determineColour method returns a correct String.
     */
    @Test
    public void testDetermineColour() {
        Assert.assertEquals("Red", trafficLight.determineColour(0));
        Assert.assertEquals("Yellow", trafficLight.determineColour(2));
        Assert.assertEquals("Green", trafficLight.determineColour(5));
        Assert.assertEquals("Red", trafficLight.determineColour(3601));
    }

    /**
     * Test checks whether the correct exception is thrown when a negative number is entered.
     */
    @Test (expected = RuntimeException.class)
    public void testDetermineColourWithException() {
        trafficLight.determineColour(-198);
    }

    /**
     * Test checks whether numbers are interpreted correctly when String is parsed to a number.
     */
    @Test
    public void testGetNumberOfMinutes(){
        Assert.assertEquals(10, trafficLight.getNumberOfMinutes("10"));
        Assert.assertEquals(-100, trafficLight.getNumberOfMinutes("-100"));
    }

    /**
     * Test checks whether the correct exception is thrown when you enter not a number.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testGetNumberOfMinutesWithException() {
        trafficLight.getNumberOfMinutes("asdfh");
    }
}
