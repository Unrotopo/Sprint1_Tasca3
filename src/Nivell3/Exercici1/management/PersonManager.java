package Nivell3.Exercici1.management;

import Nivell3.Exercici1.objects.Person;
import static Nivell3.Exercici1.management.CSVManager.writeLine;

import java.util.*;

public class PersonManager {

    public static void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person name: ");
        String name = sc.nextLine();
        System.out.println("Enter person surname: ");
        String surname = sc.nextLine();
        System.out.println("Enter person id: ");
        String id = sc.next();
        Person person = new Person(surname, name, id);
        writeLine(person.getSurname(), person.getName(), person.getId());
    }

    public static ArrayList<Person> reconstructPersons(ArrayList<String[]> listOfPersons) {
        ArrayList<Person> persons = new ArrayList<>();
        for (String[] listOfPerson : listOfPersons) {
            persons.add(new Person(listOfPerson[0], listOfPerson[1], listOfPerson[2]));
        }
        return persons;
    }
}
