package Entities;

public final class Camping extends AlojamientoExtraHotelero {
    private Integer capacidadCarpas, cantBanios;
    private boolean restaurante;

    public Camping() {}


    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado,
            Double metrosCuadrados, Integer capacidadCarpas, Integer cantBanios, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }



    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }


    @Override
    public String toString() {
        return super.toString() + " Camping [capacidadCarpas=" + capacidadCarpas + ", cantBanios=" + cantBanios + ", restaurante="
                + restaurante + "]";
    }

    

    
}
