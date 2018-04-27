package by.iba.gomel;

import java.util.function.Consumer;

import by.iba.gomel.audio.MediaFile;

/**
 * This is an interface of advanced media player that can play video files.
 */
public interface AdvancedMediaPlayer extends Consumer<MediaFile> {
    /**
     * This method provides playing media files.
     *
     * @param fileName
     *            - name of media file to play.
     */
    void playFile(MediaFile fileName);
}
