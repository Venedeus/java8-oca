package by.iba.gomel;

import java.util.Locale;

/**
 * This enumeration provides names of primitive types.
 */
public enum PrimitiveTypes {
    BOOLEAN, CHAR, INT, LONG, FLOAT, DOUBLE;

    /**
     * This method returns a member's name of enumeration in lower case.
     *
     * @return the type's name.
     */
    @Override
    public String toString() {
        return this.name().toLowerCase(Locale.US);
    }
}
