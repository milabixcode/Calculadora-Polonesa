package lista1.Exercicio20;

public class Contato {
    private String nome;
    private int telefone;

    public Contato(String nomeContato, int telefoneContato){
        nome = nomeContato;
        telefone = telefoneContato;
    }
    public String GetNome(){
        return this.nome;
    }
    public int GetTelefone(){
        return this.telefone;
    }    
}
