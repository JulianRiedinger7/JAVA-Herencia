import Entities.Lavadora;
import Entities.Televisor;

public class App {
    public static void main(String[] args) throws Exception {

        Lavadora l = new Lavadora();
        Televisor t = new Televisor();

        l.crearLavadora();
        t.crearTelevisor();

        l.precioFinal();
        t.precioFinal();

        System.out.println("LAVADORA: " + l);
        System.out.println("TELEVISOR " + t);

    }
}
