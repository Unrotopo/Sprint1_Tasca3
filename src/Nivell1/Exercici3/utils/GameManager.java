package Nivell1.Exercici3.utils;

import java.util.*;

public class GameManager {

    static Scanner sc = new Scanner(System.in);
    private static int score = 0;
    private static String playerName;

    public GameManager() {
        start();
    }

    public static int getScore() {
        return score;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void start() {
        System.out.println("Enter player name:");
        playerName = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            Map.Entry<String, String> country = getCountry();
            System.out.println("What is the capital of " + country.getKey() + "?");
            System.out.println(country.getValue());
            String answer = sc.nextLine();
            if (answer.equals(country.getValue())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
        FileManager.scoreToFile();
        System.out.println("Game over!\nTotal score: " + score + "\nYour score has been saved!");
    }

    public static Map.Entry<String, String> getCountry() {
        Map<String, String> countriesMap = FileManager.fileToMap();
        List<Map.Entry<String, String>> entries = new ArrayList<>(countriesMap.entrySet());
        Random random = new Random();
        return entries.get(random.nextInt(entries.size()));
    }
}
