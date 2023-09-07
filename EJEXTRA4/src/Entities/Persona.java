package Entities;

import Enums.EstadoCivil;

public abstract class Persona {
    protected String nombre, apellido;
    protected Integer id;
    protected EstadoCivil estadoCivil;

    public Persona() {}

    public Persona(String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil
                + "]";
    }
}
