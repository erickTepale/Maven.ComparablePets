package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void testConstructor(){
        //expected
        Dog a = new Dog("Name");

        //
        Assert.assertFalse(a == null);
    }

    @Test
    public void testSpeak(){
        //Expected
        String expected = "Bork";

        Dog a = new Dog("bleh");

        Assert.assertEquals(expected, a.speak());
    }
}
