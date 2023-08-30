package Entities;

import Interfaces.CalculosFormas;

public final class Circulo implements CalculosFormas {

    private Double radio;

    public Circulo() {}

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return PI * (radio * radio);
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
}
