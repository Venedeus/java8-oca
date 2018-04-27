package by.iba.gomel.math.geometry;

/**
 * This class presents a simple calculation of the square of the cylinder's surface.
 */
public final class SimpleCylinderGeometry {
    /**
     * Double constant PI.
     */
    public static final double PI = 3.14;

    /**
     * Private constructor.
     */
    private SimpleCylinderGeometry() {

    }

    /**
     * Calculation of the cylinder's square.
     *
     * @param radius
     *            - radius of the cylinder's basics.
     * @param height
     *            - height of the cylinder.
     * @return the square of the cylinder's surface.
     */
    public static double calculateCylinderSquare(final int radius, final int height) {
        return (SimpleCylinderGeometry.PI * radius * radius)
                + (SimpleCylinderGeometry.PI * radius * radius)
                + (((SimpleCylinderGeometry.PI * radius) + (SimpleCylinderGeometry.PI * radius))
                        * height);
    }
}
