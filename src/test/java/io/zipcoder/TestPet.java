package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestPet {
    @Test
    public void testConstructor(){
        //expected
        Pet a = new Pet("Name", "Pet");

        //
        Assert.assertFalse(a == null);
    }

    @Test
    public void testSpeak(){
        //Expected
        String expected = "Whimper";

        Pet a = new Pet("bleh", "Pet");

        Assert.assertEquals(expected, a.speak());
    }

}
