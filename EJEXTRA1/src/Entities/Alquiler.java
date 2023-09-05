package Entities;

import java.time.LocalDate;

public final class Alquiler {
    private String nombre, posicion;
    private Integer documento;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private Barco barco;

    public Alquiler() {}

    public Alquiler(String nombre, String posicion, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Barco barco) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getDocumento() {
        return this.documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return this.barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double costoAlquiler() {
        int diasOcupacion = (int) (fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay());
        double moduloNormal = barco.getEslora() * 10;

        double alquiler = diasOcupacion * moduloNormal;

        if(barco instanceof Velero) {
            System.out.println("Es un Velero");
            alquiler += ((Velero) barco).getMastiles();
        } else if (barco instanceof BarcoMotor) {
            System.out.println("Es un barco a motor");
            alquiler += ((BarcoMotor) barco).getPotencia();
        } else if (barco instanceof Yate) {
            System.out.println("Es un Yate");
            alquiler += ((Yate) barco).getCamarotes() + ((Yate) barco).getPotencia();
        } else {
            System.out.println("Es un barco normal");
        }

        return alquiler;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", posicion='" + getPosicion() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", fechaAlquiler='" + getFechaAlquiler() + "'" +
            ", fechaDevolucion='" + getFechaDevolucion() + "'" +
            ", barco='" + getBarco() + "'" +
            "}";
    }

}
