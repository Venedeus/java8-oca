/**
 *
 */
package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.audio.MediaFile;
import by.iba.gomel.audio.Mp3File;

/**
 * This class implements MediaPlayer interface.
 */
public final class AudioPlayer implements MediaPlayer {
    /**
     * Logger for demo-function of playing.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AudioPlayer.class);
    /**
     * An instance of MediaAdapter to provide playing extended list of files.
     */
    private final MediaAdapter  adapter;

    /**
     * Default constructor.
     */
    public AudioPlayer() {
        this.adapter = new MediaAdapter();
    }

    /**
     * The implementation of method accept().
     *
     * @param t
     *            - given object.
     */
    @Override
    public void accept(final Mp3File t) {
        //
    }

    /**
     * This is an implementation of playing mp3-files.
     *
     * @param fileName
     *            - name of mp3-file to play.
     * @see by.iba.gomel.MediaPlayer#playFile(java.lang.String)
     */
    @Override
    public void playFile(final Mp3File fileName) {
        AudioPlayer.LOGGER.info(this.getClass().getName());
    }

    /**
     * This method provides to play files through MediaAdapter functional.
     *
     * @param fileName
     *            - name of media file to play.
     */
    public void playMediaFile(final MediaFile fileName) {
        this.adapter.playMediaFile(fileName);
    }

}
