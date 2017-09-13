package co.edu.ucc.todolist_jaledaor.vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import co.edu.ucc.todolist_jaledaor.R;
import co.edu.ucc.todolist_jaledaor.modelo.Tarea;
import co.edu.ucc.todolist_jaledaor.vistas.adaptadores.TodoListAdapter;
import co.edu.ucc.todolist_jaledaor.vistas.presenters.IListPresenter;
import co.edu.ucc.todolist_jaledaor.vistas.presenters.ListPresenter;

public class ListActivity extends AppCompatActivity implements IListView {

    private IListPresenter listPresenter;

    @BindView(R.id.rvListTODO)
    RecyclerView rvListTODO;

    @BindView(R.id.txtTarea)
    EditText txtTarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listPresenter = new ListPresenter(this);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvListTODO.setLayoutManager(llm);

        List<Tarea> lstTareas = listPresenter.obtenerTareas();
        rvListTODO.setAdapter(new TodoListAdapter(lstTareas));

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnEnviarTarea)
    @Override
    public void clickAddtarea() {
        String descTarea = txtTarea.getText().toString();
        listPresenter.addTarea(descTarea);
    }

    @Override
    public void refrescarListaTareas() {
        rvListTODO.getAdapter().notifyDataSetChanged();

        rvListTODO.scrollToPosition(rvListTODO.getAdapter().getItemCount() - 1);

        txtTarea.setText("");
    }

    @Override
    public void refrescarTarea(int posicion, boolean estado) {

    }


}
