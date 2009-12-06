/**
 * creation date: 23.05.2008
 * first author: dsl
 *
 * (C) Copyright Die Softwareschneiderei GmbH, Karlsruhe, Germany
 */
package de.dhbw.tit07.progress.helper;

/**
 * Utility class to check parameters for their presence (not being <code>null</code>).
 * @author dsl
 */
public final class ParameterCheck {

    /**
     * This class does not support instantiation.
     */
    private ParameterCheck() {
        super();
    }

    /**
     * Checks all given parameters for occurrences of <code>null</code>.
     * The first parameter to be <code>null</code> triggers an {@link IllegalArgumentException} and cancels further examination.
     * @param parameters the parameters
     * @throws IllegalArgumentException if at least one parameter is null, with generic message
     */
    public static void ensurePresence(Object... parameters) throws IllegalArgumentException {
        for (int i = 0; i < parameters.length; i++) {
            ParameterCheck.ensurePresenceOf("parameter " + i, parameters[i]); //$NON-NLS-1$
        }
    }

    /**
     * Checks the given parameter on being <code>null</code>.
     * If it is <code>null</code>, it triggers an {@link IllegalArgumentException}.
     * @param parameter the parameter
     * @throws IllegalArgumentException if the parameter is null, with generic message
     */
    public static void ensurePresenceOf(Object parameter) throws IllegalArgumentException {
        ParameterCheck.ensurePresenceOf("parameter", parameter); //$NON-NLS-1$
    }

    /**
     * Checks the given parameter on being <code>null</code>.
     * If it is <code>null</code>, it triggers an {@link IllegalArgumentException} with a message containing the given parameter name.
     * @param parameter the parameter
     * @throws IllegalArgumentException if the parameter is null, with named message
     */
    public static void ensurePresenceOf(String name, Object parameter) throws IllegalArgumentException {
        if (null == parameter) {
            throw new IllegalArgumentException(name + " must not be null."); //$NON-NLS-1$
        }
    }
}
