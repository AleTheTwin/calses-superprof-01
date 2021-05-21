package com.sobrecarga;

public class Carro {
    //Atributos
    private String estado;
    private String placa;
    private String modelo;
    private String marca;
    private String submarca;
    private Double precio;
    private Double kilometraje;

    public Carro(){
        //Contructor por defecto
    }
    //Carro nuevo
    public Carro(String placa, String modelo, String marca, String submarca, Double precio) {
        this.estado = "Nuevo";
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.submarca = submarca;
        this.precio = precio;
        this.kilometraje = 0.0;
    }
    //carro usado
    public Carro(String placa, String modelo, String marca, String submarca, Double precio, Double kilometraje) {
        this.estado = "usado";
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.submarca = submarca;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }
    
    //Métodos
    public void imprimirReporte() {
        String reporte = "";
        reporte += "Carro:";
        reporte += "\n\tEstado: " + this.getEstado();
        reporte += "\n\tPlaca: " + this.getPlaca();
        reporte += "\n\tModelo: " + this.getModelo();
        reporte += "\n\tMarca: " + this.getMarca();
        reporte += "\n\tSubmarca: " + this.getSubmarca();
        reporte += "\n\tPrecio: $" + String.valueOf(this.getPrecio());
        reporte += "\n\tKilometraje: " + String.valueOf(this.getKilometraje()) + "Km";
        System.out.println(reporte);
    }


    //Setters y getters
    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return this.submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    

    
}
