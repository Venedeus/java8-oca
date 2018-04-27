package by.iba.gomel.impls;

import by.iba.gomel.ifaces.ITvset;

/**
 * This class provides an implementation of interface ITvset.
 */
public final class Lcd implements ITvset {
    /**
     * Zero value.
     */
    private static final int ZERO            = 0;
    /**
     * Value of default channel.
     */
    private static final int DEFAULT_CHANNEL = 1;

    /**
     * Value of default volume.
     */
    private static final int DEFAULT_VOLUME  = 10;
    /**
     * Value of max channel.
     */
    private static final int MAX_CHANNEL     = 50;
    /**
     * Value of max volume.
     */
    private static final int MAX_VOLUME      = 100;
    /**
     * TV-set's diagonal.
     */
    private final int        diagonal;
    /**
     * This field indicates whether the TV-set is turned on.
     */
    private boolean          isTurned;
    /**
     * This field indicates whether the TV-set is tuned up.
     */
    private boolean          isTuned;
    /**
     * Current channel.
     */
    private int              currentChannel;
    /**
     * Current level of volume
     */
    private int              currentVolume;

    /**
     * Public constructor.
     *
     * @param diagonal
     *            of TV-set.
     */
    public Lcd(final int diagonal) {
        this.diagonal = diagonal;
        this.isTurned = false;
        this.isTuned = false;
    }

    @Override
    public void decVolume() {
        if (this.currentVolume > Lcd.ZERO) {
            this.currentVolume--;
        }
    }

    @Override
    public void incVolume() {
        if (this.currentVolume < Lcd.MAX_VOLUME) {
            this.currentVolume++;
        }
    }

    @Override
    public String printSettings() {
        return "LCD-" + this.diagonal + "\"\nTurned on = " + this.isTurned + "\nTuned = "
                + this.isTuned + "\nCurrent channel = " + this.currentChannel
                + "\nCurrent volume = " + this.currentVolume;
    }

    @Override
    public void setCurrentChannel(final int currentChannel) {
        if (this.isTurned && this.isTuned && (currentChannel > Lcd.ZERO)
                && (currentChannel <= Lcd.MAX_CHANNEL)) {
            this.currentChannel = currentChannel;
        }
    }

    @Override
    public void tuneUp() {
        this.isTuned = true;
    }

    @Override
    public void turnOff() {
        if (this.isTurned) {
            this.isTurned = false;
            this.currentChannel = Lcd.ZERO;
            this.currentVolume = Lcd.ZERO;
        }
    }

    @Override
    public void turnOn() {
        if (!this.isTurned) {
            this.isTurned = true;
            this.currentChannel = Lcd.DEFAULT_CHANNEL;
            this.currentVolume = Lcd.DEFAULT_VOLUME;
        }
    }
}
