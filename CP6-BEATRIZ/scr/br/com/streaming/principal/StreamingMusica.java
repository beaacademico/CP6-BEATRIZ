package br.com.streaming.principal;

import br.com.streaming.modelo.*;

public class StreamingMusica {

    public static void main(String[] args) {

        Musica m1 = new Musica(
            "Numb",
            210,
            "Linkin Park"
        );

        Playlist playlist = new Playlist("Rock");

        playlist.adicionarMusica(m1);

        UsuarioPremium premium =
            new UsuarioPremium("Beatriz");

        m1.reproduzir();

        premium.baixar(m1);

        System.out.println(
            "Downloads: " +
            premium.getTamanhoBaixados()
        );
    }
}