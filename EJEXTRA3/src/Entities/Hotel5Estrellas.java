package Entities;

import Enums.Gimnasio;

public final class Hotel5Estrellas extends Hotel4Estrellas {
    private Integer cantSalones, cantSuites, cantLimosinas;

    public Hotel5Estrellas() {}

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones,
            Integer numCamas, Integer cantPisos, Double precioHabitaciones, Gimnasio gim, String nombreRestaurante,
            Integer capacidadRestaurante, Integer cantSalones, Integer cantSuites, Integer cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, gim,
                nombreRestaurante, capacidadRestaurante);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public void calcularPrecioHabitaciones() {
        super.calcularPrecioHabitaciones();

        double precioLimosinas = 15 * cantLimosinas;

        setPrecioHabitaciones(getPrecioHabitaciones() + precioLimosinas);
    }

    @Override
    public String toString() {
        return super.toString() + " Hotel5Estrellas [cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas="
                + cantLimosinas + "]";
    }
    
    
}
