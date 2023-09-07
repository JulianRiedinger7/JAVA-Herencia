package Entities;

import Enums.Departamento;
import Enums.EstadoCivil;

public final class Profesor extends Empleado {
    private Departamento departamento;

    public Profesor() {}

    public Profesor(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, Integer anioIncorporacion,
            Integer numDespacho, Departamento departamento) {
        super(nombre, apellido, id, estadoCivil, anioIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor [departamento=" + departamento + "]";
    }

    
}
