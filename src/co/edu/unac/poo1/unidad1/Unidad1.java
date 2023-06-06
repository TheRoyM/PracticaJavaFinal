package co.edu.unac.poo1.unidad1;

import co.edu.unac.poo1.Unidad2;

import java.util.Scanner;

public class Unidad1 {
    private static final int  MAXIMA_OPCION_MENU = 4;

    public static void menuPrincipal() {
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPor favor digite una opcion:");
            System.out.println("---------------------------UNIDAD 2---------------------------");
            System.out.println("1. Archivo Plano Cafes");
            System.out.println("2. Sin definir");
            System.out.println("3. Sin definir");
            System.out.println("4. Sin definir");

            System.out.println(MAXIMA_OPCION_MENU + ". Salir de la aplicacion");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1 -> Unidad2.mostrarArchivoPlanoCafes();
                case 2 -> System.out.println("Por definir #2");
                case 3 -> System.out.println("Por definir #3");
                case MAXIMA_OPCION_MENU -> System.out.println("Hasta pronto");
                default -> System.err.println("ERROR: Opcion invalida");
            }
        } while (opcionMenu != MAXIMA_OPCION_MENU);
    }
}
