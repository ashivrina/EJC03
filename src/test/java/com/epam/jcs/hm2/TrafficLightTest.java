package com.epam.jcs.hm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class tests whether determineColour method of the TrafficLight test works correctly.
 *
 * @author Anna Shivrina
 */

public class TrafficLightTest {

    /**
     * Test takes border values and checks whether the correct String is returned.
     */
    @Test
    public void testDetermineColour1() {
        Assert.assertEquals("Red", TrafficLight.determineColour(0));
        Assert.assertEquals("Yellow", TrafficLight.determineColour(2));
        Assert.assertEquals("Green", TrafficLight.determineColour(5));
    }

    /**
     * Test checks whether values greater than 60 are interpreted correctly
     */
    @Test
    public void testDetermineColour2() {
        Assert.assertEquals("Red", TrafficLight.determineColour(3601));
    }

    /**
     * Test checks how negative integers are handled.
     */
    @Test
    public void testDetermineColour3() {
        Assert.assertEquals("Undefined. Enter a positive integer.", TrafficLight.determineColour(-2));
    }

    /**
     * Test checks how entered numbers and not-numbers are handled.
     */
    @Test
    public void testParseNumber() {
        Assert.assertEquals(-1, TrafficLight.parseNumber("asd"));
        Assert.assertEquals(10, TrafficLight.parseNumber("10"));
    }
}
