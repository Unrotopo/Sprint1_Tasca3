package Nivell3.Exercici1.management;

import Nivell3.Exercici1.comparators.*;
import Nivell3.Exercici1.objects.Person;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetManager {

    public static SortedSet<Person> getSetNameAscending(ArrayList<Person> persons) {
        SortedSet<Person> setNameAscending = new TreeSet<>(new PersonComparatorNameSurnameIdAscending());
        setNameAscending.addAll(persons);
        return setNameAscending;
    }

    public static SortedSet<Person> getSetNameDescending(ArrayList<Person> persons) {
        SortedSet<Person> setNameDescending = new TreeSet<>(new PersonComparatorNameSurnameIdDescending());
        setNameDescending.addAll(persons);
        return setNameDescending;
    }

    public static SortedSet<Person> getSetIdAscending(ArrayList<Person> persons) {
        SortedSet<Person> setIdAscending  = new TreeSet<>(new PersonComparatorIdSurnameNameAscending());
        setIdAscending.addAll(persons);
        return setIdAscending;
    }

    public static SortedSet<Person> getSetIdDescending(ArrayList<Person> persons) {
        SortedSet<Person> setIdDescending = new TreeSet<>(new PersonComparatorIdSurnameNameDescending());
        setIdDescending.addAll(persons);
        return setIdDescending;
    }

    public static SortedSet<Person> getSetSurnameAscending(ArrayList<Person> persons) {
        SortedSet<Person> setSurnameAscending = new TreeSet<>(new PersonComparatorSurnameNameIdAscending());
        setSurnameAscending.addAll(persons);
        return setSurnameAscending;
    }

    public static SortedSet<Person> getSetSurnameDescending(ArrayList<Person> persons) {
        SortedSet<Person> setSurnameDescending = new TreeSet<>(new PersonComparatorSurnameNameIdDescending());
        setSurnameDescending.addAll(persons);
        return setSurnameDescending;
    }


    public static void setToString(SortedSet<Person> persons) {
        System.out.println("\n__Name__ __Surname__ __ID__");
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("\n");
    }
}
