/**
 *
 */
package by.iba.gomel.audio;

/**
 * This is a class of audio files.
 */
public class MediaFile {
    /**
     * Name of the audio file.
     */
    private String name;

    /**
     * Protected constructor to prevent instantiation.
     */
    protected MediaFile() {

    }

    /**
     * Getter for name of the audio file.
     *
     * @return name of the audio file.
     */
    public final String getName() {
        return this.name;
    }
}
