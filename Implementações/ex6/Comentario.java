package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex6;

public class Comentario extends Conteudo {
    public Comentario(java.util.Date dtCriacao, String texto, UsuarioBlog autor) {
        super(dtCriacao, texto, autor);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Comentário sendo removido da memória");
    }
}
