/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.audio.Mp3File;
import by.iba.gomel.audio.Mp4File;
import by.iba.gomel.audio.VlcFile;

/**
 * This class is for testing AudioPlayer class.
 */
public class AudioPlayerTest {
    /**
     * An instance of audio player.
     */
    private AudioPlayer        player;
    /**
     * Rule for logger.
     */
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    /**
     * Test method for {@link by.iba.gomel.AudioPlayer#AudioPlayer()}.
     */
    @Test
    public void testAudioPlayer() {
        Assert.assertNotNull("Instance creation failed.", this.player);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.player = new AudioPlayer();
    }

    /**
     * Test method for
     * {@link by.iba.gomel.AudioPlayer#playMediaFile(by.iba.gomel.audio.MediaFile)}.
     */
    @Test
    public void testPlayFileMp3() {
        this.player.playFile(new Mp3File());

        Assert.assertTrue("Method playFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.AudioPlayer - by.iba.gomel.AudioPlayer"));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.AudioPlayer#playMediaFile(by.iba.gomel.audio.MediaFile)}.
     */
    @Test
    public void testPlayMediaFileMp4() {
        this.player.playMediaFile(new Mp4File());

        Assert.assertTrue("Method playMediaFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.Mp4Player - by.iba.gomel.Mp4Player"));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.AudioPlayer#playMediaFile(by.iba.gomel.audio.MediaFile)}.
     */
    @Test
    public void testPlayMediaFileVlc() {
        this.player.playMediaFile(new VlcFile());

        Assert.assertTrue("Method playMediaFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.VlcPlayer - by.iba.gomel.VlcPlayer"));
    }

}
