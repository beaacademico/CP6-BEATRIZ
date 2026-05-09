package br.com.streaming.modelo;

public abstract class ItemReproducao {

    protected String titulo;
    protected int duracao;

    public ItemReproducao(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public abstract void exibirInfo();
}