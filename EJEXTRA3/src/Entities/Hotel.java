package Entities;

public abstract class Hotel extends Alojamiento {
    protected Integer cantHabitaciones, numCamas, cantPisos;
    protected Double precioHabitaciones;

    public Hotel() {}

    public Hotel(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones,
            Integer numCamas, Integer cantPisos, Double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    protected abstract void calcularPrecioHabitaciones();

    @Override
    public String toString() {
        return super.toString() + " Hotel [cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos
                + ", precioHabitaciones=" + precioHabitaciones + "]";
    }     

    

}
