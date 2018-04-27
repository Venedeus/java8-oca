package by.iba.gomel;

/**
 * This class provides a dog with two fields: name and says.
 */
public final class Dog {
    /**
     * Private field name.
     */
    private final String name;
    /**
     * Private field says.
     */
    private final String says;

    /**
     * Constructor with parameters.
     *
     * @param name
     *            - name of a dog.
     * @param says
     *            - dog's bark.
     */
    public Dog(final String name, final String says) {
        this.name = name;
        this.says = says;
    }

    /**
     * toString() overridden method.
     *
     * @return string with dogs characteristics.
     */
    @Override
    public String toString() {
        return "Dog: name=" + this.name + ", says=" + this.says;
    }
}
