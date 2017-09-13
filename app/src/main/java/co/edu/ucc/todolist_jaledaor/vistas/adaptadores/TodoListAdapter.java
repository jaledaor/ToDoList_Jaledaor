package co.edu.ucc.todolist_jaledaor.vistas.adaptadores;

import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.edu.ucc.todolist_jaledaor.R;
import co.edu.ucc.todolist_jaledaor.modelo.Tarea;

/**
 * Created by ADMIN on 12/09/2017.
 */

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ItemTodoList>{

    private List<Tarea> dataset;

    public TodoListAdapter(List<Tarea> dataset){
        super();
        this.dataset=dataset;
    }
    @Override
    public ItemTodoList onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ItemTodoList holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ItemTodoList extends RecyclerView.ViewHolder{

        @BindView(R.id.chkTarea)
        private AppCompatCheckBox chkTarea;

        @BindView(R.id.tvTarea)
        TextView tvTarea;

        public ItemTodoList(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }

    }
}
