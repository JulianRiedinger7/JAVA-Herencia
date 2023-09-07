package Entities;

import Enums.EstadoCivil;

public final class Estudiante extends Persona {
    private String curso;

    public Estudiante() {}

    public Estudiante(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, String curso) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante [curso=" + curso + "]";
    }

    
}
