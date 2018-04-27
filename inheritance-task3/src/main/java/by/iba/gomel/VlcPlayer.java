/**
 *
 */
package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.audio.MediaFile;

/**
 * This class provides realization of vlc-player.
 */
public final class VlcPlayer implements AdvancedMediaPlayer {
    /**
     * Logger for demo-function of playing.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(VlcPlayer.class);

    /**
     * The implementation of method accept().
     *
     * @param t
     *            - given object.
     */
    @Override
    public void accept(final MediaFile t) {
        //
    }

    /**
     * This method provides to play media files.
     *
     * @param fileName
     *            - name of media file to play.
     */
    @Override
    public void playFile(final MediaFile fileName) {
        VlcPlayer.LOGGER.info(this.getClass().getName());
    }
}
