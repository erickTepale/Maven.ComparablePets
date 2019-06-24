package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestIguana {
    @Test
    public void testConstructor(){
        //expected
        Iguana a = new Iguana("Name");

        //
        Assert.assertFalse(a == null);
    }

    @Test
    public void testSpeak(){
        //Expected
        String expected = "*stick tongue out twice*";

        Iguana a = new Iguana("bleh");

        Assert.assertEquals(expected, a.speak());
    }
}
