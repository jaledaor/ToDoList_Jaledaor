package co.edu.ucc.todolist_jaledaor.vistas;

import java.util.List;

import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

/**
 * Created by ADMIN on 12/09/2017.
 */

public interface IListView {

    void clickAddtarea();

    void refrescarListaTareas();

    void refrescarTarea(int posicion, boolean estado);

}
