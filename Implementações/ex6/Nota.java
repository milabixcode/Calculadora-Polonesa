package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Nota extends Conteudo {
    private ArrayList<Comentario> comentarios;

    public Nota(Date dtcriacao, String texto, UsuarioBlog autor) {
        super(dtcriacao, texto, autor);
        this.comentarios = new ArrayList<>();
    }

    public void comentar(Comentario comentario) {
        comentarios.add(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Nota sendo removida da memória");
    }
}
