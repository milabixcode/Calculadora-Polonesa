package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Blog {
    private Date dataCriacao;
    private String titulo;
    private UsuarioBlog dono;
    private ArrayList<Conteudo> conteudos;

    public Blog(Date dataCriação, String titulo, UsuarioBlog donoBlog) {
        this.dataCriacao = dataCriação;
        this.titulo = titulo;
        this.dono = donoBlog;
        this.conteudos = new ArrayList<>();
    }

    public void criarNota(Nota nota) {
        conteudos.add(nota);
    }

    public void exibirConteudo() {
        System.out.println("Conteudos do blog: ");
        for (Conteudo conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }

    public void comentar(Comentario comentario) {
        conteudos.add(comentario);
    }

    public List<Comentario> lerComentarios() {
        List <Comentario> comentarios = new ArrayList<>();
        System.out.println("Comentários do blog: ");
        for (Conteudo conteudo : conteudos) {
            if (conteudo instanceof Comentario) {
                comentarios.add((Comentario) conteudo);
            }
        }
        return comentarios;
    }

    public List<Nota> lerNotas() {
        List <Nota> notas = new ArrayList<>();
        System.out.println("Notas do blog: ");
        for (Conteudo conteudo : conteudos) {
            if (conteudo instanceof Nota) {
                notas.add((Nota) conteudo);
            }
        }
        return notas;
    }

    public void removerConteudo(Conteudo conteudo){
        conteudos.remove(conteudo);
        conteudo.getAutor().notificarExclusao(conteudo);
    }

}
