package by.gomel.iba;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ifaces.ITvset;
import by.iba.gomel.impls.Lcd;

public class LcdTest {
    ITvset tvLcd = new Lcd(42);

    @Test
    public void testDecVolume() {
        this.tvLcd.turnOff();
        this.tvLcd.turnOn();
        this.tvLcd.decVolume();

        Assert.assertEquals("decVolume method testing failed",
                "LCD-42\"\nTurned on = true\nTuned = false\nCurrent channel = 1\nCurrent volume = 9",
                this.tvLcd.printSettings());
    }

    @Test
    public void testIncVolume() {
        this.tvLcd.turnOff();
        this.tvLcd.turnOn();
        this.tvLcd.incVolume();
        this.tvLcd.incVolume();
        this.tvLcd.incVolume();

        Assert.assertEquals("incVolume method testing failed",
                "LCD-42\"\nTurned on = true\nTuned = false\nCurrent channel = 1\nCurrent volume = 13",
                this.tvLcd.printSettings());
    }

    @Test
    public void testLcd() {
        final ITvset newTv = new Lcd(32);
        Assert.assertEquals("Constructor testing failed",
                "LCD-32\"\nTurned on = false\nTuned = false\nCurrent channel = 0\nCurrent volume = 0",
                newTv.printSettings());
    }

    @Test
    public void testPrintSettings() {
        final ITvset newTv = new Lcd(32);
        Assert.assertEquals("printSettings method testing failed",
                "LCD-32\"\nTurned on = false\nTuned = false\nCurrent channel = 0\nCurrent volume = 0",
                newTv.printSettings());
    }

    @Test
    public void testSetCurrentChannel() {
        this.tvLcd.turnOff();
        this.tvLcd.turnOn();
        this.tvLcd.tuneUp();
        this.tvLcd.setCurrentChannel(20);

        Assert.assertEquals("setCurrentChannel method testing failed",
                "LCD-42\"\nTurned on = true\nTuned = true\nCurrent channel = 20\nCurrent volume = 10",
                this.tvLcd.printSettings());
    }

    @Test
    public void testTuneUp() {
        final ITvset newTv = new Lcd(32);
        newTv.tuneUp();
        Assert.assertEquals("tuneUp method testing failed",
                "LCD-32\"\nTurned on = false\nTuned = true\nCurrent channel = 0\nCurrent volume = 0",
                newTv.printSettings());
    }

    @Test
    public void testTurnOff() {
        this.tvLcd.turnOn();
        this.tvLcd.turnOff();

        Assert.assertEquals("turnOff method testing failed",
                "LCD-42\"\nTurned on = false\nTuned = false\nCurrent channel = 0\nCurrent volume = 0",
                this.tvLcd.printSettings());
    }

    @Test
    public void testTurnOn() {
        this.tvLcd.turnOff();
        this.tvLcd.turnOn();

        Assert.assertEquals("turnOn method testing failed",
                "LCD-42\"\nTurned on = true\nTuned = false\nCurrent channel = 1\nCurrent volume = 10",
                this.tvLcd.printSettings());
    }

}
