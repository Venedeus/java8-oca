package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    /**
     * This test checks the constructor. The only way to do it is to check with help of toString
     * method.
     */
    @Test
    public void testDog() {
        final Dog dog = new Dog("Jack", "Bow!");
        Assert.assertEquals("Constructor test failed.", "Dog: name=Jack, says=Bow!",
                dog.toString());
    }

    /**
     * This test checks the toString method.
     */
    @Test
    public void testToString() {
        final Dog dog = new Dog("Jack", "Bow!");
        Assert.assertEquals("toString method test failed.", "Dog: name=Jack, says=Bow!",
                dog.toString());
    }
}
