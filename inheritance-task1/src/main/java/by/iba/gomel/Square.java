/**
 *
 */
package by.iba.gomel;

/**
 * This class provides an implementation of the AbstractRectangle as a Square.
 */
public final class Square extends AbstractRectangle {
    /**
     * Prime value for hash code.
     */
    private static final int HASH_CODE_PRIME = 31;

    /**
     * Custom constructor.
     *
     * @param side
     *            - side of a square.
     */
    public Square(final double side) {
        super(side);
    }

    /**
     * This method overrides standard equals() method.
     *
     * @param obj
     *            - object to compare.
     * @return true - if instances are equal, false - if not.
     */
    @Override
    public boolean equals(final Object obj) {
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        final Square other = (Square) obj;

        if (Double.doubleToLongBits(this.getWidth()) != Double
                .doubleToLongBits(other.getHeight())) {
            return false;
        }

        return true;
    }

    /**
     * This implementation for counting square's area.
     */
    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    /**
     * Implementation of abstract method.
     *
     * @return zero.
     */
    @Override
    public double getAsDouble() {
        return 0;
    }

    /**
     * Getter for width of a square.
     *
     * @return width of a square.
     *
     * @see by.iba.gomel.AbstractRectangle#getWidth()
     */
    @Override
    public double getWidth() {
        return this.getHeight();
    }

    /**
     * This method counts a hash code of a square.
     *
     * @return hash code of a square.
     */
    @Override
    public int hashCode() {
        int result = 1;

        result = (Square.HASH_CODE_PRIME * result) + (int) this.getHeight() + (int) this.getWidth()
                + (int) this.getArea();

        return result;
    }

    /**
     * This method returns a state of an instance.
     *
     * @return state of a square.
     */
    @Override
    public String toString() {
        return "Square:\nside = " + this.getWidth() + "\narea = " + this.getArea();
    }
}
