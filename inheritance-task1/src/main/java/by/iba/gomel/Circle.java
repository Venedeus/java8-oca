/**
 *
 */
package by.iba.gomel;

/**
 * This class provides an implementation of the interface Shape as a Circle.
 */
public final class Circle implements Shape {
    private static final int DOUBLE_RADIUS = 2;
    /**
     * Radius of the circle.
     */
    private final double     radius;

    /**
     * Custom constructor.
     *
     * @param radius
     *            - radius of the circle.
     */
    public Circle(final double radius) {
        this.radius = radius;

    }

    /**
     * This method counts the area of the circle.
     *
     * @see by.iba.gomel.Shape#getRhombusArea()
     * @return area of the circle.
     */
    @Override
    public double getArea() {
        return Circle.DOUBLE_RADIUS * this.radius * Math.PI;
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
     * Getter for the radius.
     *
     * @return radius of the circle.
     */
    public double getRadius() {
        return this.radius;
    }
}
