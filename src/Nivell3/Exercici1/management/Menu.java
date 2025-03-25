package Nivell3.Exercici1.management;

import Nivell3.Exercici1.objects.Person;

import java.util.ArrayList;
import java.util.Scanner;

import static Nivell3.Exercici1.management.SetManager.*;

public class Menu {

    PersonManager personManager = new PersonManager();
    CSVManager csvManager = new CSVManager();

    public void menu() {
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
                    personManager.addPerson(csvManager);
                    break;
                case 2:
                    setToString(getSetNameAscending(fromCSVToPersons()));
                    break;
                case 3:
                    setToString(getSetNameDescending(fromCSVToPersons()));
                    break;
                case 4:
                    setToString(getSetSurnameAscending(fromCSVToPersons()));
                    break;
                case 5:
                    setToString(getSetSurnameDescending(fromCSVToPersons()));
                    break;
                case 6:
                    setToString(getSetIdAscending(fromCSVToPersons()));
                    break;
                case 7:
                    setToString(getSetIdDescending(fromCSVToPersons()));
                    break;
            }
        } while (option != 0);
    }

    public ArrayList<Person> fromCSVToPersons() {
        return personManager.reconstructPersons(csvManager.CSVToList(CSVManager.filePathCsv));
    }
}
