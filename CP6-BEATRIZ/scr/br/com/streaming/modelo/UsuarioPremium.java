package br.com.streaming.modelo;

import java.util.ArrayList;

import br.com.streaming.servico.Baixavel;

public class UsuarioPremium extends Usuario implements Baixavel {

    private ArrayList<Musica> downloads;

    public UsuarioPremium(String nome) {
        super(nome);
        downloads = new ArrayList<>();
    }

    @Override
    public void baixar(Musica musica) {
        downloads.add(musica);
        System.out.println("Download realizado.");
    }

    @Override
    public void removerDownload(Musica musica) {
        downloads.remove(musica);
    }

    @Override
    public boolean estaBaixada(Musica musica) {
        return downloads.contains(musica);
    }

    @Override
    public int getTamanhoBaixados() {
        return downloads.size();
    }

    @Override
    public void exibirPlano() {
        System.out.println("Plano Premium");
    }
}