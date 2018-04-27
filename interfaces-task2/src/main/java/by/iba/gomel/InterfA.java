package by.iba.gomel;

import java.security.SecureRandom;
import java.util.function.IntSupplier;

/**
 * This is an interface with three types of methods.
 */
public interface InterfA extends IntSupplier {
    /**
     * Static method to return a random integer.
     *
     * @return random integer.
     */
    static int testStatic() {
        return new SecureRandom().nextInt();
    }

    /**
     * This method should be implemented.
     *
     * @return one integer.
     */
    int test();

    /**
     * This is a default method to return a random integer.
     *
     * @return random integer.
     */
    default int testDefault() {
        return new SecureRandom().nextInt();
    }
}
