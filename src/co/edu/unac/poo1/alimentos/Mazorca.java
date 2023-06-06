package co.edu.unac.poo1.alimentos;

import co.edu.unac.poo1.procesos.Madurados;

public class Mazorca implements Madurados {
    private Integer totalGranos;
    private Float precio;
    private Float pesoGramo;
    private String color;

    public Mazorca() {
    }

    public Mazorca(Integer totalGranos, Float precio, Float pesoGramo, String color) {
        this.totalGranos = totalGranos;
        this.precio = precio;
        this.pesoGramo = pesoGramo;
        this.color = color;
    }

    public Integer getTotalGranos() {
        return totalGranos;
    }

    public void setTotalGranos(Integer totalGranos) {
        this.totalGranos = totalGranos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getPesoGramo() {
        return pesoGramo;
    }

    public void setPesoGramo(Float pesoGramo) {
        this.pesoGramo = pesoGramo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
