package Entities;

import Enums.TipoInstalacion;

public final class Polideportivo extends Edificio {

    private String nombre;
    private TipoInstalacion instalacion;

    public Polideportivo() {}


    public Polideportivo(Double ancho, Double alto, Double largo, String nombre, TipoInstalacion instalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getInstalacion() {
        return this.instalacion;
    }

    public void setInstalacion(TipoInstalacion instalacion) {
        this.instalacion = instalacion;
    }   

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }
    
}
