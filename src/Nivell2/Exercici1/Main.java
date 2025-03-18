package Nivell2.Exercici1;

import Nivell2.Exercici1.objects.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restaurantSet = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("CalPepe", 3);
        Restaurant restaurant2 = new Restaurant("CalPepe", 4);
        Restaurant restaurant3 = new Restaurant("CalPepe", 3);

        restaurantSet.add(restaurant1);
        restaurantSet.add(restaurant2);
        restaurantSet.add(restaurant3);

        for (Restaurant restaurant : restaurantSet) {
            System.out.println(restaurant);
        }
    }
}
