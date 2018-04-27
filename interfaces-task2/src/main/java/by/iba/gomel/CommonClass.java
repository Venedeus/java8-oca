/**
 *
 */
package by.iba.gomel;

import java.security.SecureRandom;

/**
 * This class implements two interfaces InterfA and InterfB.
 */
public final class CommonClass implements InterfA, InterfB {
    /**
     * Implemented method from IntSupplier interface.
     * 
     * @return zero.
     */
    @Override
    public int getAsInt() {
        return 0;
    }

    /**
     * This method implements method test() of the interfaces. These interfaces have method int
     * test() with the same signature. So there is no error during implementation.
     *
     * @return random integer.
     */
    @Override
    public int test() {
        return new SecureRandom().nextInt();
    }

    /**
     * This method has default realization in both interfaces. So there is in error during
     * implementation. To solve it should be overridden (as below), or the signature of one of these
     * default realizations should be changed.
     *
     * @return random integer.
     */
    @Override
    public int testDefault() {
        return new SecureRandom().nextInt();
    }
}
