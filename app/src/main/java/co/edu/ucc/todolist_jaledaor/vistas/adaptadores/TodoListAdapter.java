package co.edu.ucc.todolist_jaledaor.vistas.adaptadores;

import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.edu.ucc.todolist_jaledaor.R;

/**
 * Created by ADMIN on 12/09/2017.
 */

public class TodoListAdapter {

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
