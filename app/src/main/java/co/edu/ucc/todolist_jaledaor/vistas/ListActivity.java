package co.edu.ucc.todolist_jaledaor.vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import co.edu.ucc.todolist_jaledaor.R;
import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

public class ListActivity extends AppCompatActivity implements IListView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnEnviarTarea)
    @Override
    public void clickAddtarea() {

    }

    @Override
    public void mostrarListaTareas(List<Tarea> lstarea) {

    }


    @Override
    public void actualizarItem(int posicion, boolean estado) {

    }
}
