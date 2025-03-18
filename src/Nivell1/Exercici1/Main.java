package Nivell1.Exercici1;

import Nivell1.Exercici1.objects.Month;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7, new Month("August"));

        System.out.println("----- ArrayList 12 months -----");
        for (Month month : months) {
            System.out.println(month.getName());
        }

        months.add(months.get(0));
        months.add(months.get(1));

        System.out.println("\n----- ArrayList 14 months -----");
        for (Month month : months) {
            System.out.println(month.getName());
        }

        HashSet<Month> uniqueMonths = new HashSet<>(months);

        System.out.println("\n----- HashSet uniqueMonths -----");
        for (Month month : uniqueMonths) {
            System.out.println(month.getName());
        }
    }
}
