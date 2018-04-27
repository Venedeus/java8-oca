/**
 *
 */
package by.iba.gomel;

/**
 * This class provides an array for shapes. The total area of all shapes can be counted.
 */
public final class ShapeController {
    /**
     * Array of shapes.
     */
    private final Shape[] shapeArray;

    /**
     * Custom constructor.
     *
     * @param length
     *            - length of an array.
     */
    public ShapeController(final int length) {
        this.shapeArray = new Shape[length];
    }

    /**
     * This method counts total area of all shapes.
     *
     * @return total area.
     */
    public double countTotalArea() {
        double totalArea = 0;

        for (final Shape shape : this.shapeArray) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }

        return totalArea;
    }

    /**
     * This method initializes members of shapeArray according to position.
     *
     * @param position
     *            - position to be initialized.
     * @param shape
     *            - shape to initialize.
     * @return next position to initialize.
     */
    public int initializeNextShape(final int position, final Shape shape) {
        int pos = position;

        if (pos < this.shapeArray.length) {
            this.shapeArray[pos] = shape;

        }

        pos++;

        return pos;
    }
}
