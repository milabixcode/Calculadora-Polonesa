package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex6;

import java.util.Date;

public class Conteudo {
    private Date dtCriacao;
    private String texto;
    private UsuarioBlog autor;

    public Conteudo(java.util.Date dtCriacao, String texto, UsuarioBlog autor) {
        this.dtCriacao = dtCriacao;
        this.texto = texto;
        this.autor = autor;
    }

    public void exibirConteudo() {
        System.out.println("Data de criação:\n " + dtCriacao);
        System.out.println(texto + "\n");
        System.out.println("Autor: \n" + autor);
    }

    public UsuarioBlog getAutor() {
        return autor;
    }
}
