package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double peso;
    protected double precio;
    protected char consumo;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(double peso, double precio, char consumo, String color) {
        this.peso = peso;
        this.precio = precio;
        this.consumo = consumo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "peso=" + peso + ", precio=" + precio + ", consumo=" + consumo + ", color=" + color + '}';
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    
}
