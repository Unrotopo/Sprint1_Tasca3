package Nivell1.Exercici3.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileManager {

    private static String filePath;
    private static final HashMap<String, String> countriesCapitals = new HashMap<>();

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public static String getFilePath() {
        return filePath;
    }

    public static Map<String, String> fileToMap() {
        try {
            File countriesFile = new File(getFilePath() + "countries.txt");
            Scanner countriesReader = new Scanner(countriesFile);
            while (countriesReader.hasNextLine()) {
                String country = countriesReader.nextLine().trim();
                if (country.isEmpty()) continue;
                countriesCapitals.put(country.split(" ")[0], country.split(" ")[1]);
            }
            countriesReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return countriesCapitals;
    }

    public static void scoreToFile() {
        int score = GameManager.getScore();
        String playerName = GameManager.getPlayerName();
        try{
            FileWriter scoreFile = new FileWriter(getFilePath() + "classification.txt");
            scoreFile.write(playerName + ": ");
            scoreFile.write(score + " Points");
            scoreFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}