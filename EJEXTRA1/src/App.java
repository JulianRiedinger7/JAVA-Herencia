import java.time.LocalDate;

import Entities.Alquiler;
import Entities.Barco;
import Entities.BarcoMotor;
import Entities.Velero;
import Entities.Yate;

public class App {
    public static void main(String[] args) throws Exception {

        Barco barco = new Barco("ABC 123", 10d, 2015);
        BarcoMotor barcoMotor = new BarcoMotor(500, "BCD 123", 5d, 2020);
        Velero velero = new Velero(5, "ASD 213", 7d, 2023);
        Yate yate = new Yate(1000, 5, "HOL 456", 20d, 2021);

        Alquiler alq1 = new Alquiler("Alquiler 1", "atras", 123123123, LocalDate.of(2023, 5, 2),
                LocalDate.of(2023, 6, 10), barcoMotor);

        Alquiler alq2 = new Alquiler("Alquiler 2", "atras", 123123123, LocalDate.of(2023, 7, 20),
                LocalDate.of(2023, 8, 1), barco);

        Alquiler alq3 = new Alquiler("Alquiler 3", "atras", 123123123, LocalDate.of(2023, 5, 2),
                LocalDate.of(2023, 6, 29), velero);

        Alquiler alq4 = new Alquiler("Alquiler 4", "atras", 123123123, LocalDate.of(2023, 10, 10),
                LocalDate.of(2023, 10, 15), yate);


        System.out.println("Costo Alq 1: " + alq1.costoAlquiler());
        System.out.println();
        System.out.println("Costo Alq 2: " + alq2.costoAlquiler());
        System.out.println();
        System.out.println("Costo Alq 3: " + alq3.costoAlquiler());
        System.out.println();
        System.out.println("Costo Alq 4: " + alq4.costoAlquiler());

    }
}
