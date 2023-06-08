package Servicio;

import Entidades.Electrodomestico;

import java.util.Scanner;

public class ElectrodomesticoService {

    public void comprobarConsumoEnergetico(char l) {
        if (l != 'A' || l != 'B' || l != 'C' || l != 'D' || l != 'E' || l != 'F') {
            l = 'F';
        }
    }

    public void comprobarColor(String c) {
        c = c.toUpperCase();
        if (!c.equals("BLANCO") || !c.equals("NEGRO") || !c.equals("ROJO") || !c.equals("AZUL") || !c.equals("GRIS")) {
            c = "BLANCO";
        }
    }

    public double precioFinal(char consumo, double peso) {
        double pf = 0;
        switch (consumo) {
            case 'A':
                pf = 1000;
                break;
            case 'B':
                pf = 800;
                break;
            case 'C':
                pf = 600;
                break;
            case 'D':
                pf = 500;
                break;
            case 'E':
                pf = 300;
                break;
            case 'F':
                pf = 100;
                break;

        }
        if (peso <= 19) {
            pf += 100;
        } else if (peso > 19 && peso < 50) {
            pf += 500;
        } else if (peso >= 50 && peso < 80) {
            pf += 800;
        } else if (peso >= 80) {
            pf += 1000;
        }
        return pf+1000;
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que color quiere");
        String color = leer.next();
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese el comsumo");
        char consumo = leer.next().charAt(0);
        double precio = precioFinal(consumo,peso);
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
        return new Electrodomestico(peso, precio, consumo, color);

    }

}
