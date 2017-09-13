package co.edu.ucc.todolist_jaledaor.vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import co.edu.ucc.todolist_jaledaor.R;
import co.edu.ucc.todolist_jaledaor.modelo.Tarea;
import co.edu.ucc.todolist_jaledaor.vistas.presenters.IListPresenter;
import co.edu.ucc.todolist_jaledaor.vistas.presenters.ListPresenter;

public class ListActivity extends AppCompatActivity implements IListView{

    private IListPresenter listPresenter;

    @BindView(R.id.rvListTODO)
    RecyclerView rvListTODO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listPresenter= new ListPresenter(this);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnEnviarTarea)
    @Override
    public void clickAddtarea() {

    }

    @Override
    public void refrescarListaTareas() {

    }

    @Override
    public void refrescarTarea(int posicion, boolean estado) {

    }


}
