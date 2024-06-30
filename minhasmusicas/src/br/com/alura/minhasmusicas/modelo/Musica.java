package br.com.alura.minhasmusicas.modelo;

public class Musica extends Audio{
    private String apresentador;
    private String descicao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    @Override
    public int getClassificacao() {
        if (getTotalDeReproducoes() >= 2000) {
            return 10;
        }else {
            return 7;
        }
    }
}
