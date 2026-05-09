package br.com.streaming.util;

public class Validador {

    public static boolean textoValido(String texto) {
        return texto != null && !texto.isEmpty();
    }
}