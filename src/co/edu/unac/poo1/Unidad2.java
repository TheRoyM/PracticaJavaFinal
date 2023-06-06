package co.edu.unac.poo1;

import co.edu.unac.poo1.alimentos.*;
import co.edu.unac.poo1.procesos.Madurados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import java.util.stream.Stream;

public class Unidad2 {
    private static final String RUTA_ARCHIVO_CAFES = "C:\\Users\\RoyMR\\Documents\\practicaFinalPOO\\src\\co\\edu\\unac\\poo1\\alimentos\\cafe.txt";


    //PUNTO 1-------------
    //Mostrar archivo plano y ordeno por Serial
    public static void mostrarArchivoPlanoCafes(){
        List<Cafe> cafeList = leerArchivoPlanoCafes();
        cafeList.sort(Comparator.comparing(Cafe::getSerial));
        for (Cafe cafe: cafeList){
            System.out.println(cafe);
        }
    }


    public static List<Cafe> leerArchivoPlanoCafes() {
        Stream<String> lines = null;
        Path pathArchvioPlano = Paths.get(RUTA_ARCHIVO_CAFES);
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        try {
            lines = Files.lines(pathArchvioPlano);
            List<String> datos = lines.toList();
            for (String dato : datos) {
                Cafe nuevoCafe = Cafe.procesarLineaArchivoPlano(dato);
                listaCafes.add(nuevoCafe);
            }
        } catch (IOException ioex){
            System.err.println("Error de IO al leer el archivo plano " + ioex.getMessage());
        } finally {
            assert lines != null;
            lines.close();
        }
        return listaCafes;
    }

    public static void verMapaMadurados(){
        Map<Float, Madurados> mapaProductos = new HashMap<>();
        Mazorca mazorca1 = new Mazorca(1000,567.90F,2.5F,"Amarillo");
        Mazorca mazorca2 = new Mazorca(1000,567.90F,2.5F,"Amarillo");
        Mazorca mazorca3 = new Mazorca(1000,567.90F,2.5F,"Amarillo");
        Mazorca mazorca4 = new Mazorca(1000,567.90F,2.5F,"Amarillo");

        Cafe cafe1 =new Cafe("Juan Valdez",5.2F,"Suave",17.550F,"a1",5,20,"Bourbon");


        Pandebono pandebono1 = new Pandebono("Cascarita",5.0F,"Dulce",500.0F);
        Pandebono pandebono2 = new Pandebono("Rollo",6.0F,"Dulce",800.0F);
        Pandebono pandebono3 = new Pandebono("Bolillo",10.0F,"Salado",1500.0F);
        Pandebono pandebono4 = new Pandebono("Cascarita",5.0F,"Dulce",500.0F);

        mapaProductos.put(mazorca1.getPrecio(),mazorca1);
        mapaProductos.put(mazorca2.getPrecio(),mazorca2);
        mapaProductos.put(mazorca3.getPrecio(),mazorca3);
        mapaProductos.put(mazorca4.getPrecio(),mazorca4);



    }

}
