package Entities;

public class Barco {
    protected String matricula;
    protected Double eslora;
    protected Integer anioFabricacion;

    public Barco() {}


    public Barco(String matricula, Double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return this.eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return this.anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", eslora='" + getEslora() + "'" +
            ", anioFabricacion='" + getAnioFabricacion() + "'" +
            "}";
    }

}
