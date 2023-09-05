import java.util.ArrayList;
import java.util.List;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import Enums.TipoInstalacion;

public class App {
    public static void main(String[] args) throws Exception {

        List<Edificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo(5d, 50d, 20d, "Monumental", TipoInstalacion.ABIERTO));
        edificios.add(new EdificioDeOficinas(10d, 30d, 7d, 10, 7, 5));
        edificios.add(new Polideportivo(20d, 25d, 10d, "Bernabeu", TipoInstalacion.TECHADO));
        edificios.add(new EdificioDeOficinas(15d, 30d, 25d, 5, 10, 15));

        for (Edificio edificio : edificios) {

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                System.out.println(
                        "Es el polideportivo " + poli.getNombre() + " con instalacion " + poli.getInstalacion());
            } else {
                EdificioDeOficinas edo = (EdificioDeOficinas) edificio;
                System.out.println("Es un edificio de oficinas con " + edo.getPisos() + " pisos");
                edo.cantPersonas();
            }

            System.out.println("Tiene " + edificio.calcularSuperficie() + "m2 superficie");
            System.out.println("Tiene " + edificio.calcularVolumen() + "m3 volumen");
            System.out.println();

        }

    }
}
