package model;

/**
 * Klasse zur Darstellung eines Flughafens.
 */
public class Airport {
    private final AirportId id; // Eindeutige ID des Flughafens
    private final AirportIdent airportIdent; // Kürzel zur Identifikation des Flughafens
    private final AirportType type; // Typ des Flughafens (z. B. regional, international)
    private final AirportName name; // Name des Flughafens
    private final AirportLocation location; // Geografische Lage des Flughafens
    private final AirportRunway runway; // Informationen zur Rollbahn

    // Konstruktor
    public Airport(AirportId id, AirportIdent airportIdent, AirportType type, AirportName name,
                   AirportLocation location, AirportRunway runway) {
        this.id = id;
        this.airportIdent = airportIdent;
        this.type = type;
        this.name = name;
        this.location = location;
        this.runway = runway;
    }

    // Getter-Methoden
    public AirportId getId() { return id; }
    public AirportIdent getAirportIdent() { return airportIdent; }
    public AirportType getType() { return type; }
    public AirportName getName() { return name; }
    public AirportLocation getLocation() { return location; }
    public AirportRunway getRunway() { return runway; }
}