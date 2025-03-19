package Nivell3.Exercici1.comparators;

import Nivell3.Exercici1.objects.Person;

import java.util.Comparator;

public class PersonComparatorNameSurnameIdAscending implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().equals(o2.getSurname()) && o1.getName().equals(o2.getName())) {
            return o1.getId().compareTo(o2.getId());
        } else if (o1.getName().equals(o2.getName())) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
        return o1.getName().compareTo(o2.getName());
    }
}