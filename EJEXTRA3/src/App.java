import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Comparators.Comparators;
import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel;
import Entities.Hotel4Estrellas;
import Entities.Hotel5Estrellas;
import Entities.Residencia;
import Enums.Gimnasio;

public class App {
    static final List<Alojamiento> alojamientos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        alojamientos.add(new Hotel4Estrellas("Hotel 4", "EEUU", "New Jersey", "John cena", 10, 100, 5, null,
                Gimnasio.TIPO_B, "Crustaceo cascarudo", 35));
        alojamientos.add(new Hotel5Estrellas("Luxor", "EEUU", "Las Vegas", "Chris Angel", 20, 200, 15, null,
                Gimnasio.TIPO_A, "PROREUS", 40, 5, 3, 10));
        alojamientos.add(new Camping("Camping 1", "Argentina", "Bahia Blanca", "Julian", false, 200d, 50, 3, false));
        alojamientos.add(new Camping("Camping 2", "Argentina", "Mendoza", "Juan", true, 300d, 100, 10, true));
        alojamientos.add(new Residencia("Residencia 1", "Chile", "Santiago", "Pedro", true, 400d, 10, false, true));
        alojamientos
                .add(new Residencia("Residencia 2", "Mexico", "New Mexico", "Carlos", false, 200d, 10, true, false));
    
        sistemaConsulta();
    }

    public static void sistemaConsulta() {
        Scanner input = new Scanner(System.in);

        int opcion;

        System.out.println("Bienvenido al sistema de consulta de Alojamientos");
        do {
            System.out.println(
                    "Elija una opcion: \n 1. Mostrar Alojamientos \n 2. Hoteles de mas caro a mas barato \n 3. Campings con restaurante \n 4. Residencias con descuento");
            opcion = Integer.parseInt(input.nextLine());
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                mostrarAlojamientos(alojamientos);
                break;
            case 2:
                ordernarHoteles(alojamientos);
                break;
            case 3:
                campingsConRestaurante(alojamientos);
                break;
            case 4:
                residenciasConDescuento(alojamientos);
                break;

            default:
                break;
        }

        input.close();
    }

    public static void mostrarAlojamientos(List<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
            System.out.println();
        }
    }

    public static void ordernarHoteles(List<Alojamiento> alojamientos) {
        List<Hotel> hoteles = new ArrayList<>();

        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Hotel5Estrellas) {
                Hotel5Estrellas hotel5 = (Hotel5Estrellas) alojamiento;

                hotel5.calcularPrecioHabitaciones();
                hoteles.add(hotel5);
                continue;
            } else if (alojamiento instanceof Hotel4Estrellas) {
                Hotel4Estrellas hotel4 = (Hotel4Estrellas) alojamiento;

                hotel4.calcularPrecioHabitaciones();
                hoteles.add(hotel4);
            }
        }

        Collections.sort(hoteles, Comparators.ordenarPrecioDesc);

        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
            System.out.println();
        }
    }

    public static void campingsConRestaurante(List<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;

                if(camping.isRestaurante()) {
                    System.out.println("Tiene Restaurante: ");
                    System.out.println(camping);
                }
            }
        }
    }

    public static void residenciasConDescuento(List<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;

                if(residencia.isDescuentoGremios()) {
                    System.out.println("Tiene descuento: ");
                    System.out.println(residencia);
                }
            }
        }
    }

}
