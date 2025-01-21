package model;

/**
 * Klasse für die Rollbahn eines Flughafens.
 */
public class AirportRunway {
    private static final double DEFAULT_LENGTH = 0.0; // Standardlänge der Rollbahn
    private static final double DEFAULT_WIDTH = 0.0; // Standardbreite der Rollbahn
    private static final String DEFAULT_SURFACE = "unknown"; // Standardbelag
    private static final boolean DEFAULT_LIGHTED = false; // Standardwert für Beleuchtung

    private final Double length; // Länge der Rollbahn
    private final Double width; // Breite der Rollbahn
    private final String surface; // Belag der Rollbahn
    private final boolean lighted; // Beleuchtung der Rollbahn

    public AirportRunway(Double length, Double width, String surface, boolean lighted) {
        this.length = length;
        this.width = width;
        this.surface = surface;
        this.lighted = lighted;
    }

    public Double getLength() { return length; }
    public Double getWidth() { return width; }
    public String getSurface() { return surface; }
    public boolean isLighted() { return lighted; }

    public static double getDefaultLength() { return DEFAULT_LENGTH; }
    public static double getDefaultWidth() { return DEFAULT_WIDTH; }
    public static String getDefaultSurface() { return DEFAULT_SURFACE; }
    public static boolean isDefaultLighted() { return DEFAULT_LIGHTED; }
}