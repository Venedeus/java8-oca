/**
 *
 */
package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.audio.MediaFile;

/**
 * This class provides realization of mp4-player.
 */
public final class Mp4Player implements AdvancedMediaPlayer {
    /**
     * Logger for demo-function of playing.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Mp4Player.class);

    /**
     * The implementation of method accept().
     *
     * @param arg0
     *            - given object.
     */
    @Override
    public void accept(final MediaFile arg0) {
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
        Mp4Player.LOGGER.info(this.getClass().getName());
    }

}
