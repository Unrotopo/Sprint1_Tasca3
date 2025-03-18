package Nivell2.Exercici1.objects;

import java.util.Objects;

public class Restaurant {

    private final String name;
    private final int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return "Restaurant name: "+ name + " - Rating: " + rating + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(name, that.name) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }
}
