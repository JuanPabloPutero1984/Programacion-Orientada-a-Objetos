
package Entidades;


public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean tdt;

    public Televisor(int resolucion, boolean tdt, double peso, double precio, char consumo, String color) {
        super(peso, precio, consumo, color);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    
    public Televisor() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }

}
