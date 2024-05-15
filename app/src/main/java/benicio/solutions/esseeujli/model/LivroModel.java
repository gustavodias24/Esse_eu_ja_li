package benicio.solutions.esseeujli.model;

import java.io.Serializable;

public class LivroModel implements Serializable {

    String foto;
    String titulo, descricao;
    int paginas;

    String genero;

    public LivroModel(String foto, String titulo, String descricao, int paginas, String genero) {
        this.foto = foto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.paginas = paginas;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LivroModel() {
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
