package Nivell3.Exercici1.utils;

import java.util.Scanner;

import static Nivell3.Exercici1.utils.PersonManager.addPerson;

public class Menu {

    public static void menu() {
        int option;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    ----- Menu -----
                    1. Enter person data
                    2. Show person data by name (A-Z)
                    3. Show person data by name (Z-A)
                    4. Show person data by surname (A-Z)
                    5. Show person data by surname (Z-A)
                    6. Show person data by Id (A-Z)
                    7. Show person data by Id (Z-A)
                    0. Exit
                    """);
            System.out.println("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    addPerson();
                case 2:


            }

        } while (option != 0);
    }
}
