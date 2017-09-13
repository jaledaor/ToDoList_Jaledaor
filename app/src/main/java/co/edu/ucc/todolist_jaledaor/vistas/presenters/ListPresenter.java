package co.edu.ucc.todolist_jaledaor.vistas.presenters;

import java.util.List;

import co.edu.ucc.todolist_jaledaor.dominio.ILtarea;
import co.edu.ucc.todolist_jaledaor.dominio.LTarea;
import co.edu.ucc.todolist_jaledaor.modelo.Tarea;
import co.edu.ucc.todolist_jaledaor.vistas.IListView;

/**
 * Created by ADMIN on 12/09/2017.
 */

public class ListPresenter implements IListPresenter {

    private IListView view;
    private ILtarea ltarea;

    public ListPresenter(IListView view) {
        this.view = view;
        ltarea= new LTarea();
    }

    @Override
    public void addTarea(String descTarea) {
        Tarea objTarea= new Tarea();
        objTarea.setNombre(descTarea);
        objTarea.setRealizada(false);

        ltarea.addTarea(objTarea);
    }

    @Override
    public void obtenerTareas() {
        List<Tarea> lsTareas= ltarea.getTareas();
        view.mostrarListaTareas(lsTareas);
    }
}
