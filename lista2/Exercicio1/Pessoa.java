package lista2.Exercicio1;

public class Pessoa {
    private String nome;
    private int idade;
    //tipo pessoa pai
    public Pessoa pai;
    //tipo pessoa mãe
    public Pessoa mae;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public Pessoa getPai(){
        return this.pai;
    }

    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    public Pessoa getMae(){
        return this.mae;
    }

    public void setMae(Pessoa mae){
        this.mae = mae;
    }

}
