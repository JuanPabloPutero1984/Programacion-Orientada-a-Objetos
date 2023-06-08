
package Entidades;


public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int carga, double peso, double precio, char consumo, String color) {
        super(peso, precio, consumo, color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    
}
