package benicio.solutions.esseeujli.adapter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import benicio.solutions.esseeujli.R;
import benicio.solutions.esseeujli.activity.ExibirLivroActivity;
import benicio.solutions.esseeujli.model.LivroModel;

public class AdapterLivro extends RecyclerView.Adapter<AdapterLivro.LivroViewHolder> {

    List<LivroModel> lista;
    Activity a;

    public AdapterLivro(List<LivroModel> lista, Activity a) {
        this.lista = lista;
        this.a = a;
    }

    @NonNull
    @Override
    public LivroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LivroViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_livro, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LivroViewHolder holder, int position) {
        LivroModel livro = lista.get(position);

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(a, ExibirLivroActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.putExtra("livro", livro);
            a.startActivity(i);
        });

        holder.titulo.setText(livro.getTitulo());
        Picasso.get().load(Uri.parse(livro.getFoto())).into(holder.imagem, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class LivroViewHolder extends RecyclerView.ViewHolder {

        ImageView imagem;
        TextView titulo;

        public LivroViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem = itemView.findViewById(R.id.img_livro);
            titulo = itemView.findViewById(R.id.title_livro);

        }
    }
}
