package lista1.Exercicio20;

public class Agenda {
    private Contato[] contatos;
    private int indice;
    private int contador;

    public Agenda(int qtdContatos){
        contatos = new Contato[qtdContatos];
        indice = 0;
        contador = 0;
    }
    public void SetContato(Contato contato){
        contatos[indice++] = contato;
    }
    public void ResetIndice(){
        this.indice = 0;
    }
    public void ResetContador(){
        this.contador = 0;
    }
    public String GetNome(){
        return contatos[indice].GetNome();
    }
    public int GetTelefone(){
        return contatos[indice++].GetTelefone();    
    }
    public Contato[] AddContato(String nome, int telefone, int qtdContatos){
        Contato novoContato = new Contato(nome, telefone);
        Contato[] contatosAux = new Contato[++qtdContatos];
        contatosAux = contatos;
        contatosAux[--qtdContatos] = novoContato;
        return contatosAux;
    }
    public Contato[] removeContatos(int telefone, int qtdContatos){
        Contato[]contatosAux = new Contato[--qtdContatos];
        while(contatos[indice] != null){
            if(contatos[indice++].GetTelefone() != telefone) {
                contatosAux[contador++] = contatos[indice];
            }
        }
        return contatosAux;
    }
    
}
