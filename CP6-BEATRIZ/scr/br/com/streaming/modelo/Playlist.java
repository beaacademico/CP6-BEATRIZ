package br.com.streaming.modelo;

import java.util.ArrayList;
import br.com.streaming.servico.Reproduzivel;

public class Playlist extends ItemReproducao implements Reproduzivel {

    private ArrayList<Musica> musicas;

    public Playlist(String titulo) {
        super(titulo, 0);
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo playlist: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Playlist pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Playlist parada.");
    }

    @Override
    public int getDuracaoTotal() {

        int total = 0;

        for (Musica musica : musicas) {
            total += musica.getDuracao();
        }

        return total;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Playlist: " + titulo);
    }
}