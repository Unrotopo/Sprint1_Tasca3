package Nivell3.Exercici1.utils;

import java.util.Scanner;

import static Nivell3.Exercici1.utils.CSVManager.filePathCsv;
import static Nivell3.Exercici1.utils.CSVManager.readLine;
import static Nivell3.Exercici1.utils.PersonManager.addPerson;
import static Nivell3.Exercici1.utils.PersonManager.reconstructPersons;
import static Nivell3.Exercici1.utils.SetManager.*;

public class Menu {

    public static void menu() {
        int option;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    ----- Menu -----
                    1. Enter person data
                    2. Show persons data by name (A-Z)
                    3. Show persons data by name (Z-A)
                    4. Show persons data by surname (A-Z)
                    5. Show persons data by surname (Z-A)
                    6. Show persons data by Id (A-Z)
                    7. Show persons data by Id (Z-A)
                    0. Exit
                    """);
            System.out.println("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    setToString(getSetNameAscending(reconstructPersons(readLine(filePathCsv))));
                    break;
                case 3:
                    setToString(getSetNameDescending(reconstructPersons(readLine(filePathCsv))));
                    break;
                case 4:
                    setToString(getSetSurnameAscending(reconstructPersons(readLine(filePathCsv))));
                    break;
                case 5:
                    setToString(getSetSurnameDescending(reconstructPersons(readLine(filePathCsv))));
                    break;
                case 6:
                    setToString(getSetIdAscending(reconstructPersons(readLine(filePathCsv))));
                    break;
                case 7:
                    setToString(getSetIdDescending(reconstructPersons(readLine(filePathCsv))));
                    break;
            }
        } while (option != 0);
    }
}
