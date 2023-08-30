package Entities;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {
    private Integer pulgadas;
    private boolean sintonizador;
    private final Scanner input = new Scanner(System.in);

    public Televisor() {}


    public Televisor(Integer pulgadas, boolean sintonizador, Double precio, Double peso, String color, String consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }


    public Integer getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return this.sintonizador;
    }

    public boolean getSintonizador() {
        return this.sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        char opcion;

        System.out.println("Ingrese las pulgadas");        
        setPulgadas(Integer.parseInt(input.nextLine()));

        do {
            System.out.println("Tiene sintetizador TDT? s/n");
            opcion = input.nextLine().toLowerCase().charAt(0);
        } while (opcion != 's' && opcion != 'n');

        if(opcion == 's') {
            setSintonizador(true);
        } else {
            setSintonizador(false);
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if(pulgadas > 40) {
            Double aumento = getPrecio() * 0.3;
            setPrecio(getPrecio() + aumento);
        }

        if(sintonizador) setPrecio(getPrecio() + 500);
    }
    

    @Override
    public String toString() {
        return super.toString() + "{" +
            " pulgadas='" + getPulgadas() + "'" +
            ", sintonizador='" + isSintonizador() + "'" +
            "}";
    }
    

}
