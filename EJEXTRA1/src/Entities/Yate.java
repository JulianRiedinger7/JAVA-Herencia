package Entities;

public final class Yate extends Barco {
    private Integer potencia, camarotes;

    public Yate() {}

    public Yate(Integer potencia, Integer camarotes, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }


    public Integer getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getCamarotes() {
        return this.camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

} 
