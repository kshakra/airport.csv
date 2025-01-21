package model;

/**
 * Klasse für den Namen eines Flughafens.
 */
public class AirportName {
    private static final String DEFAULT_NAME = "Unnamed Airport"; // Standardname
    private final String name; // Name des Flughafens

    public AirportName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getDefaultName() {
        return DEFAULT_NAME;
    }
}