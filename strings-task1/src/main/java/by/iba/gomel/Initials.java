/**
 *
 */
package by.iba.gomel;

/**
 * This class is to compute initial name from input.
 */
public final class Initials {
    /**
     * Constant: Separator between initials.
     */
    private static final String DOT               = ".";
    /**
     * Constant: Default full name.
     */
    private static final String DEFAULT_FULL_NAME = "";

    /**
     * Private constructor.
     */
    private Initials() {

    }

    /**
     * This method is for computing initials for full name.
     *
     * @param fullName
     *            - input full name.
     * @return initial name.
     */
    public static String computeInitials(final String fullName) {
        String inits = Initials.DEFAULT_FULL_NAME;
        final StringBuilder buffer = new StringBuilder(Initials.DEFAULT_FULL_NAME);
        int step = 0;

        for (final char ch : fullName.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                buffer.append(ch + Initials.DOT);
                step++;
            }
        }

        if (step > 1) {
            inits = buffer.toString();
        }

        return inits;
    }
}
