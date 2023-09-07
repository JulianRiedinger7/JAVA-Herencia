package Comparators;

import java.util.Comparator;

import Entities.Hotel;

public class Comparators {
    public static Comparator<Hotel> ordenarPrecioDesc = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecioHabitaciones().compareTo(o1.getPrecioHabitaciones());
        }

    };
}
