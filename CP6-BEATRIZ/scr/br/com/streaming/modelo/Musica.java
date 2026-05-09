package br.com.streaming.modelo;

import br.com.streaming.servico.Reproduzivel;

public class Musica extends ItemReproducao implements Reproduzivel {

    private String artista;

    public Musica(String titulo, int duracao, String artista) {
        super(titulo, duracao);
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public int getDuracaoTotal() {
        return duracao;
    }

    @Override
    public void exibirInfo() {
        System.out.println(titulo + " - " + artista);
    }
}