package co.edu.ucc.todolist_jaledaor.dominio;

import java.util.List;

import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

/**
 * Created by ADMIN on 12/09/2017.
 */

public interface ILtarea {

    void addTarea(Tarea tarea);

     List<Tarea> getTareas();

}
