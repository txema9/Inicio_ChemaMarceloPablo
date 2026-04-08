package model;

public class Tarea {

    private String descripcion;
    private boolean completada;

    // Constructor
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Método para marcar como completada
    public void completar() {
        this.completada = true;
    }

    // Representación en texto
    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return estado + " " + descripcion;
    }
}