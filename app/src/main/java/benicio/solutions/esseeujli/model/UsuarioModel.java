package benicio.solutions.esseeujli.model;

import java.io.Serializable;

public class UsuarioModel implements Serializable {

    String nome, pontos, trofeus;

    public UsuarioModel(String nome, String pontos, String trofeus) {
        this.nome = nome;
        this.pontos = pontos;
        this.trofeus = trofeus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getTrofeus() {
        return trofeus;
    }

    public void setTrofeus(String trofeus) {
        this.trofeus = trofeus;
    }
}
