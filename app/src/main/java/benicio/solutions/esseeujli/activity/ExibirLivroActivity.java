package benicio.solutions.esseeujli.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import benicio.solutions.esseeujli.R;
import benicio.solutions.esseeujli.adapter.SharedPrefUtils;
import benicio.solutions.esseeujli.databinding.ActivityExibirLivroBinding;
import benicio.solutions.esseeujli.databinding.ActivityMainBinding;
import benicio.solutions.esseeujli.model.LivroModel;
import benicio.solutions.esseeujli.util.WindowUtils;

public class ExibirLivroActivity extends AppCompatActivity {

    private ActivityExibirLivroBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityExibirLivroBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        WindowUtils.configWindow(this);

        LivroModel livro = (LivroModel) getIntent().getSerializableExtra("livro");

        Picasso.get().load(livro.getFoto()).into(mainBinding.imageLivro);
        mainBinding.titulo.setText(livro.getTitulo());
        StringBuilder descricaoCompleta = new StringBuilder();
        descricaoCompleta.append("Páginas: ").append(livro.getPaginas()).append("\n");
        descricaoCompleta.append("Gênero: ").append(livro.getGenero()).append("\n");
        descricaoCompleta.append("Descrição: ").append(livro.getDescricao());
        mainBinding.descri.setText(descricaoCompleta.toString());


        mainBinding.marcar.setOnClickListener(v -> {

            int pontos = SharedPrefUtils.returnPontos(this);

            Log.d("mayara", "pontos: " + pontos);

            int qtPaginas = 0;

            try {
                qtPaginas = Integer.parseInt(mainBinding.qtdPaginas.getText().toString()) / 72;
                Log.d("mayara", "pag: " + qtPaginas);
            } catch (Exception ignores) {
            }

            pontos += qtPaginas ;

            SharedPrefUtils.savePontos(this, pontos + 1);

            Log.d("mayara", "final: " + (pontos + 1));
        });


    }
}