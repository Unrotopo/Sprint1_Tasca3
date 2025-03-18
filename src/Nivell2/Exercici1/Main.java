package Nivell2.Exercici1;

import Nivell2.Exercici1.objects.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restaurantSet = new HashSet<>();

        restaurantSet.add(new Restaurant("CalPepe", 3));
        restaurantSet.add(new Restaurant("CalPepe", 4));
        restaurantSet.add(new Restaurant("CalPepe", 3));

        for (Restaurant restaurant : restaurantSet) {
            System.out.println(restaurant);
        }
    }
}
