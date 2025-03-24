package Nivell1.Exercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list1 = new ArrayList<>(List.of(arr1));
        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> listIterator = list1.listIterator(list1.size());
        while (listIterator.hasPrevious()) {
            list2.add(listIterator.previous());
        }

        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);


    }
}