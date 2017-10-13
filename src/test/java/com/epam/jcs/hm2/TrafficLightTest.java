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
}
