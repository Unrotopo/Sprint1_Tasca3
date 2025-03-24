package Nivell1.Exercici3;

import Nivell1.Exercici3.utils.FileManager;
import Nivell1.Exercici3.utils.GameManager;

public class Main {
    public static void main(String[] args) {

        String filePath = "src/Nivell1/Exercici3/resources/";

        FileManager fileManager = new FileManager(filePath);
        GameManager gameManager = new GameManager(fileManager);

    }
}
