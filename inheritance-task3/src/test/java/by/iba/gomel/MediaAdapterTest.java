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
 * This class is for testing MediaAdapter class.
 */
public class MediaAdapterTest {
    /**
     * An instance of MediaAdapter.
     */
    private MediaAdapter       adapter;

    /**
     * Rule for logger.
     */
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.adapter = new MediaAdapter();
    }

    /**
     * Test method for {@link by.iba.gomel.MediaAdapter#playFile(by.iba.gomel.audio.Mp3File)}.
     */
    @Test
    public void testPlayFile() {
        this.adapter.playFile(new Mp3File());

        Assert.assertTrue("Method playFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.MediaAdapter - by.iba.gomel.MediaAdapter"));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.MediaAdapter#playMediaFile(by.iba.gomel.audio.AbstractMediaFile)}.
     */
    @Test
    public void testPlayMediaFileMp4File() {
        this.adapter.playMediaFile(new Mp4File());

        Assert.assertTrue("Method playMediaFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.Mp4Player - by.iba.gomel.Mp4Player"));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.MediaAdapter#playMediaFile(by.iba.gomel.audio.AbstractMediaFile)}.
     */
    @Test
    public void testPlayMediaFileVlcFile() {
        this.adapter.playMediaFile(new VlcFile());

        Assert.assertTrue("Method playMediaFile() failed.", this.log.getLog()
                .contains("[main] INFO by.iba.gomel.VlcPlayer - by.iba.gomel.VlcPlayer"));
    }
}
