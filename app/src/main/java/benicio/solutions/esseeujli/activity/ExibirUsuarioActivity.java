package benicio.solutions.esseeujli.activity;

import android.os.Bundle;
import android.text.Html;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import benicio.solutions.esseeujli.R;
import benicio.solutions.esseeujli.databinding.ActivityExibirUsuarioBinding;
import benicio.solutions.esseeujli.databinding.ActivityRankingBinding;
import benicio.solutions.esseeujli.model.UsuarioModel;
import benicio.solutions.esseeujli.util.WindowUtils;

public class ExibirUsuarioActivity extends AppCompatActivity {

    private ActivityExibirUsuarioBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityExibirUsuarioBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        WindowUtils.configWindow(this);

        UsuarioModel user = (UsuarioModel) getIntent().getSerializableExtra("user");

        StringBuilder infoBuilder = new StringBuilder();

        infoBuilder.append("<b>Informações</b>").append("<br>");
        infoBuilder.append("<b>Nome: </b>").append(user.getNome()).append("<br>");
        infoBuilder.append("<b>Pontos: </b>").append(user.getPontos()).append("<br>");
        infoBuilder.append("<b>Troféus: </b>").append(user.getTrofeus()).append("<br>");

        mainBinding.textInfosUser.setText(Html.fromHtml(infoBuilder.toString()));
    }
}