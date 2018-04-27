package by.iba.gomel;

/**
 * Abstract class that represents a rectangle.
 */
public abstract class AbstractRectangle implements Shape, Cloneable {
    /**
     * Height of a rectangle.
     */
    private double height;

    /**
     * Public constructor.
     * 
     * @param height
     *            - height of a rectangle.
     */
    public AbstractRectangle(final double height) {
        this.height = height;
    }

    /**
     * Getter for height.
     *
     * @return height of a rectangle.
     */
    public final double getHeight() {
        return this.height;
    }

    /**
     * Abstract getter for width.
     *
     * @return width of a rectangle.
     */
    public abstract double getWidth();

    /**
     * Setter for height.
     *
     * @param height
     *            - height of a rectangle.
     */
    public final void setHeight(final double height) {
        this.height = height;
    }
}
