package Entities;

public final class Residencia extends AlojamientoExtraHotelero {
    private Integer cantHabitaciones;
    private boolean descuentoGremios, campoDeportivo;

    public Residencia() {}

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado,
            Double metrosCuadrados, Integer cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + " Residencia [cantHabitaciones=" + cantHabitaciones + ", descuentoGremios=" + descuentoGremios
                + ", campoDeportivo=" + campoDeportivo + "]";
    }

    
}
