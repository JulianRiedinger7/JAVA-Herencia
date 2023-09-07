package Entities;

public abstract class AlojamientoExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected Double metrosCuadrados;

    public AlojamientoExtraHotelero() {}

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado,
            Double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }



    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + " AlojamientoExtraHotelero [privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + "]";
    }

    
}
