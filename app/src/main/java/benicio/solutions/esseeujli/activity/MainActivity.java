package benicio.solutions.esseeujli.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import benicio.solutions.esseeujli.util.WindowUtils;
import benicio.solutions.esseeujli.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        WindowUtils.configWindow(this);


        mainBinding.logar.setOnClickListener(v -> {
            String login, senha;

            login = mainBinding.login.getText().toString().trim();
            senha = mainBinding.senha.getText().toString().trim();

            if (login.equals("teste") && senha.equals("123")) {
                Toast.makeText(this, "Bem-vindo de volta!", Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(this, LivrosActivity.class));
            } else {
                Toast.makeText(this, "Login ou Senha Incorreto!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}