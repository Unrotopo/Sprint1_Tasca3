package Nivell3.Exercici1.comparators;

import Nivell3.Exercici1.objects.Person;

import java.util.Comparator;

public class PersonComparatorNameSurnameIdDescending implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().equals(o2.getSurname()) && o1.getName().equals(o2.getName())) {
            return o2.getId().compareTo(o1.getId());
        } else if (o1.getName().equals(o2.getName())) {
            return o2.getSurname().compareTo(o1.getSurname());
        }
        return o2.getName().compareTo(o1.getName());
    }
}