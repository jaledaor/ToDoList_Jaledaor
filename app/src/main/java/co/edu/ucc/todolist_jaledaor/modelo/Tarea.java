package co.edu.ucc.todolist_jaledaor.modelo;

/**
 * Created by ADMIN on 05/09/2017.
 */

public class Tarea {
    private String nombre;
    private boolean realizada;

    public Tarea() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
}
