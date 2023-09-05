package Entities;

public final class BarcoMotor extends Barco {
    private Integer potencia;

    public BarcoMotor() {}

    public BarcoMotor(Integer potencia, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }


    public Integer getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

}
