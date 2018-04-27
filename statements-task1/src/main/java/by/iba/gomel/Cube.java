package by.iba.gomel;

import java.security.SecureRandom;

/**
 * This class provides realization of 3-dimensional array as a cube. There is a random char
 * generator method to fill the array.
 */
public class Cube {
    /**
     * Constant - length of Latin alphabet: ALPHABET = 26.
     */
    private static final int    ALPHABET   = 26;
    /**
     * Char constant - generator start char.
     */
    private static final char   START_CHAR = 'a';
    /**
     * String constant - symbol of new line.
     */
    private static final String NEW_LINE   = "\n";

    /**
     * Array of chars.
     */
    private final char[][][]    charArr;

    /**
     * Public constructor. Char array initialization.
     *
     * @param dimension
     *            the dimension of the cube.
     */
    public Cube(final int dimension) {
        this.charArr = Cube.cubeFactory(dimension);
    }

    /**
     * This method provides creation and filling of the array.
     *
     * @return array filled with random chars.
     */
    private static char[][][] cubeFactory(final int dimension) {
        final char[][][] charArr = new char[dimension][dimension][dimension];

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                for (int k = 0; k < charArr[i][j].length; k++) {
                    charArr[i][j][k] = Cube.generateChar();
                }
            }
        }

        return charArr;
    }

    /**
     * This method is a char generator.
     *
     * @return random char.
     */
    private static char generateChar() {
        final SecureRandom r = new SecureRandom();

        return (char) (r.nextInt(Cube.ALPHABET) + Cube.START_CHAR);
    }

    /**
     * Getter for array.
     *
     * @return array.
     */
    public final char[][][] getCharArr() {
        return this.charArr;
    }

    /**
     * Overridden toString method.
     *
     * @return string about object.
     *
     */
    @Override
    public final String toString() {
        final StringBuilder str = new StringBuilder();
        for (final char[][] element : this.charArr) {
            for (final char[] element2 : element) {
                for (final char element3 : element2) {
                    str.append(element3);
                }
                str.append(Cube.NEW_LINE);
            }
            str.append(Cube.NEW_LINE);
        }
        return str.toString();
    }
}
