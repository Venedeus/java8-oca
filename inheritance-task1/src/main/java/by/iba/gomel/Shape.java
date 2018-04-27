/**
 *
 */
package by.iba.gomel;

import java.util.function.DoubleSupplier;

/**
 * This is an interface for different types of shapes.
 */
public interface Shape extends DoubleSupplier {
    /**
     * This method counts the area of a shape.
     *
     * @return area of a shape.
     */
    double getArea();
}
