package model;

/**
 * Klasse für die Identifikation eines Flughafens.
 */
public class AirportIdent {
    private static final String DEFAULT_IDENT = "UNKNOWN"; // Standard-Identifikator
    private final String ident; // Kürzel zur Identifikation

    public AirportIdent(String ident) {
        this.ident = ident;
    }

    public String getIdent() {
        return ident;
    }

    public static String getDefaultIdent() {
        return DEFAULT_IDENT;
    }
}