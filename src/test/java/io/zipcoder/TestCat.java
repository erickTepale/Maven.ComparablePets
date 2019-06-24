package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void testConstructor(){
        //expected
        Cat a = new Cat("Name");

        //
        Assert.assertFalse(a == null);
    }

    @Test
    public void testSpeak(){
        //Expected
        String expected = "Meow";

        Cat a = new Cat("bleh");

        Assert.assertEquals(expected, a.speak());
    }
}
