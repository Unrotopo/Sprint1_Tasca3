package Nivell2.Exercici2;
import Nivell2.Exercici1.objects.Restaurant;
import Nivell2.Exercici2.comparator.RestaurantComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        SortedSet<Restaurant> orderedRestaurants = new TreeSet<>(new RestaurantComparator());

        orderedRestaurants.add(new Restaurant("ZutatoPizza", 9));
        orderedRestaurants.add(new Restaurant("CalBotero", 5));
        orderedRestaurants.add(new Restaurant("CalBotero", 7));
        orderedRestaurants.add(new Restaurant("ZutatoPizza", 8));
        orderedRestaurants.add(new Restaurant("CalBotero", 6));
        orderedRestaurants.add(new Restaurant("CalBotero", 5));
        orderedRestaurants.add(new Restaurant("AdegaPere", 7));
        orderedRestaurants.add(new Restaurant("AdegaPere", 5));


        for (Restaurant restaurant : orderedRestaurants) {
            System.out.println(restaurant);
        }
    }
}
