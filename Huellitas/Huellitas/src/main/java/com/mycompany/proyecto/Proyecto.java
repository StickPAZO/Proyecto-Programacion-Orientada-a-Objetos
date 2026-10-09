package com.mycompany.proyecto;

import java.util.Scanner;

/** Punto de entrada del proyecto. La logica se implementara en futuros avances. */
public class Proyecto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("             SISTEMA HUELLITAS");
            System.out.println("========================================");
            System.out.println("1. Gestionar adoptantes");
            System.out.println("2. Gestionar mascotas");
            System.out.println("3. Gestionar salud");
            System.out.println("4. Evaluar compatibilidad");
            System.out.println("5. Gestionar solicitudes");
            System.out.println("6. Gestionar adopciones");
            System.out.println("7. Gestionar rescates");
            System.out.println("8. Gestionar refugio");
            System.out.println("9. Gestionar inventario");
            System.out.println("10. Gestionar eventos");
            System.out.println("11. Gestionar infraestructura");
            System.out.println("12. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Modulo pendiente de implementacion.");
                    break;
            }

        } while (opcion != 0);

        teclado.close();
    }
}
