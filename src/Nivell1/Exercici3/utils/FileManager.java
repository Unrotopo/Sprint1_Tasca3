package Nivell1.Exercici3.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileManager {

    private final String filePath;
    private final HashMap<String, String> countriesCapitals = new HashMap<>();

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public Map<String, String> getGameData() {
        try (Scanner scanner = new Scanner(new File(filePath + "countries.txt"))) {
            while (scanner.hasNextLine()) {
                String country = scanner.nextLine().trim();
                if (country.isEmpty()) continue;
                countriesCapitals.put(country.split(" ")[0], country.split(" ")[1]);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return countriesCapitals;
    }

    public void saveScores(int score, String playerName) {
        try (FileWriter scoreFile = new FileWriter(filePath + "classification.txt", true)) {
            scoreFile.write(playerName + ": ");
            scoreFile.write(score + " Points");
            scoreFile.write("\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}