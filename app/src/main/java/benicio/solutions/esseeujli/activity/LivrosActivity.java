package benicio.solutions.esseeujli.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import benicio.solutions.esseeujli.adapter.AdapterLivro;
import benicio.solutions.esseeujli.adapter.SharedPrefUtils;
import benicio.solutions.esseeujli.model.LivroModel;
import benicio.solutions.esseeujli.util.WindowUtils;
import benicio.solutions.esseeujli.databinding.ActivityLivrosBinding;

public class LivrosActivity extends AppCompatActivity {

    private ActivityLivrosBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityLivrosBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        WindowUtils.configWindow(this);

        mainBinding.rvLivros.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.rvLivros.setHasFixedSize(true);
        mainBinding.rvLivros.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        List<LivroModel> listaLivros = new ArrayList<>();

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/815UAcSgz9L._SY425_.jpg",
                "A favela venceu: De um povo heroico o brado retumbante",
                "Se você acha que está tendo dificuldades na vida, precisa ler este livro. Com as lições que a favela nos dá dia após dia, reinventando-se, criando, fazendo muito com pouco e empreendendo com recursos escassos, Rick Chesther nos mostra como, a partir do zero, ou do “menos um”, é possível sair da inércia e vencer na vida. A favela venceu traz uma favela que inspira pela coragem, pela força de vontade, pela esperança, pela fé e pelo brilho no olhar. Traz a favela que não se acovarda, que não desiste, que passa por perrengues, mas que se sacode para poder ter dignidade e então criar uma história nova, mesmo nos momentos de maior dor. Este livro mostra que a próxima batalha sempre existirá, mas que precisamos aprender a considerar as tantas vitórias que podem estar passando despercebidas por muitos. A favela venceu é uma lição de vida para quem quer se reerguer, lutar e criar novas possibilidades, contando com gente de verdade que não abandona o outro no meio da batalha. Um livro para entender a mentalidade de “fazer com” na era onde ninguém pode contar com ninguém. Um livro para decifrar que “quando se sabe onde o calo aperta”, qualquer pessoa é capaz de tirar um sonho do papel e fazer milagre pra colocar comida na mesa, e desse sonho criar algo novo, inspirar pessoas e prosperar. Um livro para buscar força nas dificuldades e entender o verdadeiro conceito de “vencer na vida”. Um livro escrito por gente simples, que estuda em uma universidade chamada “Faculdade da Vida”. A favela venceu é um hino a ser celebrado por todos nós, que temos sangue correndo nas veias e não desistimos.",
                500,
                "Documentário"
        ));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/61ADld0OCOL._SY425_.jpg",
                "Murdle: Volume 1: 100 mistérios, de básicos a impossíveis, para solucionar usando a lógica, a habilidade e o poder de dedução",
                "Best-seller internacional, livro-jogo com 100 mistérios, de básicos a impossíveis, para solucionar usando a lógica, a habilidade e o poder de dedução chega ao Brasil\n" +
                        "\n" +
                        "Vem aí o livro interativo do momento! Junte-se ao dedutivo Logicus e investigue os mais terríveis assassinatos em Murdle: Volume 1 . Diferente de tudo que existe, aqui estão reunidos cem enigmas de mistério curtos e divertidos que desafiam o leitor a descobrir quem matou, com que arma, onde e por quê. Analise as pistas, entreviste as testemunhas e use o poder de dedução para completar o quadro e capturar o culpado. Juntos, você e Logicus vão encontrar muitos segredos. E, à medida que os casos forem solucionados, uma trama maior será descortinada.\n" +
                        "\n" +
                        "Repleto de ilustrações, códigos e mapas, além de bem-humorado e intrigante, Murdle: Volume 1 é o livro perfeito para o detetive que existe dentro de cada um de nós."
                , 460, "Documentário"));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/51N0HwyK5UL._SX342_SY445_.jpg",
                "O Pequeno Príncipe: – para crianças pequenas",
                "O clássico de Antoine de Saint-Exupéry adaptado para livro ilustrado infantil\n" +
                        "\n" +
                        "Conheça um piloto perdido no deserto, uma rosa vaidosa habitando um planeta frio e um pequeno príncipe que parte em uma viagem estranha e extraordinária por diversos planetas até encontrar a Terra, onde finalmente conhece a verdadeira natureza do amor.\n" +
                        "\n" +
                        "Os personagens memoráveis de Antoine de Saint-Exupéry que conquistaram os corações de gerações de leitores agora ganham vida em um livro adaptado pela poeta Louise Greig e com as encantadoras ilustrações de Sarah Massini.",
                670,
                "Infantil"
        ));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/61I+oXXpb7L._SY425_.jpg",
                "Um dia muito mal-humorado Capa comum",
                "Uma grande onde de mau humor está se espalhando pela floresta! Começa com o urso, aborrece a toupeira... que se exalta com o ouriço, que é espinhoso com a raposa. Logo o mau humor do urso deixou todo mundo mal-humorado! será que um pouquinho de amor pode deixar todos felizes de novo?",
                400,
                "Infantil"
        ));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/41YCdplWZ4L._SY445_SX342_.jpg",
                "Bem lá no alto",
                "Neste livro, um urso avista um bolo. Ele parece muito apetitoso. Mas, puxa, está bem lá no alto... Como o urso vai conseguir pegá-lo? Um livro para crianças bem pequenas em que se mostra o quanto é bom poder contar com a ajuda dos amigos e de acontecimentos inesperados.",
                200,
                "Infantil"
        ));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/615c3rVH5ML._SY425_.jpg",
                "Ayrton: o herói revelado ",
                "Tive o privilégio de acompanhar de perto, desde 1972, a Fórmula 1 e a saga dos brasileiros na categoria mais importante do automobilismo mundial. Em 2004, depois de ler Ayrton: o herói revelado , ficou claro que a biografia escrita por Ernesto Rodrigues era o retrato mais completo, preciso e emocionante da trajetória de Ayrton Senna.\n" +
                        "\n" +
                        "Ninguém mergulhou com tanta sensibilidade, elegância e espírito jornalístico na história do gênio cuja vida eu acompanhei desde 1982, quando ele assombrou os autódromos ingleses nas disputas da Fórmula Ford, até aquele terrível 1º de maio de 1994, o dia em que todos ficamos órfãos de seu talento e carisma.\n" +
                        "\n" +
                        "Frequentemente, quando me perguntam sobre momentos específicos da minha vida ao lado do Ayrton, a única resposta que vem à mente é: “leia o livro do Ernesto Rodrigues”. E agora, enquanto escrevo as minhas memórias, Ayrton: o herói revelado é fonte de consulta valiosa, graças à profundidade da pesquisa e à forma de expor do meu amigo Ernesto.\n" +
                        "\n" +
                        "Vinte anos depois, ao ler a edição atualizada do livro, constato não apenas que eu estava certo quando apostei que ninguém faria uma biografia tão completa. Verifico, com prazer, passados trinta anos da perda de Senna, que, além da veracidade, permanência e relevância do que Ernesto escreveu em 2004, ele agora nos brinda uma atualização e uma contextualização do livro que abrange os acontecimentos significativos ocorridos depois de Ayrton, tanto na Fórmula 1 quanto no Brasil. Ayrton: o herói revelado , assim como Senna, continua importante, emocionante e inesquecível.",

                800,
                "Documentário"
        ));

        listaLivros.add(new LivroModel(
                "https://m.media-amazon.com/images/I/41SGfZLuKQL._SY425_.jpg",
                "Minha Garota",
                "Ao longo de quatro anos de namoro, Adriane viu o seu Beco se transformar. O piloto desconhecido deu lugar a uma das celebridades mais bem pagas do mundo. O garotão extrovertido era agora um homem sério e sobrecarregado. Viagens, paparazzi, aviões particulares. Iates, premiações, contratos milionários. Uma legião de fãs enlouquecidas. Assédio constante por parte das mulheres mais cobiçadas do mundo. Durante os altos e baixos da carreira meteórica de Ayrton, era Adriane quem permanecia ao seu lado, sempre discreta. Por trás das câmeras, era ela quem conhecia a face mais humana do ídolo mundial. Se é verdade que as pessoas mais próximas a nós são aquelas que nos moldam, Adriane Yamin - a namorada que Senna nunca expos à imprensa – cumpriu boa parte na construção da face mais humana do ídolo mundial. Agora, após 30 anos de silêncio, chegou a hora de contar, em suas próprias palavras, o começo, o meio e o fim do relacionamento que para sempre mudou sua trajetória e deixou marcas indeléveis em seu coração.",
                650,
                "Documentário"
        ));


        mainBinding.rvLivros.setAdapter(new AdapterLivro(listaLivros, this));
        mainBinding.verRank.setOnClickListener(v -> startActivity(new Intent(this, RankingActivity.class)));

    }

    @Override
    protected void onResume() {
        super.onResume();

        StringBuilder builderInfos = new StringBuilder();
        builderInfos.append("Informações.").append("\n");
        builderInfos.append("Pontos: ").append(SharedPrefUtils.returnPontos(this)).append("\n");
        builderInfos.append("Troféus: ").append(SharedPrefUtils.returnTrofeus(this)).append("\n");
        mainBinding.infos.setText(builderInfos.toString());
    }
}