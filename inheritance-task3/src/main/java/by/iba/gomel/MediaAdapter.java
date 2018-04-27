/**
 *
 */
package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.iba.gomel.audio.MediaFile;
import by.iba.gomel.audio.Mp3File;
import by.iba.gomel.audio.Mp4File;
import by.iba.gomel.audio.VlcFile;

/**
 * This class is adapter to increase a functional of MediaPlayer class.
 */
public final class MediaAdapter implements MediaPlayer {
    /**
     * Logger for demo-function of playing.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MediaAdapter.class);

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
     * @see by.iba.gomel.MediaPlayer#playMp3(java.lang.String)
     */
    @Override
    public void playFile(final Mp3File fileName) {
        MediaAdapter.LOGGER.info(this.getClass().getName());
    }

    /**
     * This method plays different types of media files.
     *
     * @param mediaFile
     *            - media file to play.
     */
    public void playMediaFile(final MediaFile mediaFile) {
        AdvancedMediaPlayer advPlayer;
        if (mediaFile instanceof Mp3File) {
            this.playFile((Mp3File) mediaFile);
        }

        if (mediaFile instanceof Mp4File) {
            advPlayer = new Mp4Player();
            advPlayer.playFile(mediaFile);
        }

        if (mediaFile instanceof VlcFile) {
            advPlayer = new VlcPlayer();
            advPlayer.playFile(mediaFile);
        }
    }
}
