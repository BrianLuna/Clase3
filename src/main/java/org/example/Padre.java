package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Padre extends Persona{
    private List<Persona> hijos;

    public Padre(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        super(nombre, apellido, fechaDeNacimiento);
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(Persona nuevoHijo){

        if (nuevoHijo.getFechaDeNacimiento().isBefore(this.getFechaDeNacimiento())){
            throw new RuntimeException("No podés agregar como hijo de " + this.getNombre() + " a alguien que sea mayor");
        }

        this.hijos.add(nuevoHijo);
    }

    public List<Persona> getHijos() {
        return this.hijos;
    }
}
