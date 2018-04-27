package by.iba.gomel;

/**
 * This class provides the calculation of different matches of rows/columns/diagonals in
 * 3-dimensional cube.
 */
public class CubeAnalyzer {
    /**
     * Composition of cube.
     */
    private final Cube cube;
    /**
     * Quantity of full matches in rows/columns/diagonals.
     */
    private int        matches;

    /**
     * Public constructor.
     *
     * @param cube
     *            - cube to analyze.
     */
    public CubeAnalyzer(final Cube cube) {
        this.cube = cube;
        this.matches = 0;
    }

    /**
     * This method checks the sequence of chars in a line.
     *
     * @param ch1
     *            - the first input char to check.
     * @param ch2
     *            - the second input char to check.
     * @param check
     *            - the result of previous check.
     * @return true if there is a check / false - if not.
     */
    private static boolean checkLine(final char ch1, final char ch2, final boolean check) {
        if (check) {
            return ch1 == ch2;
        }

        return false;
    }

    /**
     * Getter for matches.
     *
     * @return quantity of matches.
     */
    public final int getMatches() {
        this.matches = this.checkArray();

        return this.matches;
    }

    /**
     * This method counts checks in rows, columns and diagonals.
     *
     * @return quantity of checks.
     */
    private int checkArray() {
        final char[][][] charArr = this.cube.getCharArr();
        boolean checkRow;
        boolean checkColumn;
        int checksCount = 0;

        for (final char[][] element : charArr) {
            for (int j = 0; j < element.length; j++) {
                checkRow = true;
                checkColumn = true;

                for (int k = 0; k < (element[j].length - 1); k++) {
                    // Row checking.
                    checkRow = CubeAnalyzer.checkLine(element[j][k], element[j][k + 1], checkRow);

                    // Column checking.
                    checkColumn = CubeAnalyzer.checkLine(element[k][j], element[k + 1][j],
                            checkColumn);
                }

                if (checkRow) {
                    checksCount++;
                }

                if (checkColumn) {
                    checksCount++;
                }
            }
        }

        // Diagonals checking.
        checksCount += this.checkDiagonals();

        return checksCount;
    }

    /**
     * This method checks diagonals.
     *
     * @return quantity of diagonal checks.
     */
    private int checkDiagonals() {
        boolean checkA1CDiagonal = true;
        boolean checkAC1Diagonal = true;
        boolean checkB1DDiagonal = true;
        boolean checkBD1Diagonal = true;
        int checksCount = 0;
        final int length = this.cube.getCharArr().length - 1;

        for (int i = 0; i < length; i++) {
            checkA1CDiagonal = this.isDiagonalChecked(i, i, i, Diagonals.A1C_DIAGONAL,
                    checkA1CDiagonal);

            checkAC1Diagonal = this.isDiagonalChecked(i, length - i, i, Diagonals.AC1_DIAGONAL,
                    checkAC1Diagonal);

            checkB1DDiagonal = this.isDiagonalChecked(length - i, i, i, Diagonals.B1D_DIAGONAL,
                    checkB1DDiagonal);

            checkBD1Diagonal = this.isDiagonalChecked(length - i, length - i, i,
                    Diagonals.BD1_DIAGONAL, checkBD1Diagonal);
        }

        if (checkA1CDiagonal) {
            checksCount++;
        }

        if (checkAC1Diagonal) {
            checksCount++;
        }

        if (checkB1DDiagonal) {
            checksCount++;
        }

        if (checkBD1Diagonal) {
            checksCount++;
        }

        return checksCount;
    }

    /**
     * This method checks the diagonals.
     *
     * @param i
     *            - i-coordinate of the array.
     * @param j
     *            - j-coordinate of the array.
     * @param k
     *            - k-coordinate of the array.
     * @param switchDiagonal
     *            - element of Diagonals enumeration to check.
     * @param check
     *            - the result of previous check.
     * @return the result of check.
     */
    private boolean isDiagonalChecked(final int i, final int j, final int k,
            final Diagonals switchDiagonal, final boolean check) {
        boolean isChecked = check;

        final char ch = this.cube.getCharArr()[i][j][k];

        switch (switchDiagonal) {
            case A1C_DIAGONAL:
                if (ch == this.cube.getCharArr()[i + 1][j + 1][k + 1]) {
                    isChecked = true;
                }
                break;
            case AC1_DIAGONAL:
                if (ch == this.cube.getCharArr()[i + 1][j - 1][k + 1]) {
                    isChecked = true;
                }
                break;
            case B1D_DIAGONAL:
                if (ch == this.cube.getCharArr()[i - 1][j + 1][k + 1]) {
                    isChecked = true;
                }
                break;
            case BD1_DIAGONAL:
                if (ch == this.cube.getCharArr()[i - 1][j - 1][k + 1]) {
                    isChecked = true;
                }
                break;
            default:
                isChecked = false;
        }

        return isChecked;
    }
}
