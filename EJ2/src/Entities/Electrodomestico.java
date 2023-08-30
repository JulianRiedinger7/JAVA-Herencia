package Entities;

import java.util.Scanner;

public abstract class Electrodomestico {
    protected Double precio, peso;
    protected String color, consumoEnergetico;
    private final Scanner input = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, String consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico.charAt(0));
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    protected void comprobarConsumoEnergetico(char letra) {
        if (Character.toUpperCase(letra) < 'A' || Character.toUpperCase(letra) > 'F') {
            this.consumoEnergetico = "F";
        } else {
            this.consumoEnergetico = String.valueOf(Character.toUpperCase(letra));
        }
    }

    protected void comprobarColor(String color) {
        String[] coloresValidos = { "blanco", "negro", "rojo", "azul", "gris" };
        boolean encontrado = false;

        for (String colorValido : coloresValidos) {
            if (colorValido.equalsIgnoreCase(color)) {
                this.color = color.toUpperCase();
                encontrado = true;
                break;
            }
        }

        if (!encontrado)
            this.color = "BLANCO";
    }

    protected void crearElectrodomestico() {
        System.out.println("Ingrese el color del electrodomestico: ");
        String color = input.nextLine();
        comprobarColor(color);

        System.out.println("Ingrese el consumo energetico: ");
        String consumoEnergetico = input.nextLine();
        comprobarConsumoEnergetico(consumoEnergetico.charAt(0));

        System.out.println("Ingrese el peso: ");
        setPeso(Double.parseDouble(input.nextLine()));

        setPrecio(1000d);

    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case "A":
                setPrecio(1000d);
                break;
            case "B":
                setPrecio(800d);
                break;
            case "C":
                setPrecio(600d);
                break;
            case "D":
                setPrecio(500d);
                break;
            case "E":
                setPrecio(300d);
                break;
            case "F":
                setPrecio(100d);
                break;

            default:
                break;
        }

        if (peso >= 1 && peso <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (peso >= 20 && peso <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (peso >= 50 && peso <= 79) {
            setPrecio(getPrecio() + 800);
        } else if (peso >= 80) {
            setPrecio(getPrecio() + 1000);
        }
    }


    @Override
    public String toString() {
        return "{" +
            " precio='" + getPrecio() + "'" +
            ", peso='" + getPeso() + "'" +
            ", color='" + getColor() + "'" +
            ", consumoEnergetico='" + getConsumoEnergetico() + "'" +
            "}";
    }


}
