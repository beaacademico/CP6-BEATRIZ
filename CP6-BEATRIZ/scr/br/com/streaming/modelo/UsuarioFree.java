package br.com.streaming.modelo;

public class UsuarioFree extends Usuario {

    public UsuarioFree(String nome) {
        super(nome);
    }

    @Override
    public void exibirPlano() {
        System.out.println("Plano Free");
    }
}