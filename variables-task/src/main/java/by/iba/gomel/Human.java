package by.iba.gomel;

/**
 * This class provides simple variant of a human with three fields. 1. name - string field for
 * human's name. Initialized throw the constructor. 2. age - integer field for human's age.
 * Initialized throw the constant. 3. weight - integer field for human's weight. Not initialized.
 */
public final class Human {
    /**
     * Constant - HUMAN_AGE = 20.
     */
    private static final int HUMAN_AGE = 20;

    /**
     * Human's name.
     */
    private final String     name;
    /**
     * Human's age.
     */
    private final int        age;
    /**
     * Human's weight. This field will be initialized with 0 by default.
     */
    private int              weight;

    /**
     * Constructor with parameter.
     *
     * @param name
     *            - human's name.
     */
    public Human(final String name) {
        this.name = name;
        this.age = Human.HUMAN_AGE;
    }

    /**
     * Setter for weight.
     *
     * @param weight
     *            - human's weight
     */
    public void setWeight(final int weight) {
        this.weight = weight;
    }

    /**
     * Overridden method to return a human states.
     */
    @Override
    public String toString() {
        return "Human:\nname=" + this.name + "\nage=" + this.age + "\nweight=" + this.weight;
    }
}
