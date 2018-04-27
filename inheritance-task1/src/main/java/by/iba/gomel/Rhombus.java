/**
 *
 */
package by.iba.gomel;

/**
 * This class provides an implementation of the AbstractRectangle as a rhombus.
 */
public final class Rhombus extends AbstractRectangle {
    /**
     * Prime value for hash code.
     */
    private static final int HASH_CODE_PRIME = 31;
    /**
     * Height of a rhombus.
     */
    private final double     rhombusHeight;

    /**
     * Custom constructor.
     *
     * @param side
     *            - side of a rhombus.
     * @param rhombusHeight
     *            - height of a rhombus.
     */
    public Rhombus(final double side, final double rhombusHeight) {
        super(side);
        this.rhombusHeight = rhombusHeight;
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

        final Rhombus other = (Rhombus) obj;

        if ((Double.doubleToLongBits(this.getHeight()) != Double
                .doubleToLongBits(other.getHeight()))
                || (Double.doubleToLongBits(this.rhombusHeight) != Double
                        .doubleToLongBits(other.rhombusHeight))) {
            return false;
        }

        return true;
    }

    /**
     * This method counts rhombus area.
     *
     * @return area of a rhombus.
     */
    @Override
    public double getArea() {
        return this.getHeight() * this.rhombusHeight;
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
     * Getter for rhombus height.
     *
     * @return rhombus height.
     */
    public double getRhombusHeight() {
        return this.rhombusHeight;
    }

    /**
     * Getter for width of a rhombus.
     *
     * @return width of a rhombus.
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
     * @return hash code of a rhombus.
     */
    @Override
    public int hashCode() {
        int result = 1;

        result = (Rhombus.HASH_CODE_PRIME * result) + (int) this.rhombusHeight
                + (int) this.getHeight() + (int) this.getWidth();

        return result;
    }

    /**
     * This method returns a state of an instance.
     *
     * @return state of a rhombus.
     */
    @Override
    public String toString() {
        return "Rhombus:\nside = " + this.getHeight() + "\nheight = " + this.rhombusHeight
                + "\narea = " + this.getArea();
    }
}
