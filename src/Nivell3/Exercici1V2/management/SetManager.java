package Nivell3.Exercici1V2.management;

import Nivell3.Exercici1V2.objects.Person;

import java.util.*;

public class SetManager {

    public static TreeSet<Person> sortedSet (List<Person> people, Comparator compareBy) {
        TreeSet<Person> set = new TreeSet<>(compareBy);
        set.addAll(people);
        return set;
    }

    public static NavigableSet<Person> reversedSortedSet (List<Person> people, Comparator compareBy) {
        TreeSet<Person> set = new TreeSet<>(compareBy);
        set.addAll(people);
        return set.descendingSet();
    }

    public static void setToString(Set<Person> persons) {
        System.out.println("\n__Name__ __Surname__ __ID__");
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("\n");
    }
}
