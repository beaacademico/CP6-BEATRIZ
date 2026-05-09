package br.com.streaming.modelo;

public abstract class Usuario {

    protected String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public abstract void exibirPlano();
}