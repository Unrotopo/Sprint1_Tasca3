package Nivell1.Exercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9, 10};

        List<Integer> list1 = new ArrayList<>(List.of(arr1));
        List<Integer> list2 = new ArrayList<>(List.of(arr2));

        list2.addAll(list1.reversed());

        System.out.println(list2);


    }
}