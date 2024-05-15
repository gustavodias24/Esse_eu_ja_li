package benicio.solutions.esseeujli.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import benicio.solutions.esseeujli.R;
import benicio.solutions.esseeujli.activity.ExibirUsuarioActivity;
import benicio.solutions.esseeujli.model.UsuarioModel;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuariOViewHodler> {

    List<UsuarioModel> lista;
    Activity c;

    public AdapterUsuario(List<UsuarioModel> lista, Activity c) {
        this.lista = lista;
        this.c = c;
    }

    @NonNull
    @Override
    public UsuariOViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UsuariOViewHodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_usuario, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull UsuariOViewHodler holder, int position) {
        UsuarioModel usuarioModel = lista.get(position);

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(c, ExibirUsuarioActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.putExtra("user", usuarioModel);
            c.startActivity(i);
        });


        holder.text.setText(usuarioModel.getNome() + "\n" + usuarioModel.getPontos());

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class UsuariOViewHodler extends RecyclerView.ViewHolder {

        TextView text;

        public UsuariOViewHodler(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text_nome_user);
        }
    }
}
