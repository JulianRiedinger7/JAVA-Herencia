package Entities;

public final class EdificioDeOficinas extends Edificio {

    private Integer oficinas, personasPorOficina, pisos;

    public EdificioDeOficinas() {}


    public EdificioDeOficinas(Double ancho, Double alto, Double largo, Integer oficinas, Integer personasPorOficina, Integer pisos) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }


    public Integer getOficinas() {
        return this.oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonasPorOficina() {
        return this.personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getPisos() {
        return this.pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }


    @Override
    public double calcularSuperficie() {
        return ancho * largo * pisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo; 
    }

    public void cantPersonas() {
        int personasEdificio = oficinas * personasPorOficina;
        
        System.out.println("Entrarian " + personasEdificio + " personas en todo el edificio");
        System.out.println("Entrarian " + personasPorOficina + " personas en un piso");
    }
    
}
