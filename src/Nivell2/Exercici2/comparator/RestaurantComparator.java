package Nivell2.Exercici2.comparator;

import Nivell2.Exercici1.objects.Restaurant;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        if (o1.getName().equals(o2.getName())) {
            if (o1.getRating() < o2.getRating()) { return 1; }
            if (o1.getRating() > o2.getRating()) { return -1; }
            return 0;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
