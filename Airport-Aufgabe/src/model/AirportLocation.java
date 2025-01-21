package model;

/**
 * Klasse für die Lage eines Flughafens.
 */
public class AirportLocation {
    private static final double DEFAULT_LATITUDE = 0.0; // Standardwert für Breitengrad
    private static final double DEFAULT_LONGITUDE = 0.0; // Standardwert für Längengrad
    private static final Double DEFAULT_ELEVATION = null; // Standardwert für Höhe
    private static final String DEFAULT_CONTINENT = "N/A"; // Standardwert für Kontinent
    private static final String DEFAULT_ISO_COUNTRY = "N/A"; // Standardwert für Land
    private static final String DEFAULT_ISO_REGION = "N/A"; // Standardwert für Region
    private static final String DEFAULT_MUNICIPALITY = "N/A"; // Standardwert für Gemeinde

    private final double latitude; // Breitengrad
    private final double longitude; // Längengrad
    private final Double elevation; // Höhe über dem Meeresspiegel
    private final String continent; // Kontinent
    private final String isoCountry; // ISO-Ländercode
    private final String isoRegion; // ISO-Regionscode
    private final String municipality; // Gemeinde

    public AirportLocation(double latitude, double longitude, Double elevation, String continent,
                           String isoCountry, String isoRegion, String municipality) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.continent = continent;
        this.isoCountry = isoCountry;
        this.isoRegion = isoRegion;
        this.municipality = municipality;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public Double getElevation() { return elevation; }
    public String getContinent() { return continent; }
    public String getIsoCountry() { return isoCountry; }
    public String getIsoRegion() { return isoRegion; }
    public String getMunicipality() { return municipality; }

    public static double getDefaultLatitude() { return DEFAULT_LATITUDE; }
    public static double getDefaultLongitude() { return DEFAULT_LONGITUDE; }
    public static Double getDefaultElevation() { return DEFAULT_ELEVATION; }
    public static String getDefaultContinent() { return DEFAULT_CONTINENT; }
    public static String getDefaultIsoCountry() { return DEFAULT_ISO_COUNTRY; }
    public static String getDefaultIsoRegion() { return DEFAULT_ISO_REGION; }
    public static String getDefaultMunicipality() { return DEFAULT_MUNICIPALITY; }
}