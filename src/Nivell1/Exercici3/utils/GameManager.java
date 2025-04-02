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
        this.countriesMap = fileManager.getGameData();
        start();
    }

    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void start() {
        askPlayerName();
        for (int i = 0; i < 10; i++) {
            askQuestion();
        }
        endGame();
    }

    public void askPlayerName() {
        System.out.println("Enter player name:");
        playerName = sc.nextLine();
    }

    public void askQuestion() {
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

    public void endGame() {
        assert fileManager != null;
        fileManager.saveScores(getScore(), playerName);
        System.out.println("Game over!\nTotal score: " + score + "\nYour score has been saved!");
    }

    public Map.Entry<String, String> getCountry() {
        List<Map.Entry<String, String>> entries = new ArrayList<>(countriesMap.entrySet());

        if (entries.isEmpty()) {
            System.out.println("No countries found!");
            return null;
        }

        Random random = new Random();
        return entries.get(random.nextInt(entries.size()));
    }
}
