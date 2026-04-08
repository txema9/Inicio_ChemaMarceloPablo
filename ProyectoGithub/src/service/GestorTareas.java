package service;

import model.Tarea;
import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> lista;

    public GestorTareas() {
        lista = new ArrayList<>();
    }

    // Añadir tarea
    public void añadirTarea(String descripcion) {
        lista.add(new Tarea(descripcion));
    }

    // Mostrar tareas
    public void mostrarTareas() {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }

    // Completar tarea
    public void completarTarea(int indice) {
        if (indice < 0 || indice >= lista.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        lista.get(indice).completar();
    }

    // Eliminar tarea
    public void eliminarTarea(int indice) {
        if (indice < 0 || indice >= lista.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        lista.remove(indice);
    }

    // Saber si hay tareas
    public boolean hayTareas() {
        return !lista.isEmpty();
    }
}