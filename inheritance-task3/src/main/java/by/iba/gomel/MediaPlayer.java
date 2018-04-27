/**
 *
 */
package by.iba.gomel;

import java.util.function.Consumer;

import by.iba.gomel.audio.Mp3File;

/**
 * This is an interface of Media Player.
 */
public interface MediaPlayer extends Consumer<Mp3File> {
    /**
     * This method is to play mp3-files.
     *
     * @param file
     *            - an audio file.
     */
    void playFile(Mp3File file);
}
