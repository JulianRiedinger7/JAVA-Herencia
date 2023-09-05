package Entities;

public abstract class Edificio {
    protected Double ancho, alto, largo;

    public Edificio() {}


    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }


    public Double getAncho() {
        return this.ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return this.alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return this.largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

}
