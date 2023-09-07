package Entities;

import Enums.EstadoCivil;
import Enums.Seccion;

public final class PersonalServicio extends Empleado {
    private Seccion seccion;

    public PersonalServicio() {}

    public PersonalServicio(String nombre, String apellido, Integer id, EstadoCivil estadoCivil,
            Integer anioIncorporacion, Integer numDespacho, Seccion seccion) {
        super(nombre, apellido, id, estadoCivil, anioIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + " PersonalServicio [seccion=" + seccion + "]";
    }

    
}
