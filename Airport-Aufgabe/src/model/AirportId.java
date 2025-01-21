package model;

/**
 * Klasse für die ID eines Flughafens.
 */
public class AirportId {
    private static final int DEFAULT_ID = 0; // Standard-ID, falls keine angegeben wird
    private final int id; // Eindeutige ID

    public AirportId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}