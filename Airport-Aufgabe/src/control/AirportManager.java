package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import utility.CsvReader;
import utility.Timer;
import model.*;

public class AirportManager {

    private final List<Airport> airports = new ArrayList<>();

    public void loadAirports(String filePath) throws IOException {
        Timer timer = new Timer();
        timer.start();

        CsvReader csvReader = new CsvReader();
        List<String[]> data = csvReader.readCsv(filePath);

        for (String[] parts : data) {
            Airport airport = parseAirport(parts);
            airports.add(airport);
        }

        timer.stop();
        System.out.println("Daten erfolgreich geladen: " + airports.size() + " Flughäfen.");
        System.out.println("Bearbeitungszeit: " + timer.getElapsedTimeInMilliseconds() + " ms.");
    }

    private Airport parseAirport(String[] parts) {
        AirportId id = parseAirportId(parts[0]);
        AirportIdent ident = parseAirportIdent(parts[1]);
        AirportType type = parseAirportType(parts[2]);
        AirportName name = parseAirportName(parts[3]);
        AirportLocation location = parseAirportLocation(parts);
        AirportRunway runway = parseAirportRunway(parts);
        return new Airport(id, ident, type, name, location, runway);
    }

    private AirportId parseAirportId(String part) {
        return new AirportId(Integer.parseInt(part));
    }

    private AirportIdent parseAirportIdent(String part) {
        return new AirportIdent(part.isEmpty() ? AirportIdent.getDefaultIdent() : part);
    }

    private AirportType parseAirportType(String part) {
        return new AirportType(part.isEmpty() ? AirportType.getDefaultType() : part);
    }

    private AirportName parseAirportName(String part) {
        return new AirportName(part.isEmpty() ? AirportName.getDefaultName() : part);
    }

    private AirportLocation parseAirportLocation(String[] parts) {
        return new AirportLocation(
            isNumeric(parts[4]) ? Double.parseDouble(parts[4]) : AirportLocation.getDefaultLatitude(),
            isNumeric(parts[5]) ? Double.parseDouble(parts[5]) : AirportLocation.getDefaultLongitude(),
            isNumeric(parts[6]) ? Double.parseDouble(parts[6]) : null,
            parts[7].isEmpty() ? AirportLocation.getDefaultContinent() : parts[7],
            parts[8].isEmpty() ? AirportLocation.getDefaultIsoCountry() : parts[8],
            parts[9].isEmpty() ? AirportLocation.getDefaultIsoRegion() : parts[9],
            parts[10].isEmpty() ? AirportLocation.getDefaultMunicipality() : parts[10]
        );
    }

    private AirportRunway parseAirportRunway(String[] parts) {
        return new AirportRunway(
            isNumeric(parts[11]) ? Double.parseDouble(parts[11]) : AirportRunway.getDefaultLength(),
            isNumeric(parts[12]) ? Double.parseDouble(parts[12]) : AirportRunway.getDefaultWidth(),
            parts[13].isEmpty() ? AirportRunway.getDefaultSurface() : parts[13],
            parts[14].equals("1")
        );
    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public List<Airport> getAirports() {
        return airports;
    }
}