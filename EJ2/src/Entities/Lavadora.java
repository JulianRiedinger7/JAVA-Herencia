package Entities;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {
    private Double carga;
    private final Scanner input = new Scanner(System.in);

    public Lavadora() {}

    public Lavadora(Double carga, Double precio, Double peso, String color, String consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Double getCarga() {
        return this.carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();

        System.out.println("Ingrese la carga ");
        setCarga(Double.parseDouble(input.nextLine()));
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga > 30) setPrecio(getPrecio() + 500);
    }  
    

    @Override
    public String toString() {
        return super.toString() + "{" +
            " carga='" + getCarga() + "'" +
            "}";
    }
    

}
