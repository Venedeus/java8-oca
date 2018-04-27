/**
 *
 */
package by.iba.gomel;

import java.security.SecureRandom;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CubeAnalyzerTest {
    /**
     * Constant - length of Latin alphabet: ALPHABET = 25 (without 'a').
     */
    private static final int  ALPHABET   = 25;
    /**
     * Char constant - generator start char.
     */
    private static final char START_CHAR = 'b';
    /**
     * Dimension of the cube.
     */
    int                       dim;
    /**
     * Cube object.
     */
    Cube                      cube;
    /**
     * CubeAnalyzer object.
     */
    CubeAnalyzer              cubeAnalyzer;

    /**
     * This method reinitializes the cube.
     *
     * @param the
     *            cube to be reinitialized.
     */
    private static void reinitializeCube(final Cube cube) {
        final char[][][] charArr = cube.getCharArr();
        final SecureRandom r = new SecureRandom();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                for (int k = 0; k < charArr[i][j].length; k++) {
                    charArr[i][j][k] = (char) (r.nextInt(CubeAnalyzerTest.ALPHABET)
                            + CubeAnalyzerTest.START_CHAR);
                }
            }
        }
    }

    /**
     * This method tests column checking. One of the columns is initialized with a-char. The clear
     * result is achieved by reinitializing the cube with chars except a-char. So this step excludes
     * any accidental checks of rows or diagonals with a-char in defined column. So a-column can
     * increase total amount of checks only on 1.
     */
    @Test
    public void testColumnCheck() {
        final int defaultMatches = this.cubeAnalyzer.getMatches();
        final char[][][] charArr = this.cube.getCharArr();

        for (int i = 0; i < charArr[0].length; i++) {
            charArr[0][i][0] = 'a';
        }

        Assert.assertEquals("Column checking failed.", 1,
                this.cubeAnalyzer.getMatches() - defaultMatches);
    }

    /**
     * Test method for {@link by.iba.gomel.CubeAnalyzer#CubeAnalyzer(by.iba.gomel.Cube)}.
     */
    @Test
    public void testCubeAnalyzer() {
        Assert.assertNotNull("Object of CubeAnalyzer cannot be created.",
                new CubeAnalyzer(new Cube(this.dim)));
    }

    /**
     * This method tests diagonal checking. One of the diagonals is initialized with a-char. The
     * clear result is achieved by reinitializing the cube with chars except a-char. So this step
     * excludes any accidental checks of rows or columns with a-char in defined diagonal. So
     * a-diagonal can increase total amount of checks only on 1.
     */
    @Test
    public void testDiagonalCheck() {
        final int defaultMatches = this.cubeAnalyzer.getMatches();
        final char[][][] charArr = this.cube.getCharArr();

        for (int i = 0; i < charArr.length; i++) {
            charArr[i][i][i] = 'a';
        }

        Assert.assertNotEquals("Diagonal checking failed.", 1,
                this.cubeAnalyzer.getMatches() - defaultMatches);
    }

    /**
     * Test method for {@link by.iba.gomel.CubeAnalyzer#getMatches()}.
     */
    @Test
    public void testGetMatches() {
        final char[][][] charArr = this.cube.getCharArr();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                for (int k = 0; k < charArr[i][j].length; k++) {
                    charArr[i][j][k] = 'a';
                }
            }
        }

        Assert.assertEquals("Method getMatches failed.", ((this.dim + this.dim) * this.dim) + 4,
                this.cubeAnalyzer.getMatches());
    }

    @Before
    @Test
    public void testInitialization() {
        this.dim = 3;
        this.cube = new Cube(this.dim);
        this.cubeAnalyzer = new CubeAnalyzer(this.cube);
        CubeAnalyzerTest.reinitializeCube(this.cube);
    }

    /**
     * This method tests row checking. One of the rows is initialized with a-char. The clear result
     * is achieved by reinitializing the cube with chars except a-char. So this step excludes any
     * accidental checks of columns or diagonals with a-char in defined row. So a-row can increase
     * total amount of checks only on 1.
     */
    @Test
    public void testRowCheck() {
        final int defaultMatches = this.cubeAnalyzer.getMatches();
        final char[][][] charArr = this.cube.getCharArr();

        for (int i = 0; i < charArr[0][0].length; i++) {
            charArr[0][0][i] = 'a';
        }

        Assert.assertEquals("Row checking failed.", 1,
                this.cubeAnalyzer.getMatches() - defaultMatches);
    }
}
