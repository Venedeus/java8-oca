package by.iba.gomel;

import java.security.SecureRandom;

/**
 * This class serves to presents different types of generators.
 */
public final class Generators {
    /**
     * Integer constant: the length of the Latin alphabet.
     */
    private static final int  LATIN_ALPHABET = 26;
    /**
     * Char constant: the first symbol of the Latin alphabet.
     */
    private static final char START_CHAR     = 'a';

    /**
     * Default private constructor.
     */
    private Generators() {
    }

    /**
     * Generator of random integers.
     *
     * @return generated integer.
     */
    public static int generateInt() {
        final SecureRandom random = new SecureRandom();

        return random.nextInt();
    }

    /**
     * Generator of random integers in range [0; limit).
     *
     * @param limit
     *            - upper limit of generator.
     * @return generated integer.
     */
    public static int generateInt(final int limit) {
        final SecureRandom random = new SecureRandom();

        return random.nextInt(limit);
    }

    /**
     * Generator of chars in range of the Latin alphabet.
     *
     * @return generated char.
     */
    public static char generateLatinChar() {
        final SecureRandom random = new SecureRandom();

        return (char) (random.nextInt(Generators.LATIN_ALPHABET) + Generators.START_CHAR);
    }
}
