package Entities;

import Enums.EstadoCivil;

public abstract class Empleado extends Persona {
    
    protected Integer anioIncorporacion, numDespacho;

    public Empleado() {}    

    public Empleado(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, Integer anioIncorporacion,
            Integer numDespacho) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }


    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado [anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + "]";
    }


    
    
}
