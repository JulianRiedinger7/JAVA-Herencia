package Entities;

import Interfaces.CalculosFormas;

public final class Rectangulo implements CalculosFormas{

    private Double base, altura;

    public Rectangulo() {}

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
}
