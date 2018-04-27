package by.iba.gomel.impls;

import by.iba.gomel.ifaces.IDog;

/**
 * This class provides an implementation of interface IDog.
 */
public final class Terrier implements IDog {
    private static final String TERRIER_BARK = "Bow-bow-bow!";
    private static final int    PORTION      = 10;
    private static final int    EMPTY        = 0;
    private static final int    FULL         = 100;

    /**
     * The terrier's nickname.
     */
    private final String        nickname;
    /**
     * This field indicates the level of dog's appetite. If appetite = EMPTY - the dog is hungry and
     * can't even wag its tail. If appetite = FULL - the dog is satisfied and don't want to eat.
     */
    private int                 appetite;
    /**
     * This field indicates whether the dog wags its tail.
     */
    private boolean             wagging;

    /**
     * Public constructor. Sets private fields in default values.
     *
     * @param nickname
     *            of the dog.
     */
    public Terrier(final String nickname) {
        this.nickname = nickname;
        this.appetite = Terrier.EMPTY;
        this.wagging = false;
    }

    @Override
    public String bark() {
        return Terrier.TERRIER_BARK;
    }

    @Override
    public void eat() {
        if ((this.appetite + Terrier.PORTION) <= Terrier.FULL) {
            this.appetite += Terrier.PORTION;
        }
    }

    @Override
    public boolean isWagging() {
        return this.wagging;
    }

    @Override
    public void startWagging() {
        if (this.appetite >= Terrier.PORTION) {
            this.wagging = true;
        } else {
            this.wagging = false;
        }
    }

    @Override
    public void stopWagging() {
        if (this.isWagging()) {
            this.appetite -= Terrier.PORTION;
            this.wagging = false;
        }
    }

    @Override
    public String toString() {
        return "Terrier " + this.nickname + "\nAppetite = " + this.appetite
                + "\nWagging the tail = " + this.wagging;
    }
}
