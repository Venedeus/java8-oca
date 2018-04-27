package by.iba.gomel;

/**
 * This class provides a simple primitive types converter into it's name.
 */
public final class PrimitiveTypesConverter {
    /**
     * This method receives boolean type and return the result.
     *
     * @param input
     *            - boolean value.
     * @return type's name "boolean".
     */
    public String convertToString(final boolean input) {
        return input + " - " + PrimitiveTypes.BOOLEAN.toString();
    }

    /**
     * This method receives char type and return the result.
     *
     * @param input
     *            - char value.
     * @return type's name "char".
     */
    public String convertToString(final char input) {
        return input + " - " + PrimitiveTypes.CHAR.toString();
    }

    /**
     * This method receives double type and return the result.
     *
     * @param input
     *            - double value.
     * @return type's name "double".
     */
    public String convertToString(final double input) {
        return input + " - " + PrimitiveTypes.DOUBLE.toString();
    }

    /**
     * This method receives float type and return the result.
     *
     * @param input
     *            - float value.
     * @return type's name "float".
     */
    public String convertToString(final float input) {
        return input + " - " + PrimitiveTypes.FLOAT.toString();
    }

    /**
     * This method receives int type and return the result.
     *
     * @param input
     *            - int value.
     * @return type's name "int".
     */
    public String convertToString(final int input) {
        return input + " - " + PrimitiveTypes.INT.toString();
    }

    /**
     * This method receives long type and return the result.
     *
     * @param input
     *            - long value.
     * @return type's name "long".
     */
    public String convertToString(final long input) {
        return input + " - " + PrimitiveTypes.LONG.toString();
    }
}
