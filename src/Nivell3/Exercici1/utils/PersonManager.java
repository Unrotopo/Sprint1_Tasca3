package Nivell3.Exercici1.utils;

import Nivell3.Exercici1.objects.Person;
import static Nivell3.Exercici1.utils.CSVManager.writeLine;

import java.util.Scanner;

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
        System.out.println("Person added\n");
    }
}
