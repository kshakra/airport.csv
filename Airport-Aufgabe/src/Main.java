import control.AirportManager;
import view.Viewer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AirportManager airportManager = new AirportManager();

        try {
            airportManager.loadAirports("C:\\Users\\Kareem\\Desktop\\Montag\\airports.csv");
        } catch (IOException e) {
            System.err.println("Fehler beim Laden der Flughafendaten: " + e.getMessage());
            return;
        }

        Viewer viewer = new Viewer(airportManager);
        viewer.displayAirportCount();
    }
}