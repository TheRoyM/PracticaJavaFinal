package co.edu.unac.poo1.alimentos;

import co.edu.unac.poo1.procesos.Madurados;

public class Cafe extends Pandebono implements Madurados {
    private String serial;
    private Integer altura;
    private Integer edad;

    private String variedad;

    public Cafe() {
        super();
    }

    public Cafe(String nombre, Float tamaho, String sabor, Float precio, String serial, Integer altura, Integer edad, String variedad) {
        super(nombre, tamaho, sabor, precio);
        this.serial = serial;
        this.altura = altura;
        this.edad = edad;
        this.variedad = variedad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
//Archivo plano

    public static Cafe procesarLineaArchivoPlano(String linea){
        Cafe cafe = new Cafe();
        String []lineaCafe = linea.split("\\|");
        String []lineaTexto = lineaCafe[0].split("SERIAL:");
        cafe.serial = lineaTexto[1];
        lineaTexto = lineaCafe[1].split("NOMBRE:");
        cafe.nombre = lineaTexto[1];
        lineaTexto = lineaCafe[2].split("ALTURA:");
        cafe.altura = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[3].split("EDAD:");
        cafe.edad = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[4].split("VARIEDAD:");
        cafe.variedad = lineaTexto[1];
        lineaTexto = lineaCafe[5].split("SABOR:");
        cafe.sabor = lineaTexto[1];
        lineaTexto = lineaCafe[6].split("TAMAÑO:");
        cafe.tamaho = Float.valueOf(lineaTexto[1]);

        return cafe;
    }

    @Override
    public String toString() {
        return "SERIAL='" + serial + '\'' +
                ", ALTURA=" + altura +
                ", EDAD=" + edad +
                ", VARIEDAD='" + variedad + '\'' +
                ", NOMBRE='" + nombre + '\'' +
                ", TAMAHO=" + tamaho +
                ", SABOR='" + sabor + '\'' +
                ", PRECIO=" + precio ;
    }


}