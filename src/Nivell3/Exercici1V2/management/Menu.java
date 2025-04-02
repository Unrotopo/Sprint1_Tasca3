package Nivell3.Exercici1V2.management;

import Nivell3.Exercici1V2.comparator.PersonComparator;
import Nivell3.Exercici1V2.objects.Person;

import java.util.*;

import static Nivell3.Exercici1V2.management.SetManager.*;

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
                    setToString(SetManager.sortedSet(fromCSVToPersons(), PersonComparator.NAME));
                    break;
                case 3:
                    setToString(SetManager.reversedSortedSet(fromCSVToPersons(), PersonComparator.NAME));
                    break;
                case 4:
                    setToString(SetManager.sortedSet(fromCSVToPersons(), PersonComparator.SURNAME));
                    break;
                case 5:
                    setToString(SetManager.reversedSortedSet(fromCSVToPersons(), PersonComparator.SURNAME));
                    break;
                case 6:
                    setToString(SetManager.sortedSet(fromCSVToPersons(), PersonComparator.ID));
                    break;
                case 7:
                    setToString(SetManager.reversedSortedSet(fromCSVToPersons(), PersonComparator.ID));
                    break;
            }
        } while (option != 0);
    }

    public List<Person> fromCSVToPersons() {
        return personManager.reconstructPersons(csvManager.CSVToList(CSVManager.filePathCsv));
    }
}
