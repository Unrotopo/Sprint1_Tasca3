package Nivell1.Exercici3.utils;

import java.util.*;

public class GameManager {

    private final Scanner sc = new Scanner(System.in);
    private int score = 0;
    private String playerName;
    private final FileManager fileManager;
    private final Map<String, String> countriesMap;

    public GameManager(FileManager fileManager) {
        this.fileManager = fileManager;
        this.countriesMap = fileManager.fileToMap();
        start();
    }

    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void start() {
        System.out.println("Enter player name:");
        playerName = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            Map.Entry<String, String> country = getCountry();
            System.out.println("What is the capital of " + country.getKey() + "?");
            String answer = sc.nextLine();

            if (answer.equals(country.getValue())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }

        assert fileManager != null;
        fileManager.scoreToFile(getScore(), playerName);
        System.out.println("Game over!\nTotal score: " + score + "\nYour score has been saved!");
    }

    public Map.Entry<String, String> getCountry() {
        try {
            List<Map.Entry<String, String>> entries = new ArrayList<>(countriesMap.entrySet());
            Random random = new Random();

            return entries.get(random.nextInt(entries.size()));

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } return null;
    }
}
