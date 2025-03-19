package Nivell3.Exercici1.comparators;

import Nivell3.Exercici1.objects.Person;

import java.util.Comparator;

public class PersonComparatorIdSurnameNameAscending implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().equals(o2.getSurname()) && o1.getId().equals(o2.getId())) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getId().equals(o2.getId())) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
        return o1.getId().compareTo(o2.getId());
    }
}