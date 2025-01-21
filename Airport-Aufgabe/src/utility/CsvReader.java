package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final String CSV_SEPARATOR = ",";

    public List<String[]> readCsv(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine(); // Header ignorieren
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(CSV_SEPARATOR, -1);
                data.add(parts);
            }
        }
        return data;
    }
}