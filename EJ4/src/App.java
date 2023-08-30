import Entities.Circulo;
import Entities.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangulo r = new Rectangulo(10.5d, 5d);
        Circulo c = new Circulo(7.5d);

        System.out.println("Area rectangulo: " + r.calcularArea());
        System.out.println("Perimetro rectangulo " + r.calcularPerimetro());

        System.out.println("Area circulo: " + c.calcularArea());
        System.out.println("Perimetro circulo " + c.calcularPerimetro());

    }
}
