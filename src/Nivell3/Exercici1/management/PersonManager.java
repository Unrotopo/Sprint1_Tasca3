package Nivell3.Exercici1.management;

import Nivell3.Exercici1.objects.Person;

import java.util.*;

public class PersonManager {

    public void addPerson(CSVManager csvManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person name: ");
        String name = sc.nextLine();
        System.out.println("Enter person surname: ");
        String surname = sc.nextLine();
        System.out.println("Enter person id: ");
        String id = sc.nextLine();
        Person person = new Person(surname, name, id);
        csvManager.writeLine(person.getSurname(), person.getName(), person.getId());
    }

    public ArrayList<Person> reconstructPersons(ArrayList<String[]> listOfPersons) {
        ArrayList<Person> persons = new ArrayList<>();
        for (String[] listOfPerson : listOfPersons) {
            persons.add(new Person(listOfPerson[0], listOfPerson[1], listOfPerson[2]));
        }
        return persons;
    }
}
