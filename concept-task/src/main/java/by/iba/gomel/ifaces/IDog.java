package by.iba.gomel.ifaces;

/**
 * This interface provides common action a dog can do. It can bark, eat a portion of food, start to
 * wag the tail, stop do that. Checking the process of wagging is enabled in method isWagging().
 */
public interface IDog {
    /**
     * This method provides the process of barking.
     *
     * @return dog's barking.
     */
    String bark();

    /**
     * This method lets a dog to eat.
     */
    void eat();

    /**
     * This method checks if a dog wags its tail.
     *
     * @return true - if a dog wags, false - if not.
     */
    boolean isWagging();

    /**
     * Due to this method a dog starts to wag its tail.
     */
    void startWagging();

    /**
     * Due to this method a dog stops to wag its tail.
     */
    void stopWagging();
}
