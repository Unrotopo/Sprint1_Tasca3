package Nivell3.Exercici1V2.comparator;

import Nivell3.Exercici1V2.objects.Person;
import java.util.Comparator;

public class PersonComparator {

    public static final Comparator<Person> NAME = Comparator.comparing(Person::getSurname)
            .thenComparing(Person::getSurname)
            .thenComparing(Person::getId);

    public static final Comparator<Person> SURNAME = Comparator.comparing(Person::getSurname)
            .thenComparing(Person::getName)
            .thenComparing(Person::getId);

    public static final Comparator<Person> ID = Comparator.comparing(Person::getId)
            .thenComparing(Person::getSurname)
            .thenComparing(Person::getName);

}
