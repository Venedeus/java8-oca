package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

public class TestHuman {

    @Test
    public void testHuman() {
        final Human unit = new Human("Unit");

        Assert.assertEquals("Constructor test failed", "Human:\nname=Unit\nage=20\nweight=0",
                unit.toString());
    }

    @Test
    public void testSetWeight() {
        final Human unit = new Human("Unit");
        unit.setWeight(50);

        Assert.assertEquals("setWeight method test failed", "Human:\nname=Unit\nage=20\nweight=50",
                unit.toString());
    }

    @Test
    public void testToString() {
        final Human unit = new Human("Unit");

        Assert.assertEquals("toString method test failed", "Human:\nname=Unit\nage=20\nweight=0",
                unit.toString());
    }
}
