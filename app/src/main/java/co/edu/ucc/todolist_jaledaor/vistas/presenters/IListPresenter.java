package co.edu.ucc.todolist_jaledaor.vistas.presenters;

import java.util.List;

import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

/**
 * Created by ADMIN on 12/09/2017.
 */

public interface IListPresenter {

    void addTarea(String descTarea);

    List<Tarea> obtenerTareas();
}
