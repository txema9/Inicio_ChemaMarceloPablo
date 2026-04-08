package app;

import service.GestorTareas;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce descripción: ");
                    String descripcion = sc.nextLine();
                    gestor.añadirTarea(descripcion);
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 3:
                    if (!gestor.hayTareas()) {
                        System.out.println("No hay tareas.");
                        break;
                    }
                    gestor.mostrarTareas();
                    System.out.print("Número de tarea: ");
                    int completar = sc.nextInt();
                    gestor.completarTarea(completar - 1);
                    break;

                case 4:
                    if (!gestor.hayTareas()) {
                        System.out.println("No hay tareas.");
                        break;
                    }
                    gestor.mostrarTareas();
                    System.out.print("Número de tarea: ");
                    int eliminar = sc.nextInt();
                    gestor.eliminarTarea(eliminar - 1);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1. Añadir tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Completar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");
        System.out.print("Selecciona opción: ");
    }
}