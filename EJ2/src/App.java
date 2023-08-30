import java.util.ArrayList;
import java.util.List;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Lavadora l = new Lavadora();
         * Televisor t = new Televisor();
         * 
         * l.crearLavadora();
         * t.crearTelevisor();
         * 
         * l.precioFinal();
         * t.precioFinal();
         * 
         * System.out.println("LAVADORA: " + l);
         * System.out.println("TELEVISOR " + t);
         */

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Televisor(45, true, 500d, 30d, "azulado", "d"));
        electrodomesticos.add(new Lavadora(25d, 300d, 70d, "negro", "y"));
        electrodomesticos.add(new Lavadora(40d, 700d, 30d, "violeta", "c"));
        electrodomesticos.add(new Televisor(30, false, 500d, 50d, "rojo", "a"));

        double precioTelevisores = 0;
        double precioLavadoras = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();

            if (electrodomestico instanceof Televisor) {
                precioTelevisores += electrodomestico.getPrecio();
                System.out.println("TELEVISOR: ");
            } else {
                precioLavadoras += electrodomestico.getPrecio();
                System.out.println("LAVADORA: ");
            }
            System.out.println(electrodomestico);

        }

        System.out.println("El precio total de los televisores es: $" + precioTelevisores);
        System.out.println("El precio total de las lavadoras es: $" + precioLavadoras);
        System.out.println("El precio total de los electrodomesticos es: $" + (precioLavadoras + precioTelevisores));
    }
}
