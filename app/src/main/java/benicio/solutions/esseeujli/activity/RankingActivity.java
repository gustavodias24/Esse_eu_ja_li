package benicio.solutions.esseeujli.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import benicio.solutions.esseeujli.R;
import benicio.solutions.esseeujli.adapter.AdapterUsuario;
import benicio.solutions.esseeujli.databinding.ActivityLivrosBinding;
import benicio.solutions.esseeujli.databinding.ActivityRankingBinding;
import benicio.solutions.esseeujli.model.UsuarioModel;
import benicio.solutions.esseeujli.util.WindowUtils;

public class RankingActivity extends AppCompatActivity {

    private ActivityRankingBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityRankingBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        WindowUtils.configWindow(this);


        mainBinding.rvUsuarios.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.rvUsuarios.setHasFixedSize(true);
        mainBinding.rvUsuarios.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        List<UsuarioModel> lista = new ArrayList<>();

        lista.add(new UsuarioModel(
                "Pedro de Souza",
                "600",
                "Leitor de Documentário, Leitor de Ficção"
        ));

        lista.add(new UsuarioModel("Joana Silva", "800", "Leitor de Romance, Leitor de Biografia"));
        lista.add(new UsuarioModel("Marcos Oliveira", "1000", "Leitor de Ficção Científica"));
        lista.add(new UsuarioModel("Ana Santos", "1200", "Leitor de Suspense, Leitor de Romance"));
        lista.add(new UsuarioModel("Carla Mendes", "1500", "Leitor de Mistério, Leitor de Aventura"));
        lista.add(new UsuarioModel("Rafael Lima", "1800", "Leitor de História, Leitor de Poesia"));
        lista.add(new UsuarioModel("Juliana Pereira", "2100", "Leitor de Fantasia, Leitor de Autoajuda"));
        lista.add(new UsuarioModel("Lucas Almeida", "2500", "Leitor de Drama, Leitor de Clássico"));
        lista.add(new UsuarioModel("Amanda Ferreira", "3000", "Leitor de Conto, Leitor de Espiritualidade"));
        lista.add(new UsuarioModel("Gustavo Santos", "3500", "Leitor de Comédia, Leitor de Negócios"));


        Collections.reverse(lista);

        mainBinding.rvUsuarios.setAdapter(new AdapterUsuario(lista, this));



    }
}