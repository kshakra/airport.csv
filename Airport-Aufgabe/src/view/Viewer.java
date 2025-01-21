package view;

import control.AirportManager;

/**
 * Klasse zur Anzeige der Anzahl der Flughäfen.
 */
public class Viewer {
    private final AirportManager airportManager;

    /**
     * Konstruktor, der den AirportManager initialisiert.
     * @param airportManager Der AirportManager, der die Flughafendaten verwaltet.
     */
    public Viewer(AirportManager airportManager) {
        this.airportManager = airportManager;
    }

    /**
     * Methode zur Anzeige der Anzahl der Flughäfen.
     */
    public void displayAirportCount() {
        int count = airportManager.getAirports().size();
        System.out.println("Anzahl der Flughäfen: " + count);
    }
}