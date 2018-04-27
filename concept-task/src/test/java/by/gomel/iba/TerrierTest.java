package by.gomel.iba;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ifaces.IDog;
import by.iba.gomel.impls.Terrier;

public class TerrierTest {
    private final IDog dog = new Terrier("Lucky");

    @Test
    public void testBark() {
        Assert.assertEquals("bark method testing failed", "Bow-bow-bow!", this.dog.bark());
    }

    @Test
    public void testEat() {
        this.dog.eat();
        Assert.assertEquals("eat method testing failed",
                "Terrier Lucky\nAppetite = 10\nWagging the tail = false", this.dog.toString());
    }

    @Test
    public void testIsWagging() {
        this.dog.eat();
        this.dog.startWagging();

        Assert.assertTrue("isWagging method testing failed", this.dog.isWagging());

        this.dog.stopWagging();

        Assert.assertFalse("isWagging method testing failed", this.dog.isWagging());
    }

    @Test
    public void testStartWagging() {
        this.dog.eat();
        this.dog.startWagging();

        Assert.assertTrue("startWagging method testing failed", this.dog.isWagging());
    }

    @Test
    public void testStopWagging() {
        this.dog.eat();
        this.dog.startWagging();
        this.dog.stopWagging();

        Assert.assertFalse("stopWagging method testing failed", this.dog.isWagging());
    }

    @Test
    public void testTerrier() {
        final IDog newDog = new Terrier("Barkly");

        Assert.assertEquals("Constructor testing failed",
                "Terrier Barkly\nAppetite = 0\nWagging the tail = false", newDog.toString());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("toString method testing failed",
                "Terrier Lucky\nAppetite = 0\nWagging the tail = false", this.dog.toString());
    }

}
