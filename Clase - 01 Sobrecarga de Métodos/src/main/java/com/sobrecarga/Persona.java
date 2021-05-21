package com.sobrecarga;

public class Persona {
    //Atributos
    private String curp;
    private String nombre;
    private int edad;
    private String email;
    private String direccion;

    //Contructor sobrecargado
    public Persona() {
        this.curp = "indefinido";
        this.nombre = "indefinido";
        this.edad = 0;
        this.email = "indefinido";
        this.direccion = "indefinido";
    }

    public Persona(String curp, String nombre, int edad, String email, String direccion) {
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
    }

    public Persona(String curp) {
        this.curp = curp;
        this.nombre = "indefinido";
        this.edad = 0;
        this.email = "indefinido";
        this.direccion = "indefinido";
    }
    // toString() 
    public String toString() {
        return "Persona:\n\tCURP: " + curp + "\n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tEmail: " + email + "\n\tDireccion: " + direccion;
    }


    public String toString(String titulo) {
        return titulo + "\nPersona:\n\tCURP: " + curp + "\n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tEmail: " + email + "\n\tDireccion: " + direccion;
    }
      
}

   