package Entities;

import Enums.Gimnasio;

public class Hotel4Estrellas extends Hotel {
    protected Gimnasio gim;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4Estrellas() {}

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones,
            Integer numCamas, Integer cantPisos, Double precioHabitaciones, Gimnasio gim, String nombreRestaurante,
            Integer capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitaciones);
        this.gim = gim;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Gimnasio getGim() {
        return gim;
    }

    public void setGim(Gimnasio gim) {
        this.gim = gim;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public void calcularPrecioHabitaciones() {
        double precio = 50 + (getCantHabitaciones() * getCantPisos());

        if(capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            precio += 30;
        } else if (capacidadRestaurante > 50) {
            precio += 50;
        } else {
            precio += 10;
        }

        if(gim == Gimnasio.TIPO_A) {
            precio += 50;
        } else {
            precio += 30;
        }

        setPrecioHabitaciones(precio);

    }

    @Override
    public String toString() {
        return super.toString() + " Hotel4Estrellas [gim=" + gim + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante="
                + capacidadRestaurante + "]";
    }
    
    
    
}
