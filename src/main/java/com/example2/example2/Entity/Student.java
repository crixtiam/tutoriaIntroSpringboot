package com.example2.example2.Entity;

public class Student {
    Long id;
    String nombre;
    String edad;

    public Student(Long id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
