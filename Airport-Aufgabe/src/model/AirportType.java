package model;

/**
 * Klasse für den Typ eines Flughafens.
 */
public class AirportType {
    private static final String DEFAULT_TYPE = "unknown"; // Standardtyp
    private final String type; // Typ des Flughafens

    public AirportType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static String getDefaultType() {
        return DEFAULT_TYPE;
    }
}