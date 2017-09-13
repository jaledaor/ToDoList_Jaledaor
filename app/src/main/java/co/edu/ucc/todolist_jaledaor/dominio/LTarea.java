package co.edu.ucc.todolist_jaledaor.dominio;

import java.util.ArrayList;
import java.util.List;

import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

/**
 * Created by ADMIN on 05/09/2017.
 */

public class LTarea implements ILtarea {

    private static List<Tarea> lstTarea= new ArrayList<>();

    @Override
    public void addTarea(Tarea tarea) {
    lstTarea.add(tarea);
    }

    @Override
    public List<Tarea> getTareas(){
        return lstTarea;
    }
}
