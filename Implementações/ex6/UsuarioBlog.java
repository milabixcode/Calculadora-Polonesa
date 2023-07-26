package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex6;

public class UsuarioBlog {
    private String email;

    public UsuarioBlog(String email) {
        this.email = email;
    }

    public void notificarExclusao(Conteudo conteudo) {
        System.out.println("Usuário " + email + " foi notificado da exclusão de '" + conteudo + "'");
    }
}
