
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;


public class LavadoraService extends ElectrodomesticoService {
    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ElectrodomesticoService es1 = new ElectrodomesticoService();
        Electrodomestico e1 = es1.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        int carga = leer.nextInt();
        return new Lavadora(carga, e1.getPeso(), e1.getPrecio(), e1.getConsumo(), e1.getColor());
    }
    
    

    @Override
    public double precioFinal(char consumo, double peso){
        if (true) {
            
        }
        return super.precioFinal(consumo, peso); //To change body of generated methods, choose Tools | Templates.
    }
    
}
