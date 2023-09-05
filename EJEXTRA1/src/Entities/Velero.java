package Entities;

public final class Velero extends Barco {
    private Integer mastiles;

    public Velero() {}


    public Velero(Integer mastiles, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }


    public Integer getMastiles() {
        return this.mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }


}
