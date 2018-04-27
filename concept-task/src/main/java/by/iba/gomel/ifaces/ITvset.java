package by.iba.gomel.ifaces;

/**
 * This interface provides common functions of any TV-set. User can turn on / turn off it, change
 * channels, change volume or use auto tuning. Current states print with help of printStates()
 * method.
 */
public interface ITvset {
    /**
     * This method decreases volume by 1.
     */
    void decVolume();

    /**
     * This method increases volume by 1.
     */
    void incVolume();

    /**
     * This method prints current settings of TV-set.
     *
     * @return current settings.
     */
    String printSettings();

    /**
     * This method set channel.
     *
     * @param channel
     *            to be set.
     */
    void setCurrentChannel(int channel);

    /**
     * This method tune the TV-set.
     */
    void tuneUp();

    /**
     * This method turns TV-set off.
     */
    void turnOff();

    /**
     * This method turns TV-set on.
     */
    void turnOn();
}
