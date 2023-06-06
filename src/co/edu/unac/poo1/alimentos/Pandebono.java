package co.edu.unac.poo1.alimentos;

import co.edu.unac.poo1.procesos.Madurados;

public class Pandebono implements Madurados {
    protected String nombre;
    protected Float tamaho;
    protected String sabor;
     protected Float precio;

    public Pandebono() {
    }

    public Pandebono(String nombre, Float tamaho, String sabor, Float precio) {
        this.nombre = nombre;
        this.tamaho = tamaho;
        this.sabor = sabor;
        this.precio = precio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTamaho() {
        return tamaho;
    }

    public void setTamaho(Float tamaho) {
        this.tamaho = tamaho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public boolean tostar() {
        return false;
    }

    @Override
    public boolean hornear() {
        return false;
    }
}
