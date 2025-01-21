package utility;

/**
 * Klasse zur Messung der Zeitdauer.
 */
public class Timer {
    private long startTime; // Startzeit in Nanosekunden
    private long endTime;   // Endzeit in Nanosekunden

    /**
     * Startet die Zeitmessung.
     * Vorbedingung: Keine.
     * Nachbedingung: Die Startzeit wird auf die aktuelle Zeit in Nanosekunden gesetzt.
     */
    public void start() {
        startTime = System.nanoTime();
    }

    /**
     * Stoppt die Zeitmessung.
     * Vorbedingung: Die Zeitmessung muss gestartet worden sein.
     * Nachbedingung: Die Endzeit wird auf die aktuelle Zeit in Nanosekunden gesetzt.
     */
    public void stop() {
        endTime = System.nanoTime();
    }

    /**
     * Gibt die verstrichene Zeit in Millisekunden zurück.
     * Vorbedingung: Die Zeitmessung muss gestartet und gestoppt worden sein.
     * Nachbedingung: Die verstrichene Zeit in Millisekunden wird zurückgegeben.
     * @return Verstrichene Zeit in Millisekunden.
     */
    public long getElapsedTimeInMilliseconds() {
        return (endTime - startTime) / 1_000_000;
    }
}