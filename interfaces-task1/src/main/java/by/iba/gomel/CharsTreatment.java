package by.iba.gomel;

/**
 * This class implements interface CharSequence.
 */
public final class CharsTreatment implements CharSequence {
    /**
     * Char sequence for treatment.
     */
    private char[] sequence;

    /**
     * Default constructor.
     */
    public CharsTreatment() {
        // Default constructor.
    }

    /**
     * Custom constructor.
     *
     * @param sequence
     *            input sequence.
     */
    public CharsTreatment(final char[] sequence) {
        this.sequence = sequence.clone();
    }

    /**
     * Implemented method to find a char at position.
     *
     * @param arg0
     *            - position of a char.
     * @return char at position.
     */
    @Override
    public char charAt(final int arg0) {
        return this.sequence[arg0];
    }

    /**
     * Implemented method to get length of treated char sequence.
     *
     * @return length of a char sequence.
     */
    @Override
    public int length() {
        return this.sequence.length;
    }

    /**
     * This method is for reverse an input char sequence.
     *
     * @return reversed char sequence.
     */
    public CharSequence reverse() {
        final char[] charArr = new char[this.length()];

        for (int i = this.length() - 1; i >= 0; i--) {
            charArr[this.length() - 1 - i] = this.charAt(i);
        }

        return new CharsTreatment(charArr);
    }

    /**
     * Setter for a char sequence.
     *
     * @param sequence
     *            - sequence to be set.
     */
    public void setSequence(final char[] sequence) {
        this.sequence = sequence.clone();
    }

    /**
     * This method looks for a subsequance in a char sequence.
     *
     * @param arg0
     *            - begin of the subsequance.
     * @param arg1
     *            - end of the subsequance.
     * @return subsequance.
     */
    @Override
    public CharSequence subSequence(final int arg0, final int arg1) {
        final char[] subSequence = new char[(arg1 - arg0) + 1];

        for (int i = arg0; i <= arg1; i++) {
            subSequence[i] = this.sequence[i];
        }

        return new CharsTreatment(subSequence);
    }

    /**
     * This method modify a char sequence into a string for output.
     */
    @Override
    public String toString() {
        return String.valueOf(this.sequence);
    }
}
